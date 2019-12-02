package com.system.security.authorization.menu.service;

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

public class MenuServlet extends HttpServlet {
	
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
	public ScreenFieldBean formatScreenFieldBean(HttpServletRequest request) {
		
		id				= Integer.valueOf(request.getParameter("id"));
		groupId			= Integer.valueOf(request.getParameter("groupId"));
		userId			= Integer.valueOf(request.getParameter("userId"));
		seq				= Integer.valueOf(request.getParameter("sequence"));
		
		menuName		= request.getParameter("menuName");
		screenName		= request.getParameter("screenName");
		fieldName		= request.getParameter("fieldName");
		
		fieldVisible	= (request.getParameter("fieldVisible")) == "0" ? true:false ;
		fieldEditable	= (request.getParameter("fieldEditable")) == "0" ? true:false ;
		
		createUser 		= request.getParameter("createUser");
		createTimestamp = new Timestamp(System.currentTimeMillis());
		modifyUser 		= request.getParameter("modifyUser");
		modifyTimestamp = new Timestamp(System.currentTimeMillis());
		
		ScreenFieldBean screenFieldBean = new ScreenFieldBean	( id
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

		return screenFieldBean;
		
	} 
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldBeanFieldFormat(ScreenFieldBean screenFieldBean) {
		
		if ((checkIdFormat				(screenFieldBean))
		&&  (checkGroupIdFormat			(screenFieldBean))
		&&  (checkUserIdFormat			(screenFieldBean))
		&&  (checkSequenceFormat		(screenFieldBean))
		&&  (checkMenuNameFormat		(screenFieldBean))
		&&  (checkScreenNameFormat		(screenFieldBean))
		&&  (checkFieldNameFormat		(screenFieldBean))
		&&  (checkFieldVisibleFormat	(screenFieldBean))
		&&  (checkFieldEditableFormat	(screenFieldBean))
		
		&&  (checkCreateUserFormat 		(screenFieldBean))
		&&  (checkCreateTimestampFormat (screenFieldBean))
		&&  (checkModifyUserFormat 		(screenFieldBean))
		&&  (checkModifyTimestampFormat (screenFieldBean))) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenFieldBean.getId()));
	}
		
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkGroupIdFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(GROUP_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenFieldBean.getGroupId()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkUserIdFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(USER_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenFieldBean.getUserId()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkSequenceFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(SEQUENCE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenFieldBean.getSeq()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkMenuNameFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(MENU_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenFieldBean.getMenuName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkScreenNameFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(SCREEN_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenFieldBean.getScreenName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldNameFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(FIELD_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenFieldBean.getFieldName());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldVisibleFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(FIELD_VISIBLE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenFieldBean.isFieldVisible()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldEditableFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(FIELD_SCREEN);
		expressionBean.setFieldName(FIELD_EDITABLE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenFieldBean.isFieldEditable()));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenFieldBean.getCreateUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenFieldBean.getCreateTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenFieldBean.getModifyUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(ScreenFieldBean screenFieldBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenFieldBean.getModifyTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request 
									  ,ScreenFieldBean 			screenFieldBean ) {
	
		boolean result = false;
		
		ScreenFieldDao fieldDao	= new ScreenFieldDaoImpl();
		 
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
		case ACTIVATE_KEY:
			result = (fieldDao.select() != null)? true: false;
			break;
			
		case INSERT_RECORD:
			 result = fieldDao.insert(screenFieldBean) == 1 ? true : false;
			 break;
			 
		case UPDATE_RECORD:
			result = fieldDao.update(screenFieldBean) == 1 ? true : false;
			break;
			
		case DELETE_RECORD:
			result = fieldDao.delete(screenFieldBean.getId()) == 1 ? true : false;
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

	  ScreenFieldBean screenFieldBean = new MenuServlet().formatScreenFieldBean(request);
	  
	  if ((screenFieldBean != null )
	  && new MenuServlet().checkFieldBeanFieldFormat(screenFieldBean)) {
		  performDatabaseAction (request, screenFieldBean);
	  } else {
		  redisplayFieldForm (request,response);
		  return;
	  }
	  
	  if (fieldReady)
		  showFieldForm (request,response);
	  else
		  redisplayFieldForm (request,response);
		  	
  }
  
}