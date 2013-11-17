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
	
	<title><tiles:getAsString name="titulo" /></title>
	
	
	
	<link rel="stylesheet" href="<c:url value="/recursos/stylesheets/estilo.css"/>" />
	<link href="<c:url value="/recursos/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/recursos/bootstrap/css/bootstrap-responsive.min.css"/>" rel="stylesheet">
	<link type="text/css" href="<c:url value="/recursos/bootstrap/css/theme.css"/>" rel="stylesheet">
	
	<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script> 
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript" src="<c:url value="/recursos/bootstrap/js/bootstrap.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/recursos/javascripts/main.js"/>"></script>

	<!--JAVASCRIPTS-->

	<script src="<c:url value="/recursos/bootstrap/js/jquery-ui-1.10.1.custom.min.js"/>"></script>
	<!-- WYSIHTML5 TEXT EDITOR -->
	<script src="<c:url value="/recursos/bootstrap/js/advanced.js"/>"></script>
	<script src="<c:url value="/recursos/bootstrap/js/wysihtml5-0.3.0.min.js"/>"></script>
	<!-- AUTOSIZE TEXTAREA -->
	<script src="<c:url value="/recursos/bootstrap/js/jquery.autosize-min.js"/>"></script>
	<!-- BOOTSTRAP DATEPICKER -->
	<script src="<c:url value="/recursos/bootstrap/js/bootstrap-datepicker.js"/>"></script>
	<!-- FLOT CHART -->
	<script src="<c:url value="/recursos/bootstrap/js/jquery.flot.js"/>"></script>
	<script src="<c:url value="/recursos/bootstrap/js/jquery.flot.pie.js"/>"></script>
	<script src="<c:url value="/recursos/bootstrap/js/jquery.flot.resize.js"/>"></script>
	<!-- FULLCALENDAR -->
	<script src="<c:url value="/recursos/bootstrap/js/fullcalendar.custom.js"/>"></script> 
	<!-- MIXITUP -->
	<script src="<c:url value="/recursos/bootstrap/js/jquery.mixitup.min.js"/>"></script>
	<!-- THEME -->
	<script src="<c:url value="/recursos/bootstrap/js/theme.js"/>"></script>
	
</head>
<body>
	
	<tiles:insertAttribute name="cabecalho"/>
	<tiles:insertAttribute name="configuracao"/>
	<tiles:insertAttribute name="conteudo"/>
	<tiles:insertAttribute name="rodape"/>
</body>
</html>