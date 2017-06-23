package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author igawa.yoshiki
 *
 */
public interface Action {

	
	/**
	 * @param request
	 * @param responce
	 * @return ビジネス・ロジック実行後の遷移先パス
	 * @throws ServletException
	 * @throws IOException
	 */
	public String excute(HttpServletRequest request, HttpServletResponse responce)throws ServletException, IOException;
}
