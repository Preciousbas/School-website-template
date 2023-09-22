//let slideIndex = 0;
//showSlides();

//function showSlides() {
 // let i;
 // let slides = document.getElementsByClassName(".slides");
 // for (i = 0; i < slides.length; i++) {
 //   slides[i].style.display = "none";
 // }
 // slideIndex++;
 // if (slideIndex > slides.length) {slideIndex = 1}
 // slides[slideIndex-1].style.display = "block";
 // setTimeout(showSlides, 2000); // Change image every 2 seconds
//

//let index = 0;

//function next(){
//	slides[index].classList.remove('active');
//	index = (index + 1) % slides.length;
//	slides[index].classList.add('active');
//}

//	slides[index].classList.remove('active');
//	index = (index - 1 + slides.length) % slides.length;
//	slides[index].classList.add('active');
//
//setInterval(next, 2000);
const slides = document.querySelector('.slides');
const slide = slides.getElementsByTagName('.img');
const i = 0;

function nextSlides(){
	slides[i].classList.remove('active');
	i = (i + 1) % slides.length;
	slides[i].classList.add('active');
}