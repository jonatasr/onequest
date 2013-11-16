<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Starter files for implementing Twitter Bootstrap's Carousel -- using Bootstrap version 2.0.4">
    <meta name="author" content="David Cochran for webdesign.tutsplus.com">
	<link rel="stylesheet" href="<c:url value="/recursos/stylesheets/foundation.min.css"/>" />
	<link rel="stylesheet" href="<c:url value="/recursos/stylesheets/estilo.css"/>" />
	<title><tiles:getAsString name="titulo" /></title>
	<script type="text/javascript" src="<c:url value="/recursos/javascripts/jquery.js"/>"></script>
	
	<link href="<c:url value="/recursos/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/recursos/bootstrap/css/bootstrap-responsive.min.css"/>" rel="stylesheet">
	<!-- <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script> -->
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript" src="<c:url value="/recursos/bootstrap/js/bootstrap.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/recursos/javascripts/main.js"/>"></script>
	
</head>
<body>
	
	
	<tiles:insertAttribute name="cabecalho"/>

	<tiles:insertAttribute name="conteudo"/>

	<tiles:insertAttribute name="rodape"/>
</body>
</html>