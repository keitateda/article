package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.comnic.lesson.webapp.article.dao.Basedao;
import jp.co.comnic.lesson.webapp.article.dao.DaoException;
import jp.co.comnic.lesson.webapp.article.model.Article;

/**
 * <p>レコードの削除処理を実行するActionインターフェイスの実装。</p>
 * 
 * @author M.Yoneyama
 * @version 1.0
 */
public class RemoveAction implements Action {

	/* (non-Javadoc)
	 * @see jp.co.comnic.javalesson.webapp.ems.controller.Action#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String servletPath = request.getServletPath();
		String forwardPath = "./";
//		String redirectPath = "./";
		Integer id = Integer.parseInt(request.getParameter("article_id")); // 削除するレコードのID
		List<Article> articles = new ArrayList<>(); 
		
		try {
			
			// リクエストされたサーブレット・パスから完全修飾クラス名を取得
			String entityClass = ContorollerUtils.getFullyQualitifiedClassName(servletPath);
			// DAOを使用してエンティティ・オブジェクトを削除
			new Basedao().remove(Class.forName(entityClass), id);
			
			forwardPath = null;
			
			articles = new ToppageAction().getAll();
			request.getSession().setAttribute("articles", articles);
			response.sendRedirect("/article/top.jsp");
			
		} catch (DaoException e) {
			request.setAttribute("error", "[ERROR]: " + 
                                  ContorollerUtils.getShortMessage(e));
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		return forwardPath;
	}

}
