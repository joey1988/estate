//方法调用
$(window).ready(function() {
    AllWidth();
});
$(window).resize(function(){
	AllWidth();
});

//宽高度计算
function AllWidth() {
	var width  = $(document.body).width();
	var height  = $(window).height();
	$('.TwoLinkageRight').css('height',height-40);
	$('.TwoLinkageRightIn').css('height',height-40);
}

//轮播图
$(document).ready(function(){
	$(".main_visual").hover(function(){
		$("#btn_prev,#btn_next").fadeIn()
	},function(){
		$("#btn_prev,#btn_next").fadeOut()
	});
	$dragBln = false;
	$(".main_image").touchSlider({
		flexible : true,
		speed : 200,
		//delay: 5000,
		btn_prev : $("#btn_prev"),
		btn_next : $("#btn_next"),
		paging : $(".flicking_con a"),
		counter : function (e){
			$(".flicking_con a").removeClass("on").eq(e.current-1).addClass("on");
		}
	});
	timer = setInterval(function(){
		$("#btn_next").click();
	}, 5000);
});

$(document).ready(function(e){
	$('.c-alter').click(function(){
		$('#alter').removeClass('none');
		setTimeout(function(){
			$('#alter').addClass('none');
		},3000);
	});
});