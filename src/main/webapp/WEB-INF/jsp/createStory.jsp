<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulaire de création d'une nouvelle</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/assets/css/style.css' />" />
</head>
<body>
    <h2>Créer une nouvelle</h2>

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
            <label for="title">Titre</label>
            <input type="text" id="title" name="title" required>
        </div>
        <div>
            <label for="content">Corps</label>
            <textarea id="content" name="content" required></textarea>
        </div>
        <div>
            <button type="submit">Créer la nouvelle</button>
        </div>
    </form>
</body>
</html>
