package jp.co.comnic.lesson.webapp.article.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;

public class AuthenticateFilter implements Filter {
	
	public void init(FilterConfig filterConfig) 
	throws ServletException{
		// nothing to do
	}
	
	
	public void doFilter(ServletRequest request, FilterChain chain) throws IOException, ServletException{
		
		
		ServletContext servletContext = ((HttpServletRequest)request)
	}
	

}
