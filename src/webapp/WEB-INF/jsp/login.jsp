<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap-theme.min.css">
<script src="js/jquery.min.js"></script>
<script src="bootstrap-3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/commun.css">
<link rel="icon" href="img/favicon.ico" />


</head>
<body>

	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="i18n?lg=fr">Français</a></li>
					<li><a href="i18n?lg=en">English</a></li>
				</ul>
			</div>	
		</div>

	</nav>

	<h1><spring:message code="login.title"/></h1>
	<h2>${error}</h2>
	<form:form cssClass="form-horizontal" modelAttribute="userInSession" method="POST" action="connexion">
		<div class="form-group">
			<form:label path="login" cssClass="col-xs-2 control-label"><spring:message code="login.login"/></form:label>
			<div class="col-xs-10">
				<form:input path="login" cssClass="form-control" />
				<form:errors path="login"></form:errors>
			</div>
		</div>
		<div class="form-group">
			<form:label path="password" cssClass="col-xs-2 control-label"><spring:message code="login.pwd"/></form:label>
			<div class="col-xs-10">
				<form:password path="password" cssClass="form-control" />
				<form:errors path="password"></form:errors>
			</div>
		</div>
		<div class="form-group">
			<div class="col-xs-offset-2 col-xs-10">
				<button type="submit" class="btn btn-primary"><spring:message code="login.connection"/></button>
			</div>
		</div>
	</form:form>

		
	

	<jsp:include page="footer.jsp" />
</html>