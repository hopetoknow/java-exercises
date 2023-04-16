<%@tag description="Layout" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Welcome</title>
        <meta charset="UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
            crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="/">Main page</a>
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/users">Users</a>
                    </li>
                </ul>
                <ul class="navbar-nav">
                    <c:choose>
                        <c:when test='${sessionScope.userId != null}'>
                            <form action='/logout' method="post">
                                <button type="submit" class="btn btn-link nav-link">Sign out</button>
                            </form>
                        </c:when>
                        <c:otherwise>
                            <li class="nav-item">
                                <a class="nav-link" href="/users/new">Sign up</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/login">Sign in</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </nav>
        <div class="container mt-3">
            <!-- BEGIN -->
            <c:if test="${sessionScope.flash != null}">
                <div class="alert alert-info" role="alert">
                    <c:out value="${sessionScope.flash}"/>
                    <% session.removeAttribute("flash"); %>
                </div>
            </c:if>
            <!-- END -->
            <jsp:doBody />
        </div>
    </body>
</html>
