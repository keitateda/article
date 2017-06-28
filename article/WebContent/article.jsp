<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link rel="stylesheet" type="text/css" href="css/stylesheet.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/grid-guide.css" /> -->
	<c:if test="${!empty param.id}">
	<sql:query var="allcontents" dataSource="ds/article">
		SELECT * FROM ARTICLE WHERE article_id = ${param.id}
	</sql:query>
	<c:set var="articles" value="${allcontents.rows[0]}"/>
	</c:if>
	
	<c:if test="${!empty param.find}">
	<sql:query var="findbytitle">
		SELECT * FROM ARTICLE WHERE title = ${param.find}
	</sql:query>
	<c:set var="articles" value="${findbytitle.row[0]}"/>
	</c:if>

<title>top</title>
</head>

<body>
<jsp:include page="page-header.jsp"></jsp:include>

<div class="boxA">
	<div class="box3">
		<article class="article-list">
			<p>記事内容</p>
				<ul>
				<li>タイトル :${articles.title}</li>
				<li>日付:${articles.upload_day}</li>
				<li>内容</li>
				<li>${articles.contents}</li>
				</ul>
		</article>
	</div>
	<div class="box4">
	<br><br><br></br></br></br></br></br>
	<br><br><br></br>	
	<aside class="sidemenu">
		<a href="top.jsp"><button>戻る</button></a>
	</aside>
	</div>
</div>

<jsp:include page="page-footer.jsp"></jsp:include>

</body>
</html>