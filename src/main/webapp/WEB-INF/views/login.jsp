<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%-- <%@ include file="src/main/webapp/include/begin-html.jsp"%> --%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%> 
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>

<c:url value="css/login.css" var="css"/>
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


   </body>


</html>