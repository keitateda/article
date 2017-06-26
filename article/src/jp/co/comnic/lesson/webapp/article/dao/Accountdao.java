package jp.co.comnic.lesson.webapp.article.dao;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;
import jp.co.comnic.lesson.webapp.article.model.Account;

//アカウントのログイン処理を実装するDAOクラス
public class Accountdao extends Basedao{
	
	//引数無しｺﾝｽﾄﾗｸﾀ
	public Accountdao() throws DaoException{}
	
	//クエリの準備
	private CriteriaQuery<Account> queryForAccount = builder.createQuery(Account.class);
	private Root<Account> accountRoot = queryForAccount.from(Account.class);
	
	
	//アカウントの認証を行うメソッド
	public Account loginAuthenticate(String email, String pass) {
		
		Account account = null;
		
		//パスを変数に格納
		Path<String> mailField = accountRoot.get("email");
		Path<String> passField = accountRoot.get("password");
		
		//sql  select *from account where email = 引数 && pass = 引数
		queryForAccount.select(accountRoot).where(builder.equal(mailField, email),
								builder.equal(passField, pass));
		
		TypedQuery<Account> query = em.createQuery(queryForAccount);
		
		
		
		try {
//			sql文を発行して、結果を格納
			account = query.getSingleResult();
			
		} catch (Exception e){
			
		}
		
		return account;
	}
}
