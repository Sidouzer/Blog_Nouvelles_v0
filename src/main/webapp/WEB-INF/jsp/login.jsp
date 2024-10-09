<%-- 
    Document   : login
    Created on : 8 oct. 2024, 09:20:03
    Author     : Caroline Casteras
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Connexion</title>
        <link type="text/css" rel="stylesheet" 
              href="<c:url value="/assets/css/style.css"/>" />
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        <form method="post" action="<c:url value="/login"/>">
            <fieldset>
                <legend>Connexion</legend>
                <label for="email">
                    Adresse email
                    <span class="mandatory" >*</span>
                </label>
                <input type="text" id="email" name="email" 
                       value="<c:out value="${requestScope.bean.login}"/>"
                       size="20" maxlength="40"/>
                <label for="password">
                    Mot de passe 
                    <span class="mandatory">*</span>
                </label>
                <input type="password" id="password" name="password"
                       value="" size="20" maxlength="20"/>
                <input type="submit" value="Connexion" class="noLabel"/>
                <p>
                    <span class="mandatory">*</span>
                    Champs obligatoires
                </p>
            </fieldset>
        </form>
        <%@include file="../jspf/footer.jspf" %>
    </body>
</html>

