package jp.co.comnic.lesson.webapp.article.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Basedao {
	
	protected EntityManager em = Persistence.createEntityManagerFactory("article").createEntityManager();
	protected EntityTransaction tx = em.getTransaction();
	protected CriteriaBuilder builder = em.getCriteriaBuilder();
	
	protected <T> List<T> findAll(CriteriaQuery<T> query, Root<T> root ){
		return em.createQuery(query.select(root)).getResultList();
	}
}
	
//	public void insert(Object entity) throw DaoException{
