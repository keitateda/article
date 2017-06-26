package jp.co.comnic.lesson.webapp.article.filters;





//ログイン認証のフィルターのパス・マッチャー
public class PathMatcher {
	
	public static boolean matches(String path){
		//許可する正規表現　　左はLoginやLogin.doに対応するために　右は拡張子に対応
		if (path.matches("/login.*") || path.matches(",*(.css)|(.js)|(.gif)|(.png)|(.jpg)")){
			
			return true;
		}
		
		return false;
		
	}

}
