<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/grid-guide.css" /> -->
<title>記事の編集</title>
</head>
<body>
<jsp:include page="page-header.jsp"></jsp:include>

<div class="boxA">
	<div class="box3">
		<article class="article-list">
		<p>記事の編集</p>
		<form method="post" action="#">
				<input type="title" placeholder="タイトル"/>
				<input type="date" name="date"/>
				<textarea name="msg" cols="30" rows="10" wrap="" placeholder="内容を入力"></textarea>
		</form>
		</article>
	</div>

<div class="box4">
	<p>記事の編集ができます。</p>
	<p>完了したら編集完了ボタンを押してください。</p>
	<br><br><br></br></br></br></br></br>
		<button>投稿</button>
	<aside class="sidemenu">
		<a href="top.jsp"><button>戻る</button></a>
	</aside>
	</div>
</div>


</div>

<jsp:include page="page-footer.jsp"></jsp:include>

</body>
</html>