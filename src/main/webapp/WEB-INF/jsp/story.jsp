<%-- 
    Document   : story
    Created on : 8 oct. 2024, 09:21:18
    Author     : sid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stories</title>
        <link type="text/css" rel="stylesheet" 
              href="<c:url value='/assets/css/style.css'/>" />
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        
        <section id="stories">
            <h2>Voici la liste des histoires</h2>
            <c:forEach 
                items="${requestScope.stories}" 
                var="story">
                <article>
                    <h3>${story.title}</h3>
                    <div>Histoire créée le ${story.created} par ${story.name}</div>
                    <div>${story.content}</div>
                </article>
            </c:forEach>
        </section>
        
        <%@include file="../jspf/footer.jspf" %>
    </body>
</html>