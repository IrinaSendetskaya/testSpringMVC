<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%-- <%@ include file="views/include/begin-html.jsp"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<jsp:forward page="/main" /> 

<%-- hello!!!
	  
	  <c:url var="indexURL" value="/main">  </c:url>

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
		<form class="update-good-${car.id}" action="${indexURL}"
			method=GET>
			<div class="row">
				<div class="col-md-2">${car.brand}</div>
				

				
				<div class="col-md-2">${car.model}</div>
				<div class="col-md-1">${car.price}</div>
				<div class="col-md-2">${car.status}</div>


				<div class="col-md-1">
					<input id="id" class="form-control input-md" name="ID"
						type="hidden" class="form-control" value="${car.id}" />

				</div>

				<c:if test="${buyer.fk_roles!=3}">
					<div class="col-md-1">
						<button id="Update" value="Update" name="Update"
							class="btn btn-success">В корзину</button>
					</div>
				</c:if>
			</div>

		</form>

	</c:forEach>
</div>

<br>
<br>



<%@ include file="views/include/end-html.jsp"%> --%>