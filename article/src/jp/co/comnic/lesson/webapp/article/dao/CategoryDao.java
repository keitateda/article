package jp.co.comnic.lesson.webapp.article.dao;

//ｲﾝﾎﾟｰﾄするものを確認する
import jp.co.comnic.lesson.webapp.article.model.Category;

public class CategoryDao extends Basedao{
	
	public Category findById(Integer id){
		return super.findById(Category.class, id);
	}
}
