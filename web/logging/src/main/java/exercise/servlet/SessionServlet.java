package exercise.servlet;

import exercise.LoggerFactory;
import exercise.TemplateEngineUtil;
import exercise.Users;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import static exercise.App.getUsers;

public class SessionServlet extends HttpServlet {

    private final Users users = getUsers();

    // Получаем экземпляр логгера
    private static final Logger LOGGER = LoggerFactory.getLogger(SessionServlet.class);

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException {

        if (request.getRequestURI().equals("/login")) {
            showLoginPage(request, response);
            return;
        }

        response.sendError(HttpServletResponse.SC_NOT_FOUND);
    }

    @Override
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException {

        switch (request.getRequestURI()) {
            case "/login" -> login(request, response);
            case "/logout" -> logout(request, response);
            default -> response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    private void showLoginPage(HttpServletRequest request,
                               HttpServletResponse response)
                 throws IOException {

        Map<String, String> user = users.build();
        request.setAttribute("user", user);
        TemplateEngineUtil.render("session/login.html", request, response);
    }

    private void login(HttpServletRequest request,
                               HttpServletResponse response)
                 throws IOException {

        HttpSession session = request.getSession();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Map<String, String> userData = users.build(email);

        Map<String, String> user = users.findByEmail(email);

        // BEGIN
        LOGGER.log(Level.INFO, email + " tried to log in");
        // END

        if (user == null || !user.get("password").equals(password)) {
            request.setAttribute("user", userData);
            session.setAttribute("flash", "Incorrect username or password");
            response.setStatus(422);
            TemplateEngineUtil.render("session/login.html", request, response);
            return;
        }

        session.setAttribute("userId", user.get("id"));
        session.setAttribute("flash", "You have successfully logged in");
        response.sendRedirect("/");
    }

    private void logout(HttpServletRequest request,
                               HttpServletResponse response)
                 throws IOException {

        HttpSession session = request.getSession();
        session.removeAttribute("userId");
        session.setAttribute("flash", "You have successfully logged out");
        response.sendRedirect("/");
    }
}
