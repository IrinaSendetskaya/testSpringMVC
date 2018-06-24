<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%--  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %> --%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%> 
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>

<c:url value="/resources/css/login.css" var="css"/>
<link href="${css}" rel="stylesheet"/>

<!-- <!-- Bootstrap CSS -->
  <!--   <link rel="stylesheet" href="css/login.css"> -->

<title>Insert title here</title>
</head>

  	  <body>
      <h2>${message}</h2>
      
   <c:url var="loginURL" value="/login">  </c:url>
      
      <form action="${loginURL}" method="post" >
      
      	<input type="text" id="username" name="name" required />
		<input type="password" id="password" name="pass" required />
		<input type="submit" value="Войти">
	  </form>

<%-- <!-- Login input--> 
    <form class="box login" action = "j_spring_security_check" method="POST">
		<table>
				<tr>
					<td>Логин:</td>
					<td><input type="text" name="name" value=""/></td>
			 		 <td><span class="help-block">Укажите e-mail</span></td>
			    </tr>
			   
		  
			  <tr>
					<td>Пароль:</td>
					<td><input type="password" name="pass" /></td>
			 		 <td><span class="help-block">Введите пароль минимум 4 символов</span></td>
			  </tr>
			 
			  <tr>
			  	<td> <input type = "submit" class="btnLogin" value = "Войти"/></td>
			  </tr>
	    </table>
	    
	    <c:if test="${not empty error}">
      	${error}
      </c:if>

	</form> --%>
      
<%-- <!-- Login input--> 
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
		

	</form:form> --%>
   </body>


</html>