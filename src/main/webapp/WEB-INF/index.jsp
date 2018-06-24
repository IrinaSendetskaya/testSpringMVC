<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

   
 
   
	<body>
	
	hello!!!
	  <%-- <div class="container">
	    <h1>This is secured!</h1>
	    <p>
	      Hello <b><c:out value="${pageContext.request.remoteUser}"/></b>
	    </p>
	    <c:url var="logoutUrl" value="/logout"/>
	    <form class="form-inline" action="${logoutUrl}" method="post">
	      <input type="submit" value="Log out" />
	      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	    </form>
	  </div> --%>

	</body>

</html>