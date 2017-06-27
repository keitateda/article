package jp.co.comnic.lesson.webapp.article.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;


import jp.co.comnic.lesson.webapp.article.dao.DaoException;

public class ContorollerUtils {

	public static String getFullyQualitifiedClassName(String servletPath){
			
			String className = servletPath.substring(1, servletPath.lastIndexOf('/') - 1);
			String packageName ="jp.co.comnic.lesson.webapp.article.model";
			String firstCharacter = String.valueOf(className.charAt(0));
			firstCharacter = firstCharacter.toUpperCase();
			
			return packageName + className.replaceFirst(".", firstCharacter);

		}
		
	
	
	public static void populateEntity(HttpServletRequest request, Object entity) throws DaoException{
			
			java.util.Map<String, String[]> parameterMap = request.getParameterMap();
			java.util.Map<String, String> propertyMap = new HashMap<>();
			for(String key : parameterMap.keySet()){
				propertyMap.put(key, parameterMap.get(key)[0]);
			}
		try {
			DateConverter dateConverter = new DateConverter();
			dateConverter.setPattern("yyyy-MM-dd");
			
			ConvertUtils.register(dateConverter, Date.class);
	
			BeanUtils.populate(entity, propertyMap);
			
		} catch (IllegalAccessException | InvocationTargetException e){
			// TODO: handle exception
			throw new DaoException(e);
		}
	}
	
	public static String getShortMessage(Throwable e){
		
		String errorMessage = e.getCause().getMessage().split(":")[3];
		if (errorMessage.endsWith("Error Code"))
			errorMessage = errorMessage.replaceAll("Error code", "");
			
		return errorMessage;
		
	}
}
