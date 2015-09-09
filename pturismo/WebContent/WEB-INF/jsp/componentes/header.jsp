<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--===========================
header
============================-->
<header>
	<nav id="navbar">
		<div class="quick-access">
			<div class="access-lists container">
				<ul class="access">
					<li class="no-pad-left"><a class="pop-login" href="#">Ingresar</a></li>
					<li><a class="pop-new" href="#">Create cuenta</a></li>
					<li><a class="pop-exploreit" href="#">Explore</a></li>
				</ul>
				<ul class="social">
					<li><a href="#"><span class="icon-facebook-sign"></span></a></li>
					<li><a href="#"><span class="icon-twitter-sign"></span></a></li>
					<li><a href="#"><span class="icon-pinterest-sign"></span></a></li>
					<li><a href="#"><span class="icon-google-plus-sign"></span></a></li>
				</ul>
			</div>
			<div class="contact-access container">
				<ul>
					<li class="icon-mobile-phone"><a href="tel:+84935815989">(+84)
							935 815989</a></li>
					<li class="icon-volume-up"><a href="#">Newsletter</a></li>
				</ul>
			</div>
			<div class="container">
				<div class="search-all">
					<form action="" method="post">
						<input name="genral-search" id="genral-search" value="Search">
					</form>
					<ul
						style="float: right; line-height: 100px; margin-right: 50px; margin-top: -15px; list-style: outside none none;">
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#"><span
								style="font-size: 16px; color: #CFF;">AGENCIA</span></a>
							<ul class="dropdown-menu" style="margin-top: 10px;">
								<li><a href="#"> User Profile</a></li>
								<li><a href="#"> Settings</a></li>
								<li class="divider"></li>
								<li><a href="login.html">Logout</a></li>
							</ul> <!-- /.dropdown-user --></li>
						<!-- /.dropdown -->
					</ul>
				</div>
			</div>
		</div>
		<!--quick-access-->

		<div id="nav">
			<div id="navinner" class="container">
				<div class="logo">
					<img src="assets/img/logo.png" alt="logo" />
				</div>
				<ul id="mobile">
					<li class="active"><a href="index.html">HOME PAGE</a></li>
					<li><a href="about-us.html">ABOUT US</a></li>
					<li><a href="special-offers.html">SPECIAL OFFERS</a></li>
					<li class="logo-space"><a href="travels.html">OUR TRAVELS</a></li>
					<li><a href="destinations.html">DESTINATIONS</a></li>
					<li class="no-pad-right"><a href="contact-us.html">CONTACT
							US</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!--navbar-->

</header>

<!--===========================
Pop-up
============================-->
<section id="login" class="pop-out mfp-hide">
	<div class="popup-head">Login to your account</div>
	<form id="frmLogin" action="login" method="post" commandName="usuario">
		<div class="popups">
			<input type="email" placeholder="Tu correco electrónico" /> <span
				class="icon-envelope-alt"></span>
		</div>
		<div class="popups">
			<input type="password" placeholder="Password" /> <span
				class="icon-unlock"></span>
		</div>
		<button type="submit">Iniciar Sesión</button>
	</form>
</section>

<section id="register" class="pop-out mfp-hide">
	<div class="popup-head">CREAR NUEVA CUENTA</div>

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

<section id="explore" class="mfp-hide">
	<div id="explore-carousel" class="carousel slide">
		<!-- Carousel items -->
		<div class="carousel-inner">
			<div class="active item">
				<img src="assets/img/slides/explore.jpg" alt="" />
				<div class="explore-caption">
					<p>Welcome to ThemeForest! Read our Getting Started Guide,
						visit the Blog for recent news and make yourself at home! You can
						find information about ThemeForest in our Knowledgebase.</p>
				</div>
			</div>
			<div class="item">
				<img src="assets/img/slides/explore.jpg" alt="" />
				<div class="explore-caption">
					<p>Welcome to ThemeForest! Read our Getting Started Guide,
						visit the Blog for recent news and make yourself at home! You can
						find information about ThemeForest in our Knowledgebase.</p>
				</div>
			</div>
		</div>
		<!-- Carousel nav -->
		<a class="carousel-control left" href="#explore-carousel"
			data-slide="prev"><span class="icon-double-angle-left"></span></a> <a
			class="carousel-control right" href="#explore-carousel"
			data-slide="next"><span class="icon-double-angle-right"></span></a>
	</div>
</section>