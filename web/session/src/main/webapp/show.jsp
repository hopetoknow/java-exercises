<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tag:application>
    <h1>User data</h1>
    <div class="card">
        <ul class="list-group list-group-flush">
            <li class="list-group-item">id: ${user.get("id")}</li>
            <li class="list-group-item">Full name: ${user.get("firstName")} ${user.get("lastName")}</li>
            <li class="list-group-item">Email: ${user.get("email")}</li>
        </ul>
        <div class="card-footer">
            <a class="btn btn-primary" href='/users/edit?id=${user.get("id")}'>Edit</a>
            <a class="btn btn-primary" href='/users/delete?id=${user.get("id")}'>Delete</a>
        </div>
    </div>
</tag:application>
