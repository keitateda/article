<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/grid-guide.css" /> -->
<title>top</title>
</head>

<body>
<div class="main">

<div class="box1">
	<div class="site">
		<h1>Brog Site</h1>
	</div>
</div>

<!-- おそらくpage-header.jspに記述 -->
<div class="box2">
	<nav class="menu">
		<ul>
			<li><a href="top.html">TOP</a></li>
			<li><a href="newArticle.html">新規投稿</a></li>
			<li><a href="#">ユーザ</a></li>
			<li><a href="login.html">ログアウト</a></li>
		</ul>
	</nav>
</div>
<!----------------------------->

<div class="boxA">
	<div class="box3">
		<article class="article-list">
		<p>記事タイトル一覧</p>
			<ul>
			<li><a href="#">記事<a></li>
			<li><a href="#">記事<a></li>
			<li><a href="#">記事<a></li>
			<li><a href="#">記事<a></li>
			<li><a href="#">記事<a></li>
			</ul>
		</article>
	</div>

	<div class="box4">
		<aside class="sidemenu">
		<h1>記事検索</h1>
		<input type="search" placeholder="記事のタイトルor日付を入力"/>
		<button>検索</button>
	<aside class="sidemenu">
		<h1>記事編集</h1>
		<input type="search" placeholder="記事のタイトルを入力"/>
		<a href="edit-article.html"><button>編集</button></a>
		<a href="delete.html"><button>削除</button></a>
	</aside>
	</div>
</div>

<!-- おそらくpage-footer.jspに記述 -->

<div class="box5">
	<div class="copyright">
	<p>Copyright &copy; Brog Site</p>
	</div>
</div>

<!------------------------------>
</body>

</html>
