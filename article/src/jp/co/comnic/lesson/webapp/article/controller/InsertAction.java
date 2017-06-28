package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.lesson.webapp.article.dao.Basedao;
import jp.co.comnic.lesson.webapp.article.dao.CategoryDao;
import jp.co.comnic.lesson.webapp.article.dao.DaoException;
import jp.co.comnic.lesson.webapp.article.model.Article;
import jp.co.comnic.lesson.webapp.article.model.Category;

public class InsertAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse responce)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		String servletPath =request.getServletPath();
		
//		String redirectPath = "./";
		String fowardPath = "new";
		
		List<Article> articles = new ArrayList<>(); 
		
		try {
//			Object  entity = Class.forName(ContorollerUtils.getFullyQualitifiedClassName(servletPath)).newInstance();
//			ContorollerUtils.populateEntity(request, entity);
			
			
			// リクエスト・パラメーターの取得
			//　5つ分
			String title = request.getParameter("title");
			String contents = request.getParameter("contents");
			String uploadDay = request.getParameter("uploadDay");
			String name = request.getParameter("uploadName");
			String categoryId = request.getParameter("categoryId");
			//確認
			System.out.println("title:"+title);
			System.out.println("contents:"+contents);
			System.out.println("date:"+uploadDay);
			System.out.println("name:"+name);
			System.out.println("category:"+categoryId);
			
			//カテゴリインスタンスからidを検索して持ってくる
//			SimpleDateFormat().applyPattern(uploadDay);
			Date date = new SimpleDateFormat("yy-MM-dd").parse(uploadDay);
			Category category = new CategoryDao().findById(Integer.parseInt(categoryId));
			
			// パラメーターを使用してArticleインスタンスを生成
			Article x = new Article(title,contents,date,name,category);
			
			
			new Basedao().insert(x);
			
			fowardPath = null;
			articles = new ToppageAction().getAll();
			responce.sendRedirect("/article/top.jsp");
		} catch (DaoException e) {
			// TODO: handle exception
		
			request.setAttribute("error", "[エラー]:" + ContorollerUtils.getShortMessage(e)) ;
		
		}	
		catch (Exception e) {
			// TODO: handle exception
			
			throw new ServletException(e);
		}
		
		return fowardPath;
	}	
}
