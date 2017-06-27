package jp.co.comnic.lesson.webapp.article.dao;

import javax.persistence.Query;

import jp.co.comnic.lesson.webapp.article.model.Article;

public class ArticleDao  extends Basedao{

	public Query findByTitle(String title){
		Query contents = em.createNamedQuery("Article.findAll").setParameter("title", title);
		return contents;
	} 
	
	public Article findById(Integer id){
		return super.findById(Article.class, id);
	}
	
	public Query viewTitle(){
		
		Query query  = em.createNamedQuery("Article.viewTitle");
		
		return query;
		
		
	}
	
}
