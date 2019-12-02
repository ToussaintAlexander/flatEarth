package com.system.security.authorization.screenfield.service;

import java.io.IOException;

import com.system.configuration.constants.Screen;
import com.system.language.expression.model.ExpressionBean;
import com.system.security.authorization.screenfield.dao.ScreenFieldDao;
import com.system.security.authorization.screenfield.dao.ScreenFieldDaoImpl;
import com.system.security.authorization.screenfield.model.ScreenFieldBean;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;

import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.system.configuration.constants.Table.*;

public class ScreenFieldServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	private int 		id;
	private int 		groupId;
	private int 		userId;
	private int 		seq;
	private String 		menuName;
	private String 		screenName;
	private String 		fieldName;
	private boolean 	fieldVisible;
	private boolean 	fieldEditable;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;
	
	public boolean 		fieldReady;
	
	public String 		className = this.getClass().getName();
	
	/***********************************************************************************
	 ***********************************************************************************/
	public ScreenFieldBean formatFieldBean(HttpServletRequest request) {
		
		id				= Integer.valueOf(request.getParameter("id"));
		groupId			= Integer.valueOf(request.getParameter("groupId"));
		userId			= Integer.valueOf(request.getParameter("userId"));
		seq			= Integer.valueOf(request.getParameter("sequence"));
		
		menuName		= request.getParameter("menuName");
		screenName		= request.getParameter("screenName");
		fieldName		= request.getParameter("fieldName");
		
		fieldVisible	= (request.getParameter("fieldVisible")) == "0" ? true:false ;
		fieldEditable	= (request.getParameter("fieldEditable")) == "0" ? true:false ;
		
		createUser 		= request.getParameter("createUser");
		createTimestamp = new Timestamp(System.currentTimeMillis());
		modifyUser 		= request.getParameter("modifyUser");
		modifyTimestamp = new Timestamp(System.currentTimeMillis());
		
		ScreenFieldBean fieldBean = new ScreenFieldBean	( id
											, groupId
											, userId
											, seq
											, menuName
											, screenName
											, fieldName
											, fieldVisible
											, fieldEditable
				 							, createUser
				 							, createTimestamp
				 							, modifyUser
				 							, modifyTimestamp
				 							);

		return fieldBean;
		
	} 
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldBeanFieldFormat(ScreenFieldBean fieldBean) {
		
		if ((checkIdFormat				(fieldBean))
		&&  (checkGroupIdFormat			(fieldBean))
		&&  (checkUserIdFormat			(fieldBean))
		&&  (checkSequenceFormat		(fieldBean))
		&&  (checkMenuNameFormat		(fieldBean))
		&&  (checkScreenNameFormat		(fieldBean))
		&&  (checkFieldNameFormat		(fieldBean))
		&&  (checkFieldVisibleFormat	(fieldBean))
		&&  (checkFieldEditableFormat	(fieldBean))
		
		&&  (checkCreateUserFormat 		(fieldBean))
		&&  (checkCreateTimestampFormat (fieldBean))
		&&  (checkModifyUserFormat 		(fieldBean))
		&&  (checkModifyTimestampFormat (fieldBean))) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(fieldBean.getId()));
	}
		
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkGroupIdFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(GROUP_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(fieldBean.getGroupId()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkUserIdFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(USER_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(fieldBean.getUserId()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkSequenceFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(SEQUENCE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(fieldBean.getSeq()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkMenuNameFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(MENU_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,fieldBean.getMenuName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkScreenNameFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(SCREEN_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,fieldBean.getScreenName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldNameFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(FIELD_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,fieldBean.getFieldName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldVisibleFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(FIELD_VISIBLE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(fieldBean.isFieldVisible()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldEditableFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(FIELD_EDITABLE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(fieldBean.isFieldEditable()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,fieldBean.getCreateUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,fieldBean.getCreateTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,fieldBean.getModifyUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(ScreenFieldBean fieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,fieldBean.getModifyTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request 
									  ,ScreenFieldBean 			fieldBean ) {
	
		boolean result = false;
		
		ScreenFieldDao fieldDao	= new ScreenFieldDaoImpl();
		 
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
		case ACTIVATE_KEY:
			result = (fieldDao.select() != null)? true: false;
			break;
			
		case INSERT_RECORD:
			 result = fieldDao.insert(fieldBean) == 1 ? true : false;
			 break;
			 
		case UPDATE_RECORD:
			result = fieldDao.update(fieldBean) == 1 ? true : false;
			break;
			
		case DELETE_RECORD:
			result = fieldDao.delete(fieldBean.getId()) == 1 ? true : false;
			break;
			
		default:
			System.out.println("FieldServlet ---> Button Not Depressed");
			result = false;
			break;
		}
	   
		fieldReady = result;
		
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayFieldForm (HttpServletRequest request,HttpServletResponse response) {
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/field.jsp");

		try {
			
			rd.forward(request, response);
			
		} catch (ServletException e) {
			
			System.out.println("FieldServlet ---> redisplayFieldForm(request,response) Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("FieldServlet ---> redisplayFieldForm(request,response) Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void showFieldForm (HttpServletRequest request,HttpServletResponse response) {
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayFieldTable.jsp");

		try {
			
			rd.include(request, response);
		} catch (ServletException e) {
			
			System.out.println("FieldServlet ---> showFieldForm(request,response) Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("FieldServlet ---> showFieldForm(request,response) Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
  public void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {

	  ScreenFieldBean fieldBean = new ScreenFieldServlet().formatFieldBean(request);
	  
	  if ((fieldBean != null )
	  && new ScreenFieldServlet().checkFieldBeanFieldFormat(fieldBean)) {
		  performDatabaseAction (request, fieldBean);
	  } else {
		  redisplayFieldForm (request,response);
		  return;
	  }
	  
	  if (fieldReady)
		  showFieldForm (request,response);
	  else
		  redisplayFieldForm (request,response);
		  	
		/***********************************************************************************
		 ***********************************************************************************/	  
  }
}