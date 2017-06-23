package jp.co.comnic.lesson.webapp.article.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

public class Basedao {
	
	protected EntityManager em = Persistence.createEntityManagerFactory("article").createEntityManager();
	protected EntityTransaction tx = em.getTransaction();
	protected CriteriaBuilder builder = em.getCriteriaBuilder();
	
	
	
	
	
}
