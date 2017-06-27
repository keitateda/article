<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/grid-guide.css" /> -->
<title>top</title>
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
			<p>記事タイトル一覧</p>
				<ul>
				<li>タイトル</li>
				<li>日付</li>
				<li>内容</li>
				</ul>
		</article>
		<p>（記事用のレイアウト）</p>
	</div>
</div>

<jsp:include page="page-footer.jsp"></jsp:include>

</body>
</html>