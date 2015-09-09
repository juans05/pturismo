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
<title>Pturismo - Agencia</title>
<jsp:include page="../componentes/listcss.jsp" />
<jsp:include page="../componentes/listjs.jsp" />
<link href="css/pturismo.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="../componentes/header.jsp" />

	<div class="BG-map">
		<div class="BG-map-inner">

			<div class="row-fluid">
				<jsp:include page="../componentes/menuAgencia.jsp" />
				<div class="container" style="margin-top: 70px;">
					<div class="">
						<!-- row-fluid estaba antes -->
						<div class="span12">
							<div class="member" style="min-height: 180px;">
								<div class="member-face">
									<img src="assets/img/team/1.jpg" alt="">
								</div>
								<div class="member-detail">
									<div class="naming">
										<div class="member-name">
											<div class="m-name">Tran Mau Tri Tam</div>
											<div class="m-age">24 Year old</div>
										</div>
									</div>
									<div class="social-position">
										<ul class="social">
											<li class="icon-minus-sign red"><a class="member-social"
												href="#">Report</a></li>
											<li class="icon-thumbs-up-alt dark"><a
												class="member-social m-border-right" href="#">Like staff</a></li>
											<li class="dark"><a href="#"><span
													class="icon-facebook-sign"></span></a></li>
											<li class="dark"><a href="#"><span
													class="icon-twitter-sign"></span></a></li>
											<li class="dark"><a href="#"><span
													class="icon-pinterest-sign"></span></a></li>
											<li class="dark"><a href="#"><span
													class="icon-google-plus-sign"></span></a></li>
										</ul>

									</div>
									<p>demo2</p>
									<div class="span10" style="margin-left: 0px;">
										<div class="span5 sumaryBodyFather">
											<div class="span2 summaryBodySpan">
												<span class="labelv2"> Nombre</span>
											</div>
											<div class="span3">
												<span class="labelResultado">Cesar</span>
											</div>
										</div>
										<div class="span5 sumaryBodyFather">
											<div class="span2 summaryBodySpan">
												<span class="labelv2"> Apellido</span>
											</div>
											<div class="span3">
												<span class="labelResultado"> Oropeza</span>
											</div>
										</div>
									</div>

									<div class="span10" style="margin-left: 0px;">
										<div class="span5 sumaryBodyFather">
											<div class="span2 summaryBodySpan">
												<span class="labelv2"> edad</span>
											</div>
											<div class="span3">
												<span class="labelResultado"> 23</span>
											</div>
										</div>
										<div class="span5 sumaryBodyFather">
											<div class="span2 summaryBodySpan">
												<span class="labelv2"> ciudad</span>
											</div>
											<div class="span3">
												<span class="labelResultado"> Lima</span>
											</div>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>

					<!-- Tabs -->
					<div class="row-fluid">
						<div class="span12">
							<section id="booking-tabs-wrapper"
								class="detail-tabs inside-tabs"
								style="background: none !important; min-height: 500px;">
								<ul class="nav nav-tabs" id="booking-tabs">
									<li class="active"><a href="#more-detail">Principal</a></li>
									<li><a href="#guide">Fotos</a></li>
									<li><a href="#Comments">Comentarios</a></li>
								</ul>
								<div class="tab-content" style="min-height: 500px;">
									<jsp:include page="miAgencia/tabAgenciaVista.jsp" />

								</div>
							</section>
						</div>
					</div>
				</div>
			</div>

		</div>
	</div>

	<%@ include file="/WEB-INF/jsp/componentes/footer-links.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/footer.jsp"%>
	<jsp:include page="../componentes/listjs2.jsp" />

</body>
</html>