<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/grid-guide.css" /> -->
<title>記事の削除</title>
</head>
	<body>
	<div class="box1">
		<div class="site">
			<h1>Brog Site</h1>
		</div>
	</div>

<jsp:include page="page-header.jsp"></jsp:include>

<div class="boxA">
	<div class="box3">
		<article class="article-list">
		<p>記事の削除</p>
		<form method="post" action="#">
				<input type="title" placeholder="指定した記事タイトルが出るように"/>
				<input type="date" name="指定した日付が出るように"/>
		</form>
		</article>
</div>

	<div class="box4">
	<p>指定した記事を削除します。</p>
	<p>よろしければ削除ボタンを押してください。</p>
	<br><br><br></br></br></br></br></br>
		<button>削除</button>
	<aside class="sidemenu">
		<a href="top.html"><button>戻る</button></a>
	</aside>
	</div>
</div>

<jsp:include page="page-footer.jsp"></jsp:include>

</body>
</html>