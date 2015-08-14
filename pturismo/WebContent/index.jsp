<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<title>PTurismo</title>
<%@ include file="/WEB-INF/jsp/componentes/listcss.jsp"%>
</head>

<body>
	<div>
		<a href="toLogin">Login</a><br />
		<!-- <a href="toSignUp">Sign Up</a> -->
		<a href="toRegistro">Registro</a>
		<!-- <a href="toGetBuckets">Get Buckets</a> -->
	</div>

	<%@ include file="/WEB-INF/jsp/componentes/header.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/principal/slider.jsp"%>

	<div class="overlay-overflow"></div>

	<div class="BG-map">
		<div class="BG-map-inner">
			<%@ include
				file="/WEB-INF/jsp/componentes/principal/destinations.jsp"%>
			<div class="clearfix"></div>
			<%@ include file="/WEB-INF/jsp/componentes/principal/tours.jsp"%>
		</div>
	</div>

	<%@ include file="/WEB-INF/jsp/componentes/principal/specialoffers.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/principal/booking.jsp"%>
	
	<%@ include file="/WEB-INF/jsp/componentes/footer-links.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/footer.jsp"%>
	
	<%@ include file="/WEB-INF/jsp/componentes/listjs.jsp"%>
</body>
</html>