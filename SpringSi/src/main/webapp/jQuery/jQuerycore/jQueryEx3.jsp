<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
<style type="text/css">
  body{
   margin: 20px;
   padding: 20px;
   line-height: 1;
   font-family: "휴먼매직체";
   font-size:  1em;
   background: #555;
   color: #000;
  }
  .title{
   margin: 0;
   padding: 0;
   font-size: 1.5em;
   font-weight: 300;
  }
  ul,li{
   margin: 0;
   padding: 0;
   list-style: none;
  }
  li{
    margin-top: 20px;
  }
  .container{
   margin-top: 35px;
  }
</style>
<script type="text/javascript">  
  $(function(){
	 /* /*  //console.log($("h1").text("수정이 왔니? 대답 해.. 수정아.."));
	  //console.log($("h1").first());
	  /* $(".container").css({"background-color":"#666"});
	  $(".container > p").css({"background-color":"pink"});  컨테이너안에있는 p태그 핑크
	  $(".html + li").css({"background-color":"yellow"});   html class 다음 줄에있는 li 옐로우
	  $(".html ~ li").css({"background-color":"blue"}); */ // html class 다음 줄 전부 블루
/* 	  $("li[class='html']").css({"background-color":"blue"});	  
	  $("li[class$='css']").css({"background-color":"orange"});
	  //$특정열로 끝나는거
	  $("li[class^='bl']").css({"background-color":"cyan"});
	//^특정열로 시작
	  $("li[class*='j']").css({"background-color":"cyan"});
	//*j가들어간것 */ 
	/* $("div[class='a']").hide(1000).show(1000).slideDown(1000).slideup(1000).fadeOut(1000).fadeIng(1000);
	$("div[class='b']").css()*/
	   
  }); 
  
  
  
</script>
</head>
<body>
<!-- <div class="parent">
	<div class="a">박진하</div>
	<div class="a">김지민</div>
	<div class="a">이규환</div>
	<div class="b">이수정</div>
	<div class="b">안태영</div>
	<div class="b">윤장규</div>
	<div class="b">이봉헌</div>
</div> -->

<h1 class="title">JQueryStyle</h1>
<div class="container">
    <ul id="tul">
      <li class="html">HTML</li>
      <li class="css">CSS</li>
      <li class="css3">CSS3</li>
      <li class="javascript">JAVASCRIPT</li>
      <li class="cssjquery">JQUERY</li>
      <li class="blank">hihihi</li>
    </ul>
    <p id="pf">JQueryCss</p>
</div>

<!-- <pre class="a">현재시간</pre>
<pre class="b">2019년</pre>
<pre class="c">03월</pre>
<pre class="d">28일</pre>
<pre class="e">목요일</pre>
<pre class="f">15시</pre>
<pre class="g">05분</pre> -->


</body>
</html>






