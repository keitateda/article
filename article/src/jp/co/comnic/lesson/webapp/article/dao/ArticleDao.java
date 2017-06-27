package jp.co.comnic.lesson.webapp.article.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jp.co.comnic.lesson.webapp.article.model.Article;

public class ArticleDao  extends Basedao{

	private CriteriaQuery<Article> query = builder.createQuery(Article.class);
	private Root<Article> root = query.from(Article.class);
	
	/**
	 * タイトルによる検索
	 * @param title
	 * @return　Object
	 */
	public Object findByTitle(String title){
		Object contents = em.createNamedQuery("Article.findAll").setParameter("title", title).getSingleResult();
		return contents;
	} 
	
	/**
	 * ID(主キー)による検索
	 * @param id
	 * @return　Article
	 */
	public Article findById(Integer id){
		return super.findById(Article.class, id);
	}
	
	/**
	 * 全件数検索。
	 * @return list<Article>
	 */
	public List<Article> findAll(){
		return super.findAll(query, root);
	}
		
		
		
	
	
}
