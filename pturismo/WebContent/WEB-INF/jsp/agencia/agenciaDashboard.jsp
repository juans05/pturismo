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
				<div class="container" style="margin-top: 70px; ">
					<div class="row-fluid">
						<div class="span12">
							<p>Principal</p>
						</div>
					</div>

					<div class="row-fluid">
						<div class="span12">
							<div class="member">
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
									<p>Tiam nec diam non leo aliquet euismod vitae at diam.
										Cras id sem vel velit dignissim vulputate id et sem. Curabitur
										cursus volutpat sapien. Mauris in tellus erat. Maecenas
										laoreet elementum vehicula. In pretium non sem sed imperdiet.
										Integer pellentesque</p>
									
								</div>
							</div>
						</div>
					</div>
					<br></br>


				</div>
			</div>

		</div>
	</div>

	<%@ include file="/WEB-INF/jsp/componentes/footer-links.jsp"%>
	<%@ include file="/WEB-INF/jsp/componentes/footer.jsp"%>
	<jsp:include page="../componentes/listjs2.jsp" />

</body>
</html>