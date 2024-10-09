<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link type="text/css" rel="stylesheet" 
              href="<c:url value="/assets/css/style.css"/>" />
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        <section id="homeTop3">
            <h2>Voici le top 3 des nouvelles de la semaine :</h2>
            <!--Conditions des 3 meilleures notes et sur les 7 derniers jours à prévoir-->
            <c:forEach items="${requestScope.story}" var="story" begin="${fn:length(requestScope.story) - 3}" end="${fn:length(requestScope.story) - 1}"> <!--pour les 3 derniers-->
                <article>
                    <h3>${story.title}</h3>
                    <div>Nouvelle écrite le ${story.created} par ${story.name}</div>
                    <div>${story.content}</div>
                    <div>${vote.quality}</div>  <!--Quality-->
                </article>
            </c:forEach>
        </section>
                <section id="homeStories10">
            <h2>Voici le résumé des 10 dernières nouvelles :</h2>
            <!--afficher que les 200 premiers caractères-->
            <c:forEach items="${requestScope.story}" var="story" begin="${fn:length(requestScope.story) - 10}" end="${fn:length(requestScope.story) - 1}"> <!--pour les 3 derniers-->
                <article>
                    <h3>${story.title}</h3>
                    <div>Nouvelle écrite le ${story.created} par ${story.name}</div>
                    <div>${fn:substring(story.content, 0, 200)}</div>
                    <div>${vote.quality}</div>  <!--Quality-->
                </article>
            </c:forEach>
        </section>
        <%@include file="../jspf/footer.jspf" %>
    </body>
</html>
