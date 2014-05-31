<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Application web avec l'architecture n-Tier</h1>
	<h2>Entrez les détails du livre ici !</h2>
	<s:form action="ajoutLivreAction">
		<s:textfield name="Titre" label="Titre" value="" />
		<s:textfield name="nomAuteur" label="Nom de l'auteur" value="" />
		<s:textfield name="prix" label=" Prix unitaire" value="" />
		<s:submit />
	</s:form>

	<s:if test="listLivres != null && listLivres.size() > 0 ">
		<h2>Liste des livres disponible !</h2>
		<table>
			<tr>
				<th>ID du livre</th>
				<th>Titre :</th>
				<th>Auteur :</th>
				<th>Prix</th>
				<th>Date</th>
			</tr>
			<s:iterator value="listLivres" status="statusUtilisateur">
				<tr>
					<td><s:property value="idLivre" /></td>
					<td><s:property value="titre" /></td>
					<td><s:property value="nomAuteur" /></td>
					<td><s:property value="prix" /></td>
					<td><s:date name="date" format="dd/MM/yyyy" /></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	<br/>
	<br/>
</body>
</html>