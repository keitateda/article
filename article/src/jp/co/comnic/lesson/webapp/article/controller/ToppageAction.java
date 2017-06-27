package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.lesson.webapp.article.dao.ArticleDao;
import jp.co.comnic.lesson.webapp.article.model.Article;

public class ToppageAction implements Action {
	ArticleDao ad;
	List<Article> articles = new ArrayList<>();
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		try {
			articles = ad.findAll();
			request.getSession().setAttribute("articles", articles);
			response.sendRedirect("top.jsp");
			
		} catch (Exception e) {
			// TODO: handle exception
			
		
		}
		
		
		
		
		return null;
	}

}
