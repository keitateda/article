package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		Action action = ActionFactory.getAction(request.getServletPath());
			
		String forwardPath = action.execute(request, response);
		
		if (forwardPath != null){
			
			request.getRequestDispatcher(forwardPath).forward(request, response);
		}
	}
	
	

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(request, response);
		doService(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(request, response);
		doService(request, response);
	}





//	@Override
//	protected void doget(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
//		doService(request, response);
//	}
//	
//	@Override
//	protected void dopost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
//		doService(request, response);	
//	}

}
