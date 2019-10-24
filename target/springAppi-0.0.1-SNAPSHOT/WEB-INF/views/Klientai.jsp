<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<c:forEach items="${Klientas}" var="elementas">
		<h3>Vardas: ${elementas.name}</h3>
		<p>Kliento id: ${elementas.id}</p>
		<p>Adresas: ${elementas.adress}
	</c:forEach>



</body>
</html>