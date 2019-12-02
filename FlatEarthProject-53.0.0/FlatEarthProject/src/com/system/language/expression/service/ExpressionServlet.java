package com.system.language.expression.service;

import java.io.IOException;
import java.sql.Timestamp;

import com.system.configuration.constants.Screen;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.language.expression.model.ExpressionBean;
import com.system.language.logger.service.LogEvent;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.system.configuration.constants.Table.*;

public class ExpressionServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	private int 		id;						 
	private String 		screenName;			 
	private String 		fieldName;			 
	private String 		fieldValue;			 
	private String 		expression;	
	private int			rating;
	private String 		defaultValue;	
	private boolean		status;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;	 
	
	public boolean 		expressionReady;
	
	protected LogEvent 	myLog;
	public String 		className = this.getClass().getName();
	
	/***********************************************************************************
	 ***********************************************************************************/
	public ExpressionBean formatExpressionBean (HttpServletRequest request) {
		
		id 				= Integer.valueOf(request.getParameter("id"));
		screenName 		= request.getParameter("screenName");
		fieldName 		= request.getParameter("fieldName");
		fieldValue 		= request.getParameter("fieldValue");
		
		expression 		= request.getParameter("expression1");
		
		expression 		= expression + request.getParameter("expression2");
		expression 		= expression + request.getParameter("expression3");
		expression 		= expression + request.getParameter("expression4");
		
		rating 			= Integer.valueOf(request.getParameter("rating"));
		
		defaultValue 	= request.getParameter("defaultValue");
		
		String statusStr= request.getParameter("status");
		
		if(statusStr.equalsIgnoreCase("Yes")) {
			status = true;
		} else {
			status = false;
		}
		
		createUser		= request.getParameter("createUser");
		createTimestamp = Timestamp.valueOf(request.getParameter("createTimestamp"));
		modifyUser 		= request.getParameter("modifyUser");
		modifyTimestamp = Timestamp.valueOf( request.getParameter("modifyTimestamp"));
		
		ExpressionBean expressionBean = new ExpressionBean(id
										                  ,screenName
										                  ,fieldName
										                  ,fieldValue
										                  ,expression
										                  ,rating
										                  ,defaultValue
										                  ,status
										                  ,createUser
										                  ,createTimestamp
										                  ,modifyUser
										                  ,modifyTimestamp 
										   				  );
		
		return expressionBean;
	} 
	
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkExpressionBeanFieldFormat(ExpressionBean expressionBean) {
		
		if ((checkIdFormat				(expressionBean))
		&&  (checkScreenNameFormat		(expressionBean))
		&&  (checkFieldNameFormat 		(expressionBean))
		&&  (checkFieldValueFormat 		(expressionBean))
		&&  (checkExpressionFormat 		(expressionBean))
		&&  (checkRatingFormat 			(expressionBean))
		&&  (checkDefaultValueFormat 	(expressionBean))
		&&  (checkStatusFormat 			(expressionBean))
		
		&&  (checkCreateUserFormat 		(expressionBean))
		&&  (checkCreateTimestampFormat (expressionBean))
		&&  (checkModifyUserFormat 		(expressionBean))
		&&  (checkModifyTimestampFormat (expressionBean))) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(EXPRESSION_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(expressionBean.getId()));
	}
		
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkScreenNameFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(SCREEN_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getScreenName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldNameFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(FIELD_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getFieldName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldValueFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(FIELD_VALUE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getFieldValue());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkExpressionFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(EXPRESSION_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getExpression());
		
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkRatingFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(RATING_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(expressionBean.getRating()));
		
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDefaultValueFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(DEFAULT_VALUE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getDefaultValue());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkStatusFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(EXPRESSION_SCREEN);
		expressionBean.setFieldName(STATUS_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(expressionBean.getStatus()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getCreateUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getCreateTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getModifyUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(ExpressionBean expressionBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,expressionBean.getModifyTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request 
			  					      ,ExpressionBean 		expressionBean ) {
	
		@SuppressWarnings("unused")
		LogEvent inLog = null;
		boolean result = false;
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
				case ACTIVATE_KEY:
					result = (expressionDao.select() != null) ? true: false;
					break;
					
				case INSERT_RECORD:
					 result = expressionDao.insert(expressionBean) == 1 ? true : false;
					 break;
					 
				case UPDATE_RECORD:
					result = expressionDao.update(expressionBean) == 1 ? true : false;
					break;	
					
				case DELETE_RECORD:
					result = expressionDao.delete(expressionBean.getId()) == 1 ? true : false;
					break;
					
				default:
					System.out.println("ExpressionServlet ---> Button Not Depressed");
					result = false;
					break;
		}
			   
		expressionReady = result;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayExpressionForm (HttpServletRequest 	request
										,HttpServletResponse 	response) {
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/expression.jsp");

		try {
			
			rd.forward(request, response);
			
		} catch (ServletException e) {
			
			System.out.println("ExpressionServlet ---> redisplayExpressionForm() Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("ExpressionServlet ---> redisplayExpressionForm() Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void showExpressionForm (HttpServletRequest request,HttpServletResponse response) {
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayExpressionTable.jsp");

		try {
			
			rd.include(request, response);
			
		} catch (ServletException e) {
			
			System.out.println("ExpressionServlet ---> showExpressionForm() Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("ExpressionServlet ---> showExpressionForm() Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {

	  ExpressionBean expressionBean = new ExpressionServlet().formatExpressionBean(request);
	  
	  // Validation overrides screen values - so we save them in this copy
	  ExpressionBean expressionBeanCopy = new ExpressionBean (expressionBean);
	  
	  if ((expressionBean != null ) 
	  && new ExpressionServlet().checkExpressionBeanFieldFormat(expressionBean)) {
		  performDatabaseAction (request, expressionBeanCopy);
	  } else {
		  redisplayExpressionForm (request,response);
		  return;
	  }
	  
	  if (expressionReady)
		  showExpressionForm (request,response);
	  else
		  redisplayExpressionForm (request,response);
    }
}