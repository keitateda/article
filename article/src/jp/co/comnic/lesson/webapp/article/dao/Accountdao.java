package jp.co.comnic.lesson.webapp.article.dao;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import jp.co.comnic.lesson.webapp.article.model.Account;

//アカウントのログイン処理を実装するDAOクラス
public class Accountdao extends Basedao{
	
	public Accountdao() throws DaoException{}
	private CriteriaQuery<Account> query = builder.createQuery(Account.class);
	
	
}
