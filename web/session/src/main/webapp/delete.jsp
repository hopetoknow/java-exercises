<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<tag:application>
    <h1>Deleting a user</h1>
    <p>Are you sure you want to delete user ${user.get("firstName")} ${user.get("lastName")}?</p>

    <form action='/users/delete?id=${user.get("id")}' method="post">
        <button type="submit" class="btn btn-danger">Yes, delete</button>
    </form>
</tag:application>
