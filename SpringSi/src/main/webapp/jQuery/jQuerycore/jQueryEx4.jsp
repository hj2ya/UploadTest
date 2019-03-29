<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
<script type="text/javascript">  
  $(function(){
	  //index 0과 같은 li     0부터 1번째줄
	  //$(".container li:eq(0)").css({"background-color":'blue'});
	  //li index가 2초과 
	  //$(".container li:gt(2)").css({"background-color":'blue'});
	  //li index가 2미만 
	  //$(".container li:lt(2)").css({"background-color":'blue'});
	  //li index가 처음
	  //$(".container li:first").css({"background-color":'blue'});
	  //header
	  //$(":header").css({"background-color":'blue'});
	  // li index가 홀수  
	  /* $(".container li:odd").css({"background-color":'blue'});
	  // li index가 짝수만
	  $(".container li:even").css({"background-color":'red'}); */
	  //// li index가 2가 아닌 모든 것 
	  //$(".container li:not(:eq(2))").css({"background-color":'blue'});
	  //fadeout 점점 흐려짐 
	  //fadein 점점 선명
	 /* $("ul li").click(function(){
		 //alert($(this).text());
		 //$(this).fadeOut(1000).fadeIn(1000).slideUp(1000).slideDown(1000);
		 
	 });  */
	 //contain은 C로 포함하면 ...
	 //$(".container li:contains('C')").css({"background-color":'blue'});
	 //li가 blank이면 
	  //$(".container li:empty").text("XML").css({"background-color":'blue'});
	 //li의 부모 ul
	  //$(".container li:parent").css({"background-color":'red'});
	 //has는 input 
	  //$(".container:has(input)").css({"background-color":'blue'});
	 
/* 	   $(".html").css({display:"none"});
	   $(".container li:hidden").css({display:"block","background-color":"red"}); */
	   
	   //$("li:first-child").css({"background-color":"pink"});
	    //$("li:last-child").css({"background-color":"pink"});
	    //$("li:nth-child(2)").css({"background-color":"pink"});
	     $("li:nth-child(even)").css({"background-color":"pink"});
	     $("li:nth-child(odd)").css({"background-color":"red"}); 
	  $("li:nth-child(2n+1)").css({"background-color":"pink"});
	      
	     
  });  
</script>
</head>
<body>
<h1 class="title">JQueryStyle</h1>
<div class="container">
  <input>
    <ul id="tul">
      <li class="html">HTML</li>
      <li class="css">CSS</li>
      <li class="css3">CSS3</li>
      <li class="javascript">JAVASCRIPT</li>
      <li class="jquery">JQUERY</li>
      <li class="blank"></li>
    </ul>
    <p id="pf">JQueryCss</p>
</div>
</body>
</html>