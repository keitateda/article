package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.lesson.webapp.article.dao.Basedao;
import jp.co.comnic.lesson.webapp.article.dao.DaoException;

public class InsertAction implements Action {

	@Override
	public String excute(HttpServletRequest request, HttpServletResponse responce)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String servletPath =request.getServletPath();
		
		String redirectPath = "./";
		String fowardPath = "new";
		
		try {
			Object  entity = Class.forName(ContorollerUtils.getFullyQualitifiedClassName(servletPath)).newInstance();
			ContorollerUtils.populateEntity(request, entity);
			
			new Basedao().insert(entity);
			
			fowardPath = null;
			responce.sendRedirect(redirectPath);
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
