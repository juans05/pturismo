(function($) {
  "use strict";




/*===========================================
	Pop ups
==============================================*/
$('.pop-login').magnificPopup({
    items: [{src: '#login', type: 'inline'} ],
    gallery: {enabled: true},
	mainClass: 'mfp-fade',
	removalDelay: 160,
    type: 'image'
});

$('.pop-new').magnificPopup({
    items: [{src: '#register', type: 'inline'} ],
    gallery: {enabled: true},
	mainClass: 'mfp-fade',
	removalDelay: 160,
    type: 'image'
});

$('.pop-exploreit').magnificPopup({
    items: [{src: '#explore', type: 'inline'} ],
    gallery: {enabled: true},
	mainClass: 'mfp-fade',
	removalDelay: 160,
    type: 'image'
});

/*===========================================
	About page (Member slider)
==============================================*/

$('.members').flexslider({
	after: 
	function(slider){
		$('.member-bar li').removeClass('active');
		$('.member-bar li:eq('+slider.currentSlide+')').addClass("active");
	},
  animation: "slide",
  controlNav: true,
  directionNav: false,
  pauseOnHover: true, 
  direction: "horizontal", //Direction of slides
});



$('.testimonial-flex').flexslider({
  animation: "slide",
  controlNav: false,
  directionNav: false,
  pauseOnHover: true, 
  direction: "horizontal", //Direction of slides
});


$('.member-bar li').click(function(){
	$('.member-bar li').removeClass('active');
    $(this).addClass("active");
	$('.member-bar li').index(this);
	$('.members').flexslider($('.member-bar li').index(this));
});


/*===========================================
	Isotopes (Filter and sort of our travels)
==============================================*/

$('.layout-option li').click(function(){
	
	if($(this).index()=== 0 || $(this).index()===1)
	{
		$('.layout-option li').removeClass('active');
		$(this).addClass("active");
	}if($(this).hasClass('grid-layout'))
	{
		$('#tours-container').removeClass('layout-2');
		$('#tours-container').addClass('layout-1');
	}
	else if($(this).hasClass('list-layout')){
		$('#tours-container').removeClass('layout-1');
		$('#tours-container').addClass('layout-2');
	}
	$container.isotope({layoutMode : 'fitRows',
	getSortData: {
		date:function( $elem ){
			return Date.parse($elem.find('.date-time').text(),10);
			},
		price:function( $elem ){
			return parseInt($elem.find('.fix-price').text(),10);
			},
		star: function( $elem ){
			return parseInt($elem.find('.stars').text(),10);
			},
		like: function( $elem ){
			return parseInt($elem.find('.likes').text(),10);
          }
        }
      });
	
});


var $container = $('#tours-container');
$container.isotope({
	layoutMode : 'fitRows',
	getSortData: {
		date:function( $elem ){
			return Date.parse($elem.find('.date-time').text(),10);
			},
		price:function( $elem ){
			return parseInt($elem.find('.fix-price').text(),10);
			},
		star: function( $elem ){
			return parseInt($elem.find('.stars').text(),10);
			},
		like: function( $elem ){
			return parseInt($elem.find('.likes').text(),10);
			}
        }
      });
      var $optionSets = $('.sorting-methodes .option-set'),
          $optionLinks = $optionSets.find('a');

      $optionLinks.click(function(){
        var $this = $(this);
        // don't proceed if already selected
        if ( $this.hasClass('active') ) {
          return false;
        }
        var $optionSet = $this.parents('.option-set');
        $optionSet.find('.active').removeClass('active');
        $this.addClass('active');
  
        // make option object dynamically, i.e. { filter: '.my-filter-class' }
        var options = {},
            key = $optionSet.attr('data-option-key'),
            value = $this.attr('data-option-value');
        // parse 'false' as false boolean
        value = value === 'false' ? false : value;
        options[ key ] = value;
        
		$container.isotope( options );
        return false;
 });


$('.dStyles-inner').isotope({
		layoutMode : 'fitRows'});

var $container2 = $('.tours-wrapper');
if($container2.length){
	$container2.isotope({
		layoutMode : 'fitRows',
		filter: '*',
		animationOptions: {duration: 750,easing: 'linear',queue: false}
		});
}

$('.filter-out li a').click(function(){
$('.filter-out li').removeClass("active");
$(this).parent().addClass("active");
  var selector = $(this).attr('data-filter');
  $container2.isotope({
		filter: selector,
		animationOptions: {duration: 750,easing: 'linear',queue: false}
		});
  return false;
});

/*===========================================
	Votes (likes of particular travel)
==============================================*/
$(".vote-slider").slider(
{
	min: 0,
	max: 1000,
	step:1,
	
	slide: function(event, ui) {
			var delay = function() {
			if(ui.value>=1000)
			{
				$('.ttl-hearts').text(ui.value);
			}
			else
			{
				$('.ttl-hearts').text(ui.value );
			}
			$('.lable').position({
                my: 'center top',
                at: 'center top',
                of: ui.handle,
                offset: "0, 10"
            });
			};
			setTimeout(delay, 5);
	}
	
});

$('.star-options li').click(function(){
	
	var state = $(this).data('toggleState');
	if(state){
		$(this).removeClass("active");
	} 
	else 
	{
		$(this).addClass("active");
		
	}
	$(this).data('toggleState', !state);
});	

/*===========================================
	Add Active Classes to the selected link
==============================================*/
$('.sortby li a').click(function(){
	$('.sortby li').removeClass('active');
    $(this).parent().addClass("active");
});

$('.sort-asc-desc li a').click(function(){
	$('.sort-asc-desc li').removeClass('active');
    $(this).parent().addClass("active");
});


$('.optionset1.option-box').click(function(){
	$('.optionset1.option-box').removeClass('active');
    $(this).addClass("active");
});	
	
$('.price-options .head').click(function(){
	var state = $(this).data('toggleState');
	if(state){
		$(this).siblings().show();
	} 
	else 
	{
		$(this).siblings().hide();
	}
	$(this).data('toggleState', !state);
	$(this).children().toggleClass('icon-caret-down icon-caret-right');
	
});

$('.optionset2.option-box').click(function(){
	$('.optionset2.option-box').removeClass('active');
    $(this).addClass("active");
});

$('.optionset3.option-box').click(function(){
	$('.optionset3.option-box').removeClass('active');
    $(this).addClass("active");
});

$('.optionset4.option-box').click(function(){
	$('.optionset4.option-box').removeClass('active');
    $(this).addClass("active");
});

$('.optionset5.option-box').click(function(){
	$('.optionset5.option-box').removeClass('active');
    $(this).addClass("active");
});


$('.lorem-options .head').click(function(){
	var state = $(this).data('toggleState');
	if(state){
		$(this).siblings().show();
	} 
	else 
	{
		$(this).siblings().hide();
	}
	$(this).data('toggleState', !state);
	$(this).children().toggleClass('icon-caret-down icon-caret-right');
	
});

/*===========================================
	Mobile Menu
==============================================*/
$('#mobile').mobileMenu({
		defaultText: 'Navigate To...',
		className: 'mobile-menu',
		subMenuDash: '&ndash;'
});

/*===========================================
	Price Range slider
==============================================*/

$(".price-slider").slider(
{
	min: 100,
	max: 1500,
	step:100,
	
	slide: function(event, ui) {
			var delay = function() {
			/*$('.lbl').css('left', $('.ui-slider-handle').css('left'));*/
			if(ui.value>=1200)
			{
				
				$('.lbl').show();
				$('.lbl span').text('$'+ui.value );
				$('.lbl .slider-disount').text('$'+ (ui.value+300));
				if(ui.value===1200)
				{
					$('.booking-detail').text("3 days 2 nights");
				}
			}
			else
			{
				$('.lbl').hide();
				
			}
			if(ui.value===1200)
			{
				$('.booking-detail').text("3 days 2 nights");
			}
			else if(ui.value===1300)
			{
				$('.booking-detail').text("4 days 3 nights");
			}
			else if(ui.value===1400)
			{
				$('.booking-detail').text("5 days 4 nights");
			}
			else if(ui.value===1500)
			{
				$('.booking-detail').text("Grand Package for whole week");
			}
			else
			{
				$('.booking-detail').text("Increase range; No offer in this price range!");
			}
			$('.lbl').position({
                my: 'center top',
                at: 'center top',
                of: ui.handle,
                offset: "0, 10"
            });
			};
			setTimeout(delay, 5);
	}
	
});


/*===========================================
	Layer Slider
==============================================*/
	jQuery('#home-slider').layerSlider({
		skinsPath : 'assets/ls_skins/',
        skin : 'fullwidth',
        hoverPrevNext : false,
		thumbnailNavigation :false,
        responsive : true,
        sublayerContainer : 978,
        navStartStop:false,
        imgPreload:true
    });
	
	jQuery('#home-slider-2').layerSlider({
		skinsPath : 'assets/ls_skins/',
        skin : 'fullwidth',
        hoverPrevNext : false,
		thumbnailNavigation :false,
        responsive : true,
        sublayerContainer : 880,
        navStartStop:false,
        imgPreload:true
    });
	
	jQuery('#home-slider-3').layerSlider({
        skinsPath : 'assets/ls_skins/',
        skin : 'fullwidth',
        hoverPrevNext : false,
		thumbnailNavigation :false,
        responsive : true,
        sublayerContainer : '100%',
        navStartStop:false,
        imgPreload:true
    });

/*===========================================
	Responsive Adjusting Layout 
==============================================*/

$(window).on("resize", function () {
	
	console.log($(window).width());
	
	if($(window).width() <=959)
	{
		if( $('#tours-container').hasClass('layout-2'))
		{
			$('#tours-container').removeClass('layout-2').addClass('layout-1');
		}
	}
	else if( $('#tours-container').hasClass('layout-1'))
	{
		$('#tours-container').removeClass('layout-1').addClass('layout-2');
	}
	
	if($(window).width() <=959)
	{
		$('#booking-tabs').addClass('nav-stacked');
				
	}
	else if( $('#booking-tabs').hasClass('nav-stacked'))
	{
		$('#booking-tabs').removeClass('nav-stacked');
	}
	
	$('.detail-inner').carouFredSel(
	{
		width:'100%',
		height:430,
		auto:false,
		scroll: {
					fx: 'fade'
				},
		pagination: {
			container		: ".detail-thumbs",
			anchorBuilder	: function() {
				var src = $("img", this).attr( "src" );
				return "<div class='thumb-container'><img src='" + src + "' /> <div class='arrow'></div></div>";		
			}
		}		
});


/*===========================================
	CarouselFredsel Carousel 
==============================================*/

$('.rs-slider').refineSlide({
			transition: 'slideH',
            maxWidth:'100%' // set to native image width (px)
 });




 

$('.detail-inner2').carouFredSel(
{
	width:'100%',
	height:430,
	auto:false,
	scroll: {
		fx: 'fade'
		},
	prev	: {	
		button	: ".detail-next",
		key		: "left"
	},
	next	: { 
		button	: ".detail-prev",
		key		: "right"
	},
	pagination: {
		container		: ".detail-thumbs-horizontal",
		anchorBuilder	: function() {
			var src = $("img", this).attr( "src" );
		return "<div class='thumb-container'><img src='" + src + "' /> <div class='arrow'></div></div>";		
		}
	}		
	
});



$('#filter-tours').carouFredSel(
{
	width: "100%",
	circular: true,
	infinite: false,
	auto:false,
	scroll	: {
		items:1,
		easing			: "linear"
		}  ,
	height:100,
	prev	: {	
		button	: ".left-arrow",
		key		: "left"
	},
	next	: { 
		button	: ".right-arrow",
		key		: "right"
	}
});

$('.goto-page').carouFredSel(
{
	width: "100%",
	circular: true,
	infinite: true,
	auto:true,
	scroll	: {
		items:1,
		easing			: "linear",
		pauseOnHover: true,
		}  ,
	height:40,
	
});

$('.bottom-liner').carouFredSel(
{
	width: "100%",
	circular: true,
	infinite: false,
	auto:true,
	scroll	: {
		items:1,
		easing			: "linear",
		pauseOnHover: true,
		},
		height:70,
});

$('.single-tab').carouFredSel(
{
	width: "100%",
	circular: true,
	infinite: false,
	auto:false,
	scroll	: {
		items:1,
		easing			: "linear"
				}  ,
	height:140,
	prev	: {	
		button	: ".left-arrow-tab",
		key		: "left"
	},
	next	: { 
		button	: ".right-arrow-tab",
		key		: "right"
	}
});


$('.offerCarousel-inner').carouFredSel(
{
	width: "100%",
	circular: true,
	infinite: false,
	auto:false,
	scroll	: {
		items:1,
		easing			: "linear"
				}  ,
	height:140,
	prev	: {	
		button	: ".left-slide",
		key		: "left"
	},
	next	: { 
		button	: ".right-slide",
		key		: "right"
	}
});
}).resize();


/*===========================================
	Custom Tabs
==============================================*/
$('.single-tab li').click(function(){
    $('.single-tab li').removeClass("active");
    $(this).addClass("active");
	var selector = $(this).attr('data-tabcontrol');
	var selector2 = $(this).attr('data-carausel');
	$('.tab-area').hide();
	$(selector).fadeIn(600);
	$(selector2).carousel();
	
});

$(".datepicker").datepicker();

$('#booking-tabs a').click(function (e) {
	e.preventDefault();
	$(this).tab('show');
});
})(jQuery);