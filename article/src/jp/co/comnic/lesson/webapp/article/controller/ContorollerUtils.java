package jp.co.comnic.lesson.webapp.article.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale.Category;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.converters.DateConverter;

import jp.co.comnic.lesson.webapp.article.dao.Basedao;
import jp.co.comnic.lesson.webapp.article.dao.DaoException;

public class ContorollerUtils {

	public static String getFullyQualitifiedClassName(String servletPath){
			
			String className = servletPath.substring(1, servletPath.lastIndexOf('/'));
			String packageName ="jp.co.comnic.lesson.webapp.article.model.";
			String firstCharacter = String.valueOf(className.charAt(0));
			firstCharacter = firstCharacter.toUpperCase();
			System.out.println(firstCharacter);
			
			System.out.println(packageName + className.replaceFirst(".", firstCharacter));
			return packageName + className.replaceFirst(".", firstCharacter);

		}
		
	
	
	public static void populateEntity(HttpServletRequest request, Object entity) throws DaoException{
			
			java.util.Map<String, String[]> parameterMap = request.getParameterMap();
			java.util.Map<String, String> propertyMap = new HashMap<>();
			for(String key : parameterMap.keySet()){
				propertyMap.put(key, parameterMap.get(key)[0]);
			}
			System.out.println(entity);
			System.out.println(propertyMap);
		try {
			// 日付形式への対応
			DateConverter dateConverter = new DateConverter();
			dateConverter.setPattern("yyyy-MM-dd");
			
			
			
			
			// コンバーターの登録
			ConvertUtils.register(dateConverter, Date.class);
			
			
			
//			ConvertUtils.register(new CategoryConverter(),Category.class );
			
			
			
			// Apache Commons ProjectのBeanUtilsを使用して
						// Mapオブジェクトからエンティティ・オブジェクトへ値をセット
			BeanUtils.populate(entity, propertyMap);
			
		} catch (IllegalAccessException | InvocationTargetException e){
			// TODO: handle exception
			throw new DaoException(e);
		}
	}
	
	
	private static class CategoryConverter implements Converter {

		@Override
		public <T> T convert(Class<T> categoryClass, Object value) {
			
//			(new CategoryConverter(),Category.class );
			T category = null;
			System.out.println("category:");
			
			try{
				
				category = categoryClass.cast(
						new Basedao().findById(Category.class, Integer.parseInt((String)value)));
				
			} catch (NumberFormatException e ){
				
				e.printStackTrace();
			}
			
			
			return category;
		}
	}
	
	
	
	public static String getShortMessage(Throwable e){
		
		String errorMessage = e.getCause().getMessage().split(":")[3];
		if (errorMessage.endsWith("Error Code"))
			errorMessage = errorMessage.replaceAll("Error code", "");
			
		return errorMessage;
		
	}
}
