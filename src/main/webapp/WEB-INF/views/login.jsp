<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<!-- <link rel="stylesheet" href="resources/css/social.css"> -->

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>

<c:url value="resources/css/login.css" var="css" />
<link href="${css}" rel="stylesheet" />

<!-- <!-- Bootstrap CSS
 <link rel="stylesheet" href="css/login.css">   -->

<title>Login page</title>
</head>

<body>

	<%@ include file="include/begin-html.jspf"%>



	<c:url var="checkURL" value="/checkUser">
	</c:url>

	<form:form action="${checkURL}" method="POST" modelAttribute="userJSP">
		<br>
		<br>
		<br>

		<h2>${message}</h2>

		<fieldset>
			<form:label path="name">Логин:</form:label>
			<form:input path="name" />
			<!-- Password input-->
			<br> <br>
			<form:label path="pass">Пароль:</form:label>
			<form:password path="pass" />
			<br> <br> <br>
			<button id="button" name="button" class="btn btn-primary">login</button>
		</fieldset>

	</form:form>

	<%-- <%@ include file="include/end-html.jspf"%> --%>
</body>
</html>