<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
/* 	$(function(){
		
		alert('test');
	});
jQuery(function(){			//3가지형식이있음
	alert('test3');
});

$(document).ready(function(){
	alert('지민짱');
	
}); */

$(function(){
	
	/* /* $("input[type='button']").click(function(){
		
		if(this.value=="봉쓰"){
		$("div").append("<img src='/web/image/1.jpg'>");
		}else if(this.value=="비어"){
			$("div").html("<img src='/web/image/6.jpg' >");	
		}else{
			$("div").html("<img src='/web/image/7.jpg'>");
		}		
	});//button의 주소    버튼누르면 호출됨 */
	/* 
	$($("input")[0]).click(function(){
		$("div").append("<img src='/web/image/6.jpg' >");
		$("img").click(function(){
			$(this).hide(1000);
		});
	}); */
	
$("input").click(function(){
	//alert(this.value+"  "+$(this).val());
	
	var temp="";
	switch ($(this).val()) {	
	
	case "봉쓰":		
	temp="봉쓰형..";
		break;
	case "비어":	
		$(this).val('비어');
		temp="봉스비어..";
		break;
	case "하이":
		temp="가자....";		
		break;
	default:
		break;
	}
	$(this).val(temp);
	
});
	
}); 

</script>
</head>
<body>
<input type="button" value="봉쓰" id="btn1">
<input type="button" value="비어" id="btn2">
<input type="button" value="하이" id="btn3"><br>
<div >


</div>

</body>
</html>