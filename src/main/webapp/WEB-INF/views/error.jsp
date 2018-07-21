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

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js"></script>

<title>Интернет-магазин</title>
</head>

<body>

<%@ include file="include/begin-html.jspf"%>
	<div class="alert alert-danger" role="alert">
		<c:choose>
			<c:when test="${not empty param.error}">
				<font color="red"> Login error. <br /> Reason :
					${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
				</font>
			</c:when>
			<c:otherwise>
				<p>${error_message}</p>
			</c:otherwise>
		</c:choose>
	</div>

	<%@ include file="include/end-html.jspf"%>
</body>
</html>