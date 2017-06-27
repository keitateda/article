package jp.co.comnic.lesson.webapp.article.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import jp.co.comnic.lesson.webapp.article.dao.ArticleDao;
import jp.co.comnic.lesson.webapp.article.model.Article;

public class ToppageAction  {
	List<Article> articles = new ArrayList<>();
		
	/**
	 *全件検索によって出力されたデータをlistに格納し、戻り値として戻す。
	 * @return List<Article>
	 * @throws ServletException
	 * @throws IOException
	 */
	public List<Article> getAll()
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			articles = new ArticleDao().findAll();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return articles;
	}

}
