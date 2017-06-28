<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://jp.co.comnic/lesson/webapp/article/taglibs/html-extension" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/grid-guide.css" /> -->
<title>記事の削除</title>
</head>
	<body>
<jsp:include page="page-header.jsp"></jsp:include>

<div class="boxA">
	<div class="box3">
		<article class="article-list">
		<p>記事の削除</p>
		<form id="del" method="post" action="article/remove.do">
				<th><label for="delete">削除する記事</label></th>
			<td>
				<h:select table="ARTICLE" dataSource="ds/article" name="article_id">
					<h:option value="article_id" display="title" />
				</h:select>
			</td>
		</form>
		</article>
</div>

	<div class="box4">
	<p>選択した記事を削除します。</p>
	<p>記事を選択し、削除ボタンを押してください。</p>
	<br><br><br></br></br></br></br></br>
		<button form="del">削除</button>
	<aside class="sidemenu">
		<a href="top.jsp"><button>戻る</button></a>
	</aside>
	</div>
</div>

<jsp:include page="page-footer.jsp"></jsp:include>

</body>
</html>