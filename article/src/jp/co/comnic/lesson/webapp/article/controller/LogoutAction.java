package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.getSession().invalidate();
		response.sendRedirect("login");// ログイン画面にリダイレクト
		
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
