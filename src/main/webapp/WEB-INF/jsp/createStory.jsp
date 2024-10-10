<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create Story</title>
</head>
<body>
    <h2>Create a New Story</h2>

    <c:if test="${not empty errors}">
        <div class="errors">
            <ul>
                <c:forEach var="error" items="${errors.values()}">
                    <li>${error}</li>
                </c:forEach>
            </ul>
        </div>
    </c:if>

    <form action="<c:url value='/story/create'/>" method="post">
        <div>
            <label for="title">Title:</label>
            <input type="text" id="title" name="title" required>
        </div>
        <div>
            <label for="content">Content:</label>
            <textarea id="content" name="content" required></textarea>
        </div>
        <div>
            <button type="submit">Create Story</button>
        </div>
    </form>
</body>
</html>
