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

	<h2>${message}</h2>
	<%@ include file="include/begin-html.jspf"%>
	<c:url var="mainURL" value="/main">
	</c:url>
	<c:url var="addURL" value="/addOrder/${car.id}"></c:url>
	<c:url var="basketURL" value="/basket"></c:url>

	<div class="page-header">
		<h1>Все товары</h1>
		<p class="lead"></p>
	</div>

	<div class="container">
		<div class="row">

			<div class="col-md-2">Бренд</div>
			<div class="col-md-2">Модель</div>
			<div class="col-md-1">Цена</div>
			<div class="col-md-2">Статус аренды</div>
			<div class="col-md-1"></div>
			<div class="col-md-1"></div>

		</div>
		<br>

		<c:forEach items="${cars}" var="car">
			<form class="update-good-${car.id}" action="${mainURL}" method=GET>
				<div class="row">
					<div class="col-md-2">${car.brand}</div>
					<div class="col-md-2">${car.model}</div>
					<div class="col-md-1">${car.price}</div>
					<div class="col-md-2">${car.status}</div>


					<div class="col-md-1">
						<input id="id" class="form-control input-md" name="ID"
							onselect='${addURL}' type="hidden" class="form-control"
							value="${car.id}" />

					</div>

					<%-- <c:if test="${buyer.fk_roles!=3}"> --%>
					<div class="col-md-1">
						<button id="Update" value="Update" name="Update"
							class="btn btn-success">В корзину</button>
					</div>
					<%-- </c:if> --%>
				</div>

			</form>

		</c:forEach>
	</div>

	<br>
	<br>

	<%@ include file="include/end-html.jspf"%>
</body>
</html>