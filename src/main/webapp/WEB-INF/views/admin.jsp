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
<link rel="stylesheet" href="resources/css/social.css">

<!-- Put this script tag to the <head> of your page -->
<script type="text/javascript" src="//vk.com/js/api/openapi.js?75"></script>

<script type="text/javascript">
	VK.init({
		apiId : 3363525,
		onlyWidgets : true
	});
</script>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>

<title>Admin page</title>

</head>
<body>
<%@ include file="include/begin-html.jspf"%>

       <script type="text/javascript">
   			function doAjax() {
				$.ajax({
					url: 'json',
					dataType: 'json',
					data: ({pass: $('#pass').val()}),
					success: function (data){
						$('#resultValue').html(data.name);
					}
				})
			}
   			
   			
   		</script>
   		
	<h2>${message_admin}</h2>
	
	
	<a href="<c:url value="/logout"/>">Logout</a>
	
 <div id="resultValue"></div>
 
	<c:forEach items="${users}" var="user">
	     <form:form method = "POST" modelAttribute="userJSP" action = "admin">
			<fieldset>
			  <form:label path="name">Логин:</form:label>	  
			  <form:input path="name" value="${user.name}"/>
			  <br>
	
	<!-- Password input-->
			<br>
			 <form:label path="pass">Пароль:</form:label>			  
			 <form:input path="pass" value='${user.pass}' onkeyup="doAjax()"/>
			  <br>
			
			</fieldset>
	
	 <input type = "submit" value = "Изменить"/>
	 
	 
	 
		</form:form>
	</c:forEach>
	   <%@ include file="include/end-html.jspf"%>
</body>
</html>


