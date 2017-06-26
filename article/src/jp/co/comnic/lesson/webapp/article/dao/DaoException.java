package jp.co.comnic.lesson.webapp.article.dao;


//daoでの例外をまとめる例外クラス
public class DaoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public DaoException(Exception e) {
		super("an exeption occur in the DAO layer.",e);
	}

}
