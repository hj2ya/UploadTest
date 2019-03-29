<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function(){
	
	  $("img").mouseover(function(){
		  var src=$(this).attr("src");
		  src=src.substring(src.lastIndexOf("/")+1).substring(0,src.substring(src.lastIndexOf("/")+1).lastIndexOf("."));		  
		  if(parseInt(src)>=5 && parseInt(src)<=6){
			  src='/web/image/'+((eval(src))+1)+'.jpg';
		  }else{
			  src='/web/image/5.jpg';
		  }
		  //$(this).attr({"src":"1.jpg","title":'규환짱'b})
		 $(this).attr({"src":src,"width":300,"height":300,"title":'규환짱'});
	  });
	
	
});

</script>
</head>
<body>
<img alt="" src="/web/image/5.jpg" height="200" width="200">
<img alt="" src="/web/image/6.jpg" height="200" width="200">
<img alt="" src="/web/image/7.jpg" height="200" width="200">

</body>
</html>

