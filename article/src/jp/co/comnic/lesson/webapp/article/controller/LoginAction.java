package jp.co.comnic.lesson.webapp.article.controller;
//      jp.co.comnic.javalesson.webapp.article.controller.LoginAction

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.lesson.webapp.article.dao.Accountdao;
import jp.co.comnic.lesson.webapp.article.dao.DaoException;
import jp.co.comnic.lesson.webapp.article.model.Account;
import jp.co.comnic.lesson.webapp.article.model.Article;

public class LoginAction implements Action {
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		System.out.println(email);
		String pass = request.getParameter("password");
		System.out.println(pass);
		String forwardPath = "login";
		List<Article> articles = new ArrayList<>(); 
		
		try{
			
			Account account = new Accountdao().loginAuthenticate(email, pass);
			
			if(account != null) {
				//article型のリストにgetAllメソッドの戻り値を格納
				articles = new ToppageAction().getAll();	
				
				//articleをsetAttribute
				request.getSession().setAttribute("articles", articles);
				request.getSession().setAttribute("isAuthenticated", "AUTHENTICATED");
				request.getSession().setAttribute("LoginEmail", account.getEmail());
				
				forwardPath = null;
				response.sendRedirect("/" + request.getServletContext().getServletContextName() + "/top.jsp");
				
			}else{
				request.setAttribute("error", "メールアドレスもしくはパスワードが違います");
				forwardPath = "login";
			}
		}catch (DaoException e) {
				throw new ServletException(e);
				// TODO: handle exception
			}
			
			return forwardPath;
		}
	}

