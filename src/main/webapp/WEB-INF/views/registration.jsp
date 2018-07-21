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

<title>Register page</title>
</head>

<body>
	<%@ include file="include/begin-html.jspf"%>
	<br>
	 <h2>${message}</h2>

		<script type="text/javascript">
		function doAjax() {
			$.ajax({
				url : 'checkPass',
				data : ({
					pass : $('#pass').val()
				}),
				success : function(data) {
					$('#resultValue').html(data);
				}
			})
		}

		function doAjaxLogin() {
			$.ajax({
				url : 'checkLogin',
				data : ({
					name : $('#name').val()
				}),
				success : function(data) {
					$('#resultValue').html(data);
				}
			})
		}

		function doAjaxSignup() {
			$.ajax({
				url : 'signup',
				data : ({
					pass : $('#pass').val(),
					name : $('#name').val()
				}),
				success : function(data) {
					$('#resultValue').html(data);
				}
			})
		}
	</script>
		<div id="resultValue"></div><!-- Login input-->
	<form:form method="GET" modelAttribute="userJSP" action="register">
		<br>
		<br>
		<br>
		<fieldset>
			<form:label path="name">Логин:</form:label>
			<form:input path="name" onkeyup="doAjaxLogin()" />
			<br> <span class="help-block">Укажите e-mail</span>



			<!-- Password input-->
			<br>
			<form:label path="pass">Пароль:</form:label>

			<form:password path="pass" onkeyup="doAjax()" />
			<br> <span class="help-block">Введите пароль минимум 4
				символов</span>

		</fieldset>

		<!-- Button -->

		<input type="button" value="Зарегистрироваться"
			onclick="doAjaxSignup()" />


	</form:form> 
	
	<%-- <%@ include file="include/end-html.jspf"%> --%>
</body>
</html>
