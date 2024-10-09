<%-- 
    Document   : signup
    Created on : 8 oct. 2024, 09:20:14
    Author     : Caroline
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" 
              href="<c:url value="/assets/css/style.css"/>" />
    </head>
    <body>
        <%@include file="../jspf/header.jspf" %>
        <form method="post" action="<c:url value="/signup"/>">
            <fieldset>
                <legend>Inscription</legend>
                <label for="username">
                    Nom d'utilisateur <span class="mandatory">*</span>
                </label>
                <input type="text" id="username" name="username" 
                       value="<c:out value="${requestScope.person.name}"/>"
                       size="20" maxlength="20" />
                <label for="email">
                    Adresse email <span class="mandatory" >*</span>
                </label>
                <input type="text" id="email" name="email" 
                       value="<c:out value="${requestScope.bean.login}"/>"
                       size="20" maxlength="40"/>
                <label for="password">
                    Mot de passe <span class="mandatory">*</span>
                </label>
                <input type="password" id="password" name="password"
                       value="" size="20" maxlength="20"/>
                <label for="confirm">
                    Confirmation <span class="mandatory">*</span>
                </label>
                <input type="password" id="confirm" name="confirm" value=""
                       size="20" maxlength="20"/>
                <input type="submit" value="Inscription" class="noLabel" />
                <p><span class="mandatory">*</span>Champs obligatoires</p>
            </fieldset>
        </form>
        <%@include file="../jspf/footer.jspf" %>
    </body>
</html>
