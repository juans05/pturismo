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
<title>PTurismo - Iniciar Sesión</title>
<%@ include file="/WEB-INF/jsp/componentes/listcss.jsp"%>
<style>
label.error {
	margin-left: 10px;
	width: auto;
	display: inline;
	color: rgb(255, 0, 0);
	font-weight: bold;
}
.ajuste{
	margin-left:17px;
}
</style>
</head>

<body>

	<%@ include file="/WEB-INF/jsp/componentes/header.jsp"%>
	<!--==========================
	Sliders
	============================-->
	<section id="home-small" class="">
		<div id="home-slider-3"
			style="width: 100%; height: 174px; margin: 0px auto;">
			<div class="ls-layer "
				style="slidedirection: top; slidedelay: 2000; durationin: 2000; durationout: 1000; delayout: 500;">
				<img src="assets/img/slides/slide1.jpg" class="ls-bg" alt="">
			</div>
			<div class="ls-layer" style="slidedelay: 1000;">
				<img src="assets/img/slides/slide2.jpg" class="ls-bg" alt="">
			</div>
			<div class="ls-layer"
				style="slidedelay: 1000; delayout: 500; transition2d: all;">
				<img src="assets/img/slides/slide3.jpg" class="ls-bg" alt="">
			</div>
			<div class="ls-layer"
				style="slidedelay: 1000; delayout: 500; transition2d: all;">
				<img src="assets/img/slides/slide5.jpg" class="ls-bg" alt="">
			</div>
			<div class="ls-layer"
				style="slidedelay: 1000; delayout: 500; transition2d: all;">
				<img src="assets/img/slides/slide6.jpg" class="ls-bg" alt="">
			</div>
		</div>
		<div class="slider-overlay-3">
			<div class="overlay-line-3"></div>
			<div class="overlay-content container">
				<div class="overlay-tool2"></div>
				<div class="about-page">
					<div class="page-title">INICIAR SESIÓN</div>
					<div class="page-line">Ziczac, travel with me</div>
					<div class="breadcrumb-custom">
						<ul>
							<li><a href="index.html" class="no-pad-left">Inicio</a></li>
							<li class="icon-angle-right"><a href="#">Iniciar Sesión</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--\\slider ends here-->
	<section id="login" class="pop-out">
		<div class="popup-head">Ingresa tus datos de acceso</div>

		<form:form id="frmLogin" action="login" method="post"
			commandName="usuario">
			<div class="popups">
				<input type="email" placeholder="Tu correco electrónico" autofocus
					required name="email"/> <span class="icon-envelope-alt"></span>
			</div>
			<div class="popups">
				<input type="password" placeholder="Password" required name="password"/> <span
					class="icon-unlock"></span>
			</div>
			<button type="submit" class="ajuste">Iniciar Sesión</button>
			<p class="ajuste">
				<label class="error"><c:out value="${msg}" /></label>
			</p>
		</form:form>
	</section>

	<%@ include file="/WEB-INF/jsp/componentes/footer-links.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/footer.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/listjs.jsp"%>

</body>

</html>
