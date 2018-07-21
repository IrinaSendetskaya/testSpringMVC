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

<title>Create basket</title>
</head>

<body>

	<%@ include file="include/begin-html.jspf"%>

	<c:url var="basketURL" value="/basket">
	</c:url>
	<fieldset>
	
	<h2>${message}</h2>

		<!-- Form Name -->
		<legend>Создать корзину</legend>

		<div class="container">
			<div class="page-header">
				<h1>Корзина</h1>
				<p class="lead"></p>
			</div>

		</div>

		<div class="row">
			<div class="col-md-2">№ заказа</div>
			<div class="col-md-2">№ покупателя</div>
			<div class="col-md-7">№ машины</div>
			<div class="col-md-2"></div>
			<div class="col-md-2"></div>

		</div>
		<div class="container">
			<c:forEach items="${orders}" var="basket">
				<form class="update-user-${basket.id}" action="${basketURL}"
					method=GET>

					<br>


					<div class="row">
						<div class=col-md-2>
							<input id="id" class="form-control input-md" name="id"
								value="${basket.id}" />
						</div>



						<div class=col-md-2>
							<input id="idUser" class="form-control input-md" name="idUser"
								value="${basket.user.name}" />
						</div>
						<div class=col-md-7>
							<input id="idCar" class="form-control input-md" name="idCar"
								value="${basket.car}" />
						</div>

						<br> <br>
						<%-- 
						<div class="container">
							<div class="row">
								<div class="col-md-7">№ машины</div>
								<div class="col-md-1"></div>
								<div class="col-md-1"></div>

							</div>
						</div>
						<br>

						<div class="container">
							<div class="row">
								<div class=col-md-7>
									<input id="idCar" class="form-control input-md" name="idCar"
										value="${basket.car}" /> <select id="idCar" name="idCar"
										class="form-control">
										<c:forEach items="${cars}" var="car">
											<form:form class="update-good-${car.id}">

												<option value="${car.id}"
													car=${car.id}$car.id==basket.idCar?"selected":""}>

													<div class="col-md-2">${car.brand}</div>
													<div class="col-md-2">${car.model}</div>
													<div class="col-md-1">${car.price}</div>
													<div class="col-md-2">${car.status}</div>

												</option>


											</form:form>

										</c:forEach>
									</select>
								</div> --%>

						<div class=col-md-2>
							<button id="Update" value="Update" name="Update"
								class="btn btn-success">Изменить</button>
						</div>

						<div class=col-md-2>
							<button id="Delete" value="Delete" name="Delete"
								class="btn btn-danger">Удалить</button>
						</div>

					</div>


				</form>
				<br>
				<br>
			</c:forEach>

			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="postbutton"></label>
				<div class="col-md-4">
					<button id="ready" value="ready" name="ready"
						class="btn btn-primary">Оформить</button>
				</div>
			</div>

		</div>

	</fieldset>

	<%@ include file="include/end-html.jspf"%>
</body>
</html>