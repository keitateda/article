package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.lesson.webapp.article.dao.Accountdao;
import jp.co.comnic.lesson.webapp.article.dao.DaoException;
import jp.co.comnic.lesson.webapp.article.model.Account;

public class LoginAction implements Action {
	
	
	public String execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String email = request.getParameter("email");
		System.out.println(email);
		String pass = request.getParameter("password");
		System.out.println(pass);
		String forwardPath = "login";
		
		try{
			
			Account account = new Accountdao().loginAuthenticate(email, pass);
			
			if(account != null) {
				request.getSession().setAttribute("isAuthenticated", "AUTHENTICATED");
				request.getSession().setAttribute("LoginEmail", account.getEmail());
				
				forwardPath = null;
				response.sendRedirect("/" + request.getServletContext().getServletContextName() + "top.jsp");
//				response.sendRedirect("/bookStore/Top.jsp");
				
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

	@Override
	public String excute(HttpServletRequest request, HttpServletResponse responce)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
}
