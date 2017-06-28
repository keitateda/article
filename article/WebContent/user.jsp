<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
	<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
	<title>ユーザ</title>
</head>
<body>
	<jsp:include page="page-header.jsp"></jsp:include>
	<div class="boxA">
	<div class="box3">
		<article class="article-list">
		<p>ユーザ情報</p>
		<br></br>
		<p><img src="face.png" alt="アイコン" /></p>	
		<br>
			<ul>
				<li>userName・emailなど</li>
			</ul>
		</article>
	</div>

	<div class="box4">
		<p>ユーザの情報ページです。</p>
		<p>確認・編集ができます。</p>
		<p>(拡張)</p>
		<br><br><br></br></br></br></br></br>
			<button>編集</button>
		<aside class="sidemenu">
			<a href="top.jsp"><button>戻る</button></a>
		</aside>
	</div>
	</div>
</div>
<jsp:include page="page-footer.jsp"></jsp:include>
</body>
</html>