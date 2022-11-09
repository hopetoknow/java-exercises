<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<tag:application>
    <h1>Sign in</h1>
    <form action="/login" method="post">
        <div class="mb-3">
            <label>Email</label>
            <input class="form-control" type="email" name="email" value='${user.getOrDefault("email", "")}'>
        </div>
        <div class="mb-3">
            <label>Password</label>
            <input class="form-control" type="password" name="password">
        </div>
        <button class="btn btn-primary" type="submit">Sign in</button>
    </form>
</tag:application>
