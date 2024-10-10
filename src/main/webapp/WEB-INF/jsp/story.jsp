
<%--author : Sid --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${story.title}</title>
        <link type="text/css" rel="stylesheet" 
              href="<c:url value="/assets/css/style.css"/>" />
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        
        <section id="story">
            <h2>${story.title}</h2>
            <div>Nouvelle écrite le ${story.created} par ${story.name}</div>
            <div>${story.content}</div>
        </section>
        
        <%--author : Florine Pérabout--%>
        
        
        
        <%@include file="../jspf/footer.jspf" %>
    </body>
</html>
