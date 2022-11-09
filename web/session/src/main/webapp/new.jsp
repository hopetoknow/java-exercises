<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<tag:application>
    <h1>Creating a new user</h1>
    <form action="/users/new" method="post">
        <div class="mb-3">
            <label>First name</label>
            <input class="form-control" type="text" name="firstName" value='${user.getOrDefault("firstName", "")}'>
        </div>
        <div class="mb-3">
            <label>Last name</label>
            <input class="form-control" type="text" name="lastName" value='${user.getOrDefault("lastName", "")}'>
        </div>
        <div class="mb-3">
            <label>Email</label>
            <input class="form-control" type="email" name="email">
        </div>
        <button class="btn btn-primary" type="submit">Create a new user</button>
    </form>
</tag:application>
