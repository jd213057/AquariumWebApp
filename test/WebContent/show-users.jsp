<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users's List</title>
</head>
<body>
<h2> Voici la liste des utilisateurs enregistrés :</h2>
<table>
<c:forEach items="${utilisateurs}" var ="utilisateur">
<tr><td> ${utilisateur.nom} </td>
   <td>${utilisateur.prenom}</td> 
   <td> ${utilisateur.age} </td> <td><a href = "UserInfoServlets?id=${utilisateur.id}"> Voir Activités </a><a href = "UpdateUserServlets?id=${utilisateur.id}">Modifier</a> <a href = "DeleteUserServlets?id=${utilisateur.id}">Supprimer</a> </td>
 </tr>
   </c:forEach>
</table>
<a href="index.jsp">Retour</a>

</body>
</html>