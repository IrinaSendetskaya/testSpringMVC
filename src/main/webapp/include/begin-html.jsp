<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/social.css">

<!-- Put this script tag to the <head> of your page -->
<script type="text/javascript" src="//vk.com/js/api/openapi.js?75"></script>
<script type="text/javascript">
  VK.init({apiId: 3363525, onlyWidgets: true});
</script>

<title>Интернет-магазин</title>
</head>

<body>

	<h2>${message_user}</h2>
	
	<c:url var="editURL" value="/edit">  </c:url>
	<c:url var="indexURL" value="/">  </c:url>
	<c:url var="signupURL" value="/signup">  </c:url>
	<c:url var="loginURL" value="/login">  </c:url>
	<c:url var="profileURL" value="/profile">  </c:url>
	<c:url var="basketURL" value="/basket">  </c:url>
	<c:url var="logoutURL" value="/logout">  </c:url>

	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="navbar-brand" href=".">Home</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavDropdown"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="">Каталог товаров <span class="sr-only">(current)</span></a>
					</li>

					<c:if test="${user!=null && user.id==1}">

						<!-- <li class="nav-item"><a class="nav-link"
							href="do?command=ResetDB">Сброс БД</a></li> -->
						<li class="nav-item"><a class="nav-link"
							href="${editURL}">Редактирование пользователей</a></li>
					</c:if>
				</ul>
			</div>

			<form class="form-inline my-1 my-lg-0">

				<input id="searchInput" name="searchInput"
					class="form-control input-md" type="search" placeholder="Search"
					aria-label="Search">

				<button id="searchBtn" name="searchBtn"
					class="btn btn-outline-success my-1 my-sm-0"
					onclick="${indexURL}" href="${indexURL}" type="submit">Search</button>
			</form>



			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<ul class="navbar-nav navbar-right">
					<c:choose>
						<c:when test="${user==null}">
							<li class="nav-item"><a class="nav-link"
								href="${signupURL}">Зарегистрироваться <span
									class="sr-only">(current)</span></a></li>
							<li class="nav-item active"><a class="nav-link"
								href="${loginURL}">Войти <span class="sr-only">(current)</span></a>
							</li>
						</c:when>
						<c:otherwise>

							<%-- <c:if test="${buyer.fk_roles!=3}"> --%>
								<li class="nav-item active"><a class="nav-link"
									href="${profileURL}">Личный кабинет <span
										class="sr-only">(current)</span></a></li>
								<li class="nav-item"><a class="nav-link"
									href="${basketURL}">Корзина<span class="sr-only">(current)</span></a>
								</li>
							<%-- </c:if> --%>
							<li class="nav-item"><a class="nav-link"
								href="${logoutURL}">Выйти <span class="sr-only">(current)</span></a>
							</li>
						</c:otherwise>
					</c:choose>

				</ul>
			</nav>

		</nav>