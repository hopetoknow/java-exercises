<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<tag:application>
    <h1>Editing a user</h1>
    <form action='/users/edit?id=${user.get("id")}' method="post">
        <div class="mb-3">
            <label>First name</label>
            <input class="form-control" type="text" name="firstName" value='${user.get("firstName")}'>
        </div>
        <div class="mb-3">
            <label>Last name</label>
            <input class="form-control" type="text" name="lastName" value='${user.get("lastName")}'>
        </div>
        <div class="mb-3">
            <label>Email</label>
            <input class="form-control" type="email" name="email" value='${user.get("email")}'>
        </div>
        <button class="btn btn-primary" type="submit">Edit</button>
    </form>
</tag:application>
