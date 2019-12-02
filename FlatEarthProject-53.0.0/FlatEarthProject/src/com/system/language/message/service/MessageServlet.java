package com.system.language.message.service;

import java.io.IOException;

import com.system.configuration.constants.Screen;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.language.expression.model.ExpressionBean;
import com.system.language.logger.service.LogEvent;
import com.system.language.message.dao.MessageDao;
import com.system.language.message.dao.MessageDaoImpl;
import com.system.language.message.model.MessageBean;

import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.system.configuration.constants.Table.*;

public class MessageServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	private int 		id;
	private int 		code;
	private String 		description;
	private String 		cause;
	private String 		effect;
	private String 		recovery;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;
	
	public boolean 		messageReady;
	
	public String 		className = this.getClass().getName();
	
	/***********************************************************************************
	 ***********************************************************************************/
	public MessageBean formatMessageBean(HttpServletRequest request) {
		
		System.out.println("MessageServlet ---> Entering formatMessageBean()");
		
		id				= Integer.valueOf( request.getParameter("id"));
		code 			= Integer.valueOf(request.getParameter("code"));
		description 	= request.getParameter("description");
		
		cause 			= request.getParameter("cause");
		effect 			= request.getParameter("effect");
		recovery		= request.getParameter("recovery");
		
		createUser 		= request.getParameter("createUser");
		createTimestamp = new Timestamp(System.currentTimeMillis());
		modifyUser 		= request.getParameter("modifyUser");
		modifyTimestamp = new Timestamp(System.currentTimeMillis());
		
		MessageBean message = new MessageBean( id
				 							 , code
				 							 , description
				 							 , cause
				 							 , effect
				 							 , recovery
				 							 , createUser
				 							 , createTimestamp
				 							 , modifyUser
				 							 , modifyTimestamp
				 							 );

		return message;
		
	} 
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkMessageBeanFieldFormat(MessageBean message) {
		
		if ((checkIdFormat				(message))
		&&  (checkCodeFormat			(message))
		&&  (checkDescriptionFormat 	(message))
		&&  (checkCauseFormat 			(message))
		&&  (checkEffectFormat 			(message))
		&&  (checkRecoveryFormat 		(message))
		
		&&  (checkCreateUserFormat 		(message))
		&&  (checkCreateTimestampFormat (message))
		&&  (checkModifyUserFormat 		(message))
		&&  (checkModifyTimestampFormat (message))) {
			
			return true;
			
		} else {
			
			return false;
			
		}
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(MESSAGE_SCREEN);
		expression.setFieldName(MESSAGE_ID_FIELD);
		
		return expressionDao.validateScreenField(expression
												,String.valueOf(message.getId()));
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCodeFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(MESSAGE_SCREEN);
		expression.setFieldName(TYPE_ID_FIELD);
		
		return expressionDao.validateScreenField(expression
												,String.valueOf(message.getCode()));
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDescriptionFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(MESSAGE_SCREEN);
		expression.setFieldName(DESCRIPTION_FIELD);
		
		return expressionDao.validateScreenField(expression
												,message.getDescription());
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCauseFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(MESSAGE_SCREEN);
		expression.setFieldName(CAUSE_FIELD);
		
		return expressionDao.validateScreenField(expression
												,message.getCause());
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkEffectFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(MESSAGE_SCREEN);
		expression.setFieldName(EFFECT_FIELD);
		
		return expressionDao.validateScreenField(expression
												,message.getEffect());	
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkRecoveryFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(MESSAGE_SCREEN);
		expression.setFieldName(RECOVERY_FIELD);
		
		return expressionDao.validateScreenField(expression
												,message.getRecovery());
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(GENERIC_SCREEN);
		expression.setFieldName(CREATE_USER_FIELD);
		
		return expressionDao.validateScreenField(expression
													,message.getCreateUser());
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(GENERIC_SCREEN);
		expression.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionDao.validateScreenField(expression
													,message.getCreateTimestamp().toString().substring(0,19));
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(GENERIC_SCREEN);
		expression.setFieldName(MODIFY_USER_FIELD);
		
		return expressionDao.validateScreenField(expression
													,message.getModifyUser());
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(MessageBean message) {
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expression = new ExpressionBean();
		
		expression.setScreenName(GENERIC_SCREEN);
		expression.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionDao.validateScreenField(expression
												,message.getModifyTimestamp().toString().substring(0,19));
		
	}
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request 
									  ,MessageBean 			message ) {
	
		@SuppressWarnings("unused")
		LogEvent inLog = null;
		boolean result = false;
		
		MessageDao messageDao	= new MessageDaoImpl();
		 
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
		case ACTIVATE_KEY:
			result = messageDao.select() != null ? true: false;
			break;
			
		case INSERT_RECORD:
			 result = messageDao.insert(message) == 1 ? true : false;
			 break;
			 
		case UPDATE_RECORD:
			result = messageDao.update(message) == 1 ? true : false;
			break;
			
		case DELETE_RECORD:
			result = messageDao.delete(message.getId())== 1 ? true : false ;
			break;
			
		default:
			System.out.println("MessageServlet ---> Button Not Depressed");
			result = false;
			break;
		}
	   
		messageReady = result;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayMessageForm (HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("MessageServlet ---> Entering redisplayMessageForm()");
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/message.jsp");

		try {
			
			rd.forward(request, response);
			
		} catch (ServletException e) {
			
			System.out.println("MessageServlet ---> redisplayMessageForm(request,response) Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("MessageServlet ---> redisplayMessageForm(request,response) Failure");
			e.printStackTrace();
			
		}
	}
	/***********************************************************************************
	 ***********************************************************************************/	
	public void showMessageForm (HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("MessageServlet ---> Entering showMessageForm()");
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayMessageTable.jsp");

		try {
			
			rd.include(request, response);
		} catch (ServletException e) {
			
			System.out.println("MessageServlet ---> showMessageForm(request,response) Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("MessageServlet ---> showMessageForm(request,response) Failure");
			e.printStackTrace();
		}
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {

	  System.out.println("MessageServlet ---> Entering doGet()");
	  
	  MessageBean message = new MessageServlet().formatMessageBean(request);
	  
	  if ((message != null )
	  && new MessageServlet().checkMessageBeanFieldFormat(message)) {
		  performDatabaseAction (request, message);
	  } else {
		  redisplayMessageForm (request,response);
		  return;
	  }
	  
	  if (messageReady)
		  showMessageForm (request,response);
	  else
		  redisplayMessageForm (request,response);
	  
	}
}