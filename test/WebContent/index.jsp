<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>
.h3 {
align="center";
color="red";
font-style: italic;
}]
.input{align-itemst:right;}
</style>
</head>
<body style="background-color:#5DADE2;">
<header>
<div> 
<h2> Page d'acceuil - AquariumWebManager V1.0 11/19</h2></br>
</div>
<div> <h3> Application créee par John Locke, qui vous propose de gérer des enregistrements sur votre aquarium.</h3>
      <h3> Et ceux afin de pouvoir faciliter la mainteance de votre aquarium.</h3></br>
</div>
</header>
<div>
<form action="AllSavingsServlets"><button type="submit">Voir tous les enregistrements</button>
</form>
</div>
</br>
<div> <form action="ResearchSavingServlets">
<input id="id" name="nameRecord"> 
<button type="submit">Rechercher enregistrements</button>
</form>
</div>
</br>
<div>
<form action="AllUsersServlets"><button type="submit">Voir tous les utilisateurs</button>
</form>
</div>
</br>
<div> <form action="ResearchUserServlets">
<input id="id" name="userName"> 
<button type="submit">Rechercher Utilisateur</button>
</form>
</div>
<div style="float:center">
<form action="AddUserServlet" method="POST"> Création d'un nouvel utilisateur :</br>
Nom : <input name="nom" id="nom">
Prénom : <input name="prenom" id="prenom">
Age : <input name="age" id="age">
userName : <input name="user" id="user">
Password : <input name="password" id="password">
<button type="submit">Créer </button></form></br>
</div>
<div style="border:1px">
<form action="AddRecordServlet" method="POST"> Ajouter un nouvel enregistrement : </br>

Dernière maintenance : <input type="date" name="derniereMaintenance" id="dernièreMaintenance">
Prochaine maintenance : <input type="date" name="prochaineMaintenance" id="prochaineMaintenance">
Nom du fichier : <input name="nameRecord" id="nameRecord">
Nourriture : <input type="checkbox" name="nourriture" id="nourriture">
changementEauBac : <input type="checkbox" name="changementEauBac" id="changementEauBac">
changementFiltres : <input type="checkbox" name="filtres" id="filtres">
révisionPompe : <input type ="checkbox" name="revisionPompe" id="revisionPompe">
préfiltre : <input type ="checkbox" name="prefiltre" id="prefiltre">
Nitrates : <input name="nitrates" id="nitrates">
Nitrites : <input name="nitrites" id="nitrites">
CO2 : <input name="co2" id="co2">
pH: <input name="pH" id="pH">
Cl2 : <input name="cl" id="cl">
gH: <input name="gH" id="gH">
kH: <input name="kH" id="kH">
Composition du repas: <input type="text" name="compositionRepas" id="compositionRepas">
Commentaires: <input type="text" name="commentaire" id="commentaire">
<button type="submit">Créer </button></form>
</div>
</body>
</html>