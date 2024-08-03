
 // Created by Anu Ganesh


// window.onload = function () {
//     const mainInput = document.querySelector('.nepali-datepicker');
//     mainInput.nepaliDatePicker();
//
//     // var mainInput2 = document.getElementById("nepali-datepicker2");
//     // mainInput2.nepaliDatePicker();
// };

//Accordion script
// const accordion = document.getElementsByClassName('contentBox');
//
// for (i = 0;i<accordion.length;i++) {
//     accordion[i].addEventListener('click', () => {
//         this.classList.toggle('active');
//     })
// }

var winWidth = $(window).width();

$(document).ready(function () {
    sliderInit();
    addClassInit();
    navInit();
    mcustomInit();
    showTable();
    mobileNavToggle();
});

$(document).on('click', 'ul li', function () {
    $(this).addClass('active').siblings().removeClass('active');
});

$('#search-btn').click(function () {
    $('body').addClass('table-menu');
});

$('#case-search-btn').click(function () {
    $('body').addClass('show-table');
});


/*------------------------------- Functions Starts -------------------------------*/
function sliderInit() {
    /*$('.common-banner-slider').slick({
        arrows: false,
        dots: true,
        autoplay: false,
        speed: 500,
        fade: true,
        pauseOnHover: false,
        cssEase: 'linear',
        slidesToShow: 2,
        slidesToScroll: 1,
        responsive: [
            {
                breakpoint: 667,
                settings: {
                    arrows: true,
                    dots: false
                }
            }
        ]
    });*/

}

function addClassInit() {

}

function showTable() {
    $("#case-search-btn").click(function () {
        $("#case-info-section").show();
    });
}

function navInit() {

}

function mcustomInit() {

}

 //Scripts for mobile toggle menu
 // const mobileToggle = document.querySelector('.toggle-btn');
 // const navList = document.querySelector('.nav-list');
 // const mainSection = document.querySelector('.main-section');
 //
 //
 // mobileToggle.onclick = () => {
 //     navList.classList.toggle('show');
 //     mainSection.classList.toggle('hide');
 // }

 function mobileNavToggle() {
     $(".toggle-btn").click(function() {
         $(".nav-list").toggleClass("show");
         $(".main-section").toggleClass("hide");
     })
 }


/*-------------------------------- Functions Ends --------------------------------*/

/* JS for top-header */
// const nepaliLanguage = document.getElementById('nepali');

// nepaliLanguage.addEventListener('click', () => {
//     nepaliLanguage.classList.add('current');
// });

// let searchBtn = document.getElementById('search-btn');
// let table = document.getElementById('cases-list');
// searchBtn.addEventListener('click', () => {
//     table.style.display = 'block';
// });

// /* JS for dastur.php */


// const searchBtn = document.getElementById('search-btn');
// const casesTableSection = document.getElementById('cases-table-section');

// searchBtn.addEventListener('click', () => {
//     casesTableSection.style.display = "block";
// });

window.onload = function () {
    // if (document.getElementById("nepali-datepicker")) {
    //     let mainInput = document.getElementById("nepali-datepicker");
    //     mainInput.nepaliDatePicker();
    // }
    if (document.querySelector(".nepali-datepicker")) {
        // let mainInput = document.querySelector(".nepali-datepicker");
        // mainInput.nepaliDatePicker();
        let mainInputs = document.querySelectorAll(".nepali-datepicker");
        mainInputs.forEach(mainInput => {
            mainInput.nepaliDatePicker();
        })
    }
}

// validateTarikh();

// document.getElementById('badi').onclick = () => {
//     // validateTarikh();
// }

// document.getElementById('prativadi').onclick = () => {
//     // validateTarikh();
// }

// function validateTarikh() {
//     if ((document.getElementById('badi').checked || document.getElementById('prativadi').checked)) {
//         document.getElementById('tarikh').disabled = false;
//     } else {
//         document.getElementById('tarikh').disabled = true;
//
//     }
// }



 const accordionTitles = document.querySelectorAll('.accordion-title');
 accordionTitles.forEach((accordionTitle) => {
     accordionTitle.addEventListener('click', () => {
         accordionTitle.nextElementSibling.classList.toggle('show');
     })
 })


// function showTable() {
//     const casesTableSection = document.getElementById('cases-table-section');
//     casesTableSection.style.display = 'block';
// }



