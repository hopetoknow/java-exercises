package exercise.servlet;

import exercise.TemplateEngineUtil;
import exercise.Users;
import org.apache.commons.lang3.ArrayUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

import static exercise.App.getUsers;

public class UsersServlet extends HttpServlet {

    private final Users users = getUsers();

    private String getId(HttpServletRequest request) {
        String pathInfo = request.getPathInfo();
        if (pathInfo == null) {
            return null;
        }
        String[] pathParts = pathInfo.split("/");
        return ArrayUtils.get(pathParts, 1, null);
    }

    private String getAction(HttpServletRequest request) {
        String pathInfo = request.getPathInfo();
        if (pathInfo == null) {
            return "list";
        }
        String[] pathParts = pathInfo.split("/");
        return ArrayUtils.get(pathParts, 2, getId(request));
    }

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException {

        String action = getAction(request);

        switch (action) {
            case "list" -> showUsers(request, response);
            case "new" -> newUser(request, response);
            default -> response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    @Override
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException {

        String action = getAction(request);

        if ("list".equals(action)) {
            createUser(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    private void showUsers(HttpServletRequest request,
                          HttpServletResponse response)
                throws IOException {

        request.setAttribute("users", users.getAll());
        TemplateEngineUtil.render("users/index.html", request, response);
    }

    private void newUser(HttpServletRequest request,
                         HttpServletResponse response)
                 throws IOException {

        Map<String, String> user = users.build();

        request.setAttribute("user", user);
        request.setAttribute("error", "");

        TemplateEngineUtil.render("users/new.html", request, response);
    }

    private void createUser(HttpServletRequest request,
                         HttpServletResponse response)
                 throws IOException {

        HttpSession session = request.getSession();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        Map<String, String> user = users.build(firstName, lastName, email);

        if (firstName.isEmpty() || lastName.isEmpty()) {
            request.setAttribute("user", user);
            session.setAttribute("flash", "First and last names cannot be empty");
            response.setStatus(422);
            TemplateEngineUtil.render("users/new.html", request, response);
            return;
        }

        users.add(user);
        session.setAttribute("flash", "User was successfully created");
        response.sendRedirect("/users");
    }
}
