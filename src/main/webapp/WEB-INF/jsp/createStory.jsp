<%-- 
    Document   : createStory
    Created on : 8 oct. 2024, 09:21:27
    Author     : sid
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create a Short Story</title>
        <link type="text/css" rel="stylesheet" 
              href="<c:url value='/assets/css/style.css' />" />
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>

        <section id="create-story">
            <h2>Create a New Short Story</h2>

            <!-- Formulaire pour créer une nouvelle histoire -->
            <form action="<c:url value='/CreateStoryServlet' />" method="post">
                <div class="form-group">
                    <label for="title">Title:</label>
                    <input type="text" id="title" name="title" required>
                </div>

                <div class="form-group">
                    <label for="content">Content:</label>
                    <textarea id="content" name="content" rows="10" cols="50" required></textarea>
                </div>

                <div class="form-group">
                    <button type="submit">Create Story</button>
                </div>
            </form>
        </section>

        <%@include file="../jspf/footer.jspf" %>
    </body>
</html>