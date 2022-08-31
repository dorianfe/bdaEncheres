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
			<div class="navbar-header">
				<a href="welcome" class="navbar-brand active"> <span
							class="glyphicon glyphicon-education"></span> 
				</a>
				<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
					<span class="icon-bar"></span>
		                     <span class="icon-bar"></span> 
		                     <span class="icon-bar"></span>
				</button>
			</div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="testrest"><spring:message code="welcome.call.rest"/></a></li>
					<li ><a href="deconnexion"><spring:message code="welcome.disconnection"/></a></li>
				</ul>
			</div>
			
		</div>
	</nav>

	<div class="container">
		<div>
			<h1><spring:message code="welcome.call.rest"/></h1>
			
			<ul>
				<li class="list-group-item"><a href="rest/users"><spring:message code="rest.allusers"/></a></li>
				<li class="list-group-item"><a href="rest/users/Thierry"><spring:message code="rest.oneuser"/></a></li>
			</ul>
		</div>
	</div>
		

	<jsp:include page="footer.jsp" />
</html>