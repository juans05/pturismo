<script>
	$(document).on("ready", inicio);

	function inicio() {		
		switch ($("#nameJSP").val()) {
		case 'agenciaDashboard':
			$("#principal").addClass('active');
			break;
		case 'agenciaMiAgencia':
			$("#agencia").addClass('active');
			break;
		case 'agenciaAgregarPaquete':
			$("#paquetes").addClass('active');
			$("#ulpaquetes").show();
			$("#lipaquetes").addClass('active');
			break;
		}		
		$('.area-head').on("click",mostrarOcultar);
	}
	
	function mostrarOcultar(){		
		//$(this).parent().find('div').slideToggle('fast','linear');      
	}
</script>

<div class="span3 fixed-menu-agencia" style="width: 200px;">
	<div class="travels-sidebar">
		<div class="all-tours">

			<div class="tour-area">
				<div id="principal" class="area-head">
					<a class=mainNavItem href="irPrincipal">Principal</a>
					<div class="overflow-left"></div>
					<div class="overflow-right"></div>
				</div>
			</div>

			<div class="tour-area">
				<div id="agencia" class="area-head">
					<a class="mainNavItem" href="irMiAgencia">Mi Agencia</a>
					<div class="overflow-left"></div>
					<div class="overflow-right"></div>
				</div>
			</div>

			<div class="tour-area ">
				<div id="paquetes" class="area-head">
					<a class="mainNavItem">Paquetes</a>
					<div class="overflow-left"></div>
					<div class="overflow-right"></div>
				</div>
				<ul id="ulpaquetes" class="inner-areas" style="">
					<li id="lipaquetes" class="icon-angle-right"><a href="agregarPaquete">Agregar Paquete</a></li>
					<li class="icon-angle-right"><a href="#">Mis Paquetes</a></li>
				</ul>
			</div>

			<div class="tour-area">
				<div id="reservas" class="area-head">
					<a class="mainNavItem" href="irReservas">Reservas</a>
					<div class="overflow-left"></div>
					<div class="overflow-right"></div>
				</div>
				<ul class="inner-areas" style="display: none;">
					<li class="icon-angle-right"><a href="#">Ver Reservas</a></li>
				</ul>
			</div>

			<div class="tour-area">
				<div id="atractivosTuristicos" class="area-head">
					<a class="mainNavItem"
						href="irAtractivosTuristicos">Atractivos Turísticos</a>
					<div class="overflow-left"></div>
					<div class="overflow-right"></div>
				</div>
				<ul class="inner-areas" style="display: none;">
					<li class="icon-angle-right"><a href="#">Agregar
							Atractivos</a></li>
					<li class="icon-angle-right"><a href="#">Atractivos</a></li>
				</ul>
			</div>

			<div class="tour-area">
				<div id="configuracion" class="area-head">
					<a class="mainNavItem" href="irConfiguracion">Configuración</a>
					<div class="overflow-left"></div>
					<div class="overflow-right"></div>
				</div>
			</div>

		</div>
	</div>
	<input type="hidden"
		value="<%=request.getServletPath().substring(
					request.getServletPath().lastIndexOf("/") + 1,
					request.getServletPath().lastIndexOf("."))%>"
		id="nameJSP" />
</div>