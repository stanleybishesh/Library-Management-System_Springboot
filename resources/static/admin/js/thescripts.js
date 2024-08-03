/**
 * Created by Sushant Gauchan
 * Email : sushant.gauchan11@gmail.com
 */

var $ = jQuery;
var winWidth = $(window).width();

// // Dropify starts
// $('.dropify').dropify();
// // Dropify ends

$(document).ready(function () {
//  sliderInit();
  navInit();
  addClassInit();
  modalInit();
  mcustomInit();
  smootScroll();
});

/*------------------------------- Functions Starts -------------------------------*/
//function sliderInit() {
//  $('.common-banner-section .banner-slider').slick({
//    arrows: true,
//    dots: false,
//    autoplay: false,
//    speed: 500,
//    fade: true,
//    pauseOnHover: false,
//    cssEase: 'linear',
//    slidesToShow: 1,
//    slidesToScroll: 1,
//  });
//
//  /*    $('.product-gallery-slider').slick({
//		 slidesToShow: 1,
//		 slidesToScroll: 1,
//		 arrows: false,
//		 fade: true,
//		 asNavFor: '.product-gallery-nav'
//	 });
//
//	 $('.product-gallery-nav').slick({
//		 slidesToShow: 5,
//		 slidesToScroll: 5,
//		 asNavFor: '.product-gallery-slider',
//		 dots: false,
//		 arrows: false,
//		 focusOnSelect: true,
//		 responsive: [
//			 {
//				 breakpoint: 767,
//				 settings: {
//					 slidesToShow: 1,
//					 slidesToScroll: 1,
//					 infinite: true,
//					 dots: true
//				 }
//			 },
//		 ]
//	 });*/
//}

function navInit() {
  var scrollTop = 0;
  jQuery(window).scroll(function () {
    scrollTop = jQuery(window).scrollTop();
    jQuery('.counter').html(scrollTop);
    if (scrollTop >= 150) {
      jQuery('#header-wrapper').addClass('nav-scroll');
    } else if (scrollTop < 150) {
      jQuery('#header-wrapper').removeClass('nav-scroll');
    }
  });

  $('ul.menu-container > li.has-sub-menu > a').click(function (e) {
    e.preventDefault();
    if ($(this).parents('li').hasClass('open')) {
      $('.has-sub-menu').removeClass('open');
      $(this).parents('li').removeClass('open');
    } else {
      $('.has-sub-menu').removeClass('open');
      $(this).parents('li').addClass('open');
    }
  });
  /*    $('.has-submenu > a').click(function (e) {
		 event.preventDefault();
	 })*/

  /*$('.menu-item-has-children').click(function () {
		 $(this).parent('li').children('ul').addClass('open');
	 })*/
}

function addClassInit() {
  $(document).ready(function () {
    $('.common-sidebar > li > .answer').hide();

    $('.common-sidebar > li').click(function () {
      if ($(this).hasClass('active')) {
        $(this).removeClass('active').find('.answer').slideUp();
      } else {
        $('.common-sidebar > li.active .answer').slideUp();
        $('.common-sidebar > li.active').removeClass('active');
        $(this).addClass('active').find('.answer').slideDown();
      }
      return false;
    });
  });
}

function modalInit() {
  /*$('#theModal').modal('show');*/
  /*$('.login-signup-action a').click(function (e) {
	  e.preventDefault();
	  $('.login-signup-action ul li').removeClass('active');
	  signup();
	  });*/
}

function mcustomInit() {
  /*$(".your-class").mCustomScrollbar({
		 theme:"minimal",
		 axis:"x" // horizontal scrollbar
	 });*/
}

function smootScroll() {
  // hide #back-top first
  $('#common-back-top').hide();

  // fade in #back-top
  $(function () {
    $(window).scroll(function () {
      if ($(this).scrollTop() > 100) {
        $('#common-back-top').fadeIn();
      } else {
        $('#common-back-top').fadeOut();
      }
    });

    // scroll body to 0px on click
    $('#common-back-top a').click(function () {
      $('body,html').animate(
        {
          scrollTop: 0,
        },
        1000
      );
      return false;
    });
  });
}

/*-------------------------------- Functions Ends --------------------------------*/

const charts = document.querySelectorAll('.myChart');
charts.forEach((chart) => {
  const myChart = new Chart(chart, {
    type: 'pie',
    data: {
      labels: ['पुरुष', 'महिला', 'अन्य'],
      datasets: [
        {
          label: 'My First Dataset',
          data: [300, 50, 100],
          backgroundColor: [
            'rgb(54, 162, 235)',
            'rgb(255, 99, 132)',
            'rgb(255, 205, 86)',
          ],
          hoverOffset: 4,
        },
      ],
    },
    options: {
      scales: {
        y: {
          beginAtZero: true,
        },
      },
    },
  });
});

// scripts for getting the current date starts
document.getElementById('year').innerHTML = new Date().getFullYear();
// scripts for getting the current date ends

// Nepali DatePicker Initialize
window.onload = function() {
	var dateInputs = document.querySelectorAll(".nepali-datepicker");
	dateInputs.forEach(dateInput => {
		dateInput.nepaliDatePicker();
	})
};

//Refresh button animation on click
const refreshBtns = document.querySelectorAll('.refresh-btn');
refreshBtns.forEach(refreshBtn => {
	refreshBtn.addEventListener('click', ()=> {
		refreshBtn.classList.add('rotate');
	})
})

const viewBtns = document.querySelectorAll('.view-btn');
const modal = document.querySelector('.common-citizen-modal');
const modalDialog = document.querySelector('.common-citizen-modal .modal-dialog');
viewBtns.forEach(viewBtn => {
	viewBtn.addEventListener('click', () => {
		modal.classList.toggle('show');
	})
	modalDialog.parentElement.addEventListener('click', ()=> {
		modal.classList.toggle('show');
	})
})

const profileMenuToggle = document.querySelector('.profile-menu-toggle');
const profileMenu= document.querySelector('.profile-dropdown-menu');

profileMenuToggle.addEventListener('click', () => {
    profileMenu.classList.toggle('show');
})


//const sidebarMenuHeadings = document.querySelectorAll('.sidebar-menu-heading');
//sidebarMenuHeadings.forEach(sidebarMenuHeading => {
//    sidebarMenuHeading.addEventListener('click', () => {
//        sidebarMenuHeading.nextElementSibling.classList.remove('show');
//        sidebarMenuHeading.nextElementSibling.classList.toggle('show');
//    })
//})


const navControl = document.querySelector('.nav-control');
const sidebarMenu = document.querySelector('.sidebar-menu');
const sidebarMenuHeadings = document.querySelectorAll('.box-title .nav-text');
const contentBody = document.querySelector('.content-body');
const footer = document.querySelector('.footer');

sidebarMenuHeadings.forEach(sidebarMenuHeading => {
    navControl.addEventListener('click', () => {
        sidebarMenu.classList.toggle('reduceSize');
        sidebarMenuHeading.classList.toggle('hide');
        contentBody.classList.toggle('full-width');
        footer.classList.toggle('large-width');
    })
})



