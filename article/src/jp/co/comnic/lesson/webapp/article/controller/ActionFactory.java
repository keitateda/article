package jp.co.comnic.lesson.webapp.article.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;

@WebListener
public class ActionFactory implements ServletContextListener {

	private static ServletContext context;
	
	public static Action getAction(String servletPath) throws ServletException {
		
		Action action = null;
		
		String actionClassName = context.getInitParameter(servletPath);
			
		try {
			
			action = (Action)Class.forName(actionClassName).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException(e);
		}
		
		
		return action;
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		context = sce.getServletContext();
	}

	
	
	
}
