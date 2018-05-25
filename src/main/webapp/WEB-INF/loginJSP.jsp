<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%--  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %> --%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>
<title>Insert title here</title>
</head>

  	  <body>
      <h2>${message}</h2>
      
<!-- Login input--> 
    <form:form method = "POST" commandName="userJSP" action = "check-user">
		<fieldset>
		  <form:label path="name">Логин:</form:label>	  
		  <form:input path="name"/>
		  <br>
		  <span class="help-block">Укажите e-mail</span>
		  
		

<!-- Password input-->
		<br>
		 <form:label path="pass">Пароль:</form:label>
		  
		  <form:password path="pass"/>
		  <br>
		    <span class="help-block">Введите пароль минимум 4 символов</span>
		
		</fieldset>

<!-- Button -->
		
		    <input type = "submit" value = "Войти"/>
		

	</form:form>
   </body>


</html>