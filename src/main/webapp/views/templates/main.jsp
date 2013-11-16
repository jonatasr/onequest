<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<meta name="description" content="">
  	<meta name="author" content="">
	<link  rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" />
	<link  rel="stylesheet" href="<c:url value= "/resources/bootstrap/css/bootstrap-responsive.min.css"/>" />
	<link rel="stylesheet" href="<c:url value="/resources/stylesheets/style.css"/>" />
	<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>

	
	<title><tiles:getAsString name="title" /></title>
	<%-- <script type="text/javascript" src="<c:url value="/resources/javascripts/jquery.js"/>"></script> --%>
</head>
<body>
	
	
	<tiles:insertAttribute name="header"/>
	

	<tiles:insertAttribute name="content"/>


	<tiles:insertAttribute name="footer"/>
</body>
</html>