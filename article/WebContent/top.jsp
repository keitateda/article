<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<title>top</title>
</head>

<body>

<jsp:include page="page-header.jsp"></jsp:include>

<div class="boxA">
	<div class="box3">
		<article class="article-list">
		<h1>記事タイトル一覧</h1>
		<br>
			<ul>
				<c:forEach var="article" items="${articles}">
					<c:set var="id" value="${article.articleId}"/>
					<li><a href="article.jsp?id=${id}">記事:${article.title}</a></li>
				</c:forEach>
			</ul>
		</article>
	</div>
	<div class="box4">
		<aside class="sidemenu">
		<form  action="article.jsp">
		<p>記事検索</p>
		<input type="search" name="find" placeholder="記事のタイトルor日付を入力"/>
		<a href="article.jsp"><button>検索</button></a>
		</form>
	<aside class="sidemenu">
		<form action="">
		<p>記事編集</p>
		<input type="search" placeholder="記事のタイトルを入力"/>
		<a href="edit-article.jsp"><button>編集</button></a>
		<a href="delete.jsp"><button>削除</button></a>
		</form>
	</aside>
	</div>
</div>

<jsp:include page="page-footer.jsp"></jsp:include>
</body>

</html>
