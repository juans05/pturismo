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
</head>
<body>
	<jsp:include page="../componentes/header.jsp" />

	<div class="BG-map">
		<div class="BG-map-inner">

			<div class="row-fluid">
				<jsp:include page="../componentes/menuAgencia.jsp" />
				<div class="container" style="margin-top: 70px; background: white;">
					<div class="row-fluid">
						<div class="span12">
							<p>agregar paquete</p>
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