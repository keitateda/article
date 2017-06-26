package jp.co.comnic.lesson.webapp.article.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.Filter;



public class AuthenticateFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException{
		// nothing to do
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException{
		
		
		ServletContext servletContext = ((HttpServletRequest)request).getServletContext();
		String servletPath = ((HttpServletRequest)request).getServletPath();//httpリクエスト・パスを取得
		HttpSession session = ((HttpServletRequest)request).getSession();//httpsessionオブジェクトの取得
		
		String authenticated = (String)session.getAttribute("isAuthenticated");
		
		
		//ログイン認証済みもしくは許可されたパスの場合
		if (("AUTHENTICATED".equals(authenticated)) || PathMatcher.matches(servletPath)) {
			//↑このメソッドの上の処理は、リクエスト・フィルター
			chain.doFilter(request, response);
			//↓このメソッドの下の処理は、レスポンス・フィルター
			//〇〇〇〇〇(レスポンスのフィルターを設定する場合は、ここに記述
			
			
		} else {
			//それ以外は全てログイン画面にリダイレクト
			((HttpServletResponse)response).sendRedirect(servletContext.getContextPath() + "/login");	
		}
	}
	public void destroy(){
		//Nothing to do
	}
}
