<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Savings</title>
</head>
<body>
<h2> Voici tous les enregistrements :</h2>
<table>
<c:forEach items="${aquarium}" var ="aquarium">
<tr><td> ${aquarium.nameRecord} </td>
   <td>${aquarium.derniereMaintenance}</td> 
   <td> ${aquarium.prochaineMaintenance} </td> <td><a href = "AquariumInfoServlets?id=${aquarium.id}"> Afficher plus d'informations </a><a href = "UpdateAquariumServlets?id=${aquarium.id}">Modifier</a> <a href = "DeleteAquariumServlets?id=${aquarium.id}">Supprimer</a> </td>
 </tr>
   </c:forEach>
</table>
<a href="index.jsp">Retour</a>

</body>
</html>