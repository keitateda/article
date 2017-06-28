<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/grid-guide.css" /> -->
<title>新規投稿</title>
</head>
	<body>
<jsp:include page="page-header.jsp"></jsp:include>

<div class="boxA">
	<div class="box3">
		<article class="article-list">
		<p>新規投稿</p>
		<form method="post" action="article/insert.do">
		<fieldset>
				<input type="text" name="title" placeholder="タイトル"/>
				<input type="date" name="uploadDay"/>
				<input type="text" name="uploadName"placeholder="投稿者"/>
				<input type="text" name="category"placeholder="カテゴリ"/>
				<button>投稿</button>
				
				<textarea name="contents" cols="30" rows="10" wrap="" placeholder="内容を入力"></textarea>
		</fieldset>		
		</form>
		</article>
	</div>

	<div class="box4">
		<p>新しく投稿する記事を作成します。</p>
		<p>タイトル・日付・内容を入力して下さい。</p>
			<br><br><br></br></br></br></br></br>
		<aside class="sidemenu">
		<!--　<button>投稿</button> -->
		<a href="top.jsp"><button>戻る</button></a>
		</aside>
	</div>
</div>


</div>

<jsp:include page="page-footer.jsp"></jsp:include>

</body>
</html>