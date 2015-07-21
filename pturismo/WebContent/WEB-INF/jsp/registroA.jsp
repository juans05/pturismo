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
	<%@ include file="/WEB-INF/jsp/componentes/listcss.jsp" %>
</head>

<body>

	<%@ include file="/WEB-INF/jsp/componentes/header.jsp" %>
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
					<div class="page-title">REGISTRATE AHORA</div>
					<div class="page-line">Ziczac, travel with me</div>
					<div class="breadcrumb-custom">
						<ul>
							<li><a href="index.html" class="no-pad-left">Home</a></li>
							<li class="icon-angle-right"><a href="#">Registro</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--\\slider ends here-->
	<section id="register" class="pop-out">
		<div class="popup-head">INGRESA TUS DATOS</div>

		<form action="registro" method="post" commandName="personabean">
			<div class="popups">
				<input type="email" placeholder="Tu correo Electrónico" name="email"
					value="" required title="Complete un correo electrónico válido" />
				<span class="icon-envelope-alt"></span>
			</div>
			<div class="popups">
				<input type="password" placeholder="Password" name="password1"
					value="" required /> <span class="icon-unlock"></span>
			</div>
			<div class="popups">
				<input type="password" placeholder="Confirmar password"
					name="password" value="" required /> <span class="icon-unlock"></span>
			</div>
			<div class="popups">
				<input type="text" placeholder="Nombre" name="nombre" value=""
					required title="Complete un nombre" /> <span class="icon-user"></span>
			</div>
			<!--         <div class="popups"> -->
			<!--         	<input type="text" placeholder="Your address" /> -->
			<!--             <span class="icon-home"></span> -->
			<!--         </div> -->
			<div class="popups">
				<input type="text" placeholder="Celular (Optional)" name="celular" />
				<span class="icon-phone-sign"></span>
			</div>
			<button type="submit">Crear cuenta</button>
			<p>
				<label class="error"><c:out value="${msg}" /></label>
			</p>
		</form>
	</section>
	<%@ include file="/WEB-INF/jsp/componentes/footer-links.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/footer.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/listjs.jsp"%>
</body>

</html>
