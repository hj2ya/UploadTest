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
jQuery(function(){			//3��������������
	alert('test3');
});

$(document).ready(function(){
	alert('����¯');
	
}); */

$(function(){
	
	/* /* $("input[type='button']").click(function(){
		
		if(this.value=="����"){
		$("div").append("<img src='/web/image/1.jpg'>");
		}else if(this.value=="���"){
			$("div").html("<img src='/web/image/6.jpg' >");	
		}else{
			$("div").html("<img src='/web/image/7.jpg'>");
		}		
	});//button�� �ּ�    ��ư������ ȣ��� */
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
	
	case "����":		
	temp="������..";
		break;
	case "���":	
		$(this).val('���');
		temp="�������..";
		break;
	case "����":
		temp="����....";		
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
<input type="button" value="����" id="btn1">
<input type="button" value="���" id="btn2">
<input type="button" value="����" id="btn3"><br>
<div >


</div>

</body>
</html>