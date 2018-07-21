<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="include/begin-html.jspf"%>
	<h2>${message_user}</h2>
	
	<c:url var="logoutURL" value="/logout">  </c:url>
	
	<a href="${logoutURL}"> Logout</a>
 <%@ include file="include/end-html.jspf"%>
</body>
</html>


  