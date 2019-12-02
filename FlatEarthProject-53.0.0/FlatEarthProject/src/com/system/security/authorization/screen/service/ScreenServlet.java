package com.system.security.authorization.screen.service;

import java.io.IOException;

import com.system.configuration.constants.Screen;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.language.expression.model.ExpressionBean;
import com.system.language.logger.service.LogEvent;
import com.system.security.authorization.screen.dao.ScreenDao;
import com.system.security.authorization.screen.dao.ScreenDaoImpl;
import com.system.security.authorization.screen.model.ScreenBean;

import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.system.configuration.constants.Table.*;

public class ScreenServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	private int 		id;
	private int 		groupId;
	private int 		userId;
	private int 		sequence;
	private String 		menuName;
	private String 		screenName;
	private int 		createOp;
	private int 		readOp;
	private int 		updateOp;
	private int 		deleteOp;
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;
	
	public boolean 		screenReady;
	
	public String 		className = this.getClass().getName();
	
	/***********************************************************************************
	 ***********************************************************************************/
	public ScreenBean formatScreenBean(HttpServletRequest request) {
		
		id				= Integer.valueOf(request.getParameter("id"));
		groupId			= Integer.valueOf(request.getParameter("groupId"));
		userId			= Integer.valueOf(request.getParameter("userId"));
		sequence		= Integer.valueOf(request.getParameter("sequence"));
		
		menuName		= request.getParameter("menuName");
		screenName		= request.getParameter("screenName");
		
		createOp		= (request.getParameter("createOp")) 	== "0" ? 1:0 ;
		readOp			= (request.getParameter("readOp")) 		== "0" ? 1:0 ;
		updateOp		= (request.getParameter("updateOp")) 	== "0" ? 1:0 ;
		deleteOp		= (request.getParameter("deleteOp"))	== "0" ? 1:0 ;
		
		createUser 		= request.getParameter("createUser");
		createTimestamp = new Timestamp(System.currentTimeMillis());
		modifyUser 		= request.getParameter("modifyUser");
		modifyTimestamp = new Timestamp(System.currentTimeMillis());
		
		ScreenBean screenBean = new ScreenBean	( id
												, groupId
												, userId
												, sequence
												, menuName
												, screenName
												, createOp
												, readOp
												, updateOp
												, deleteOp
												, createUser
												, createTimestamp
												, modifyUser
												, modifyTimestamp
				 								);

		return screenBean;
		
	} 
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkScreenBeanFieldFormat(ScreenBean screenBean) {
		
		if ((checkIdFormat				(screenBean))
		&&  (checkGroupIdFormat			(screenBean))
		&&  (checkUserIdFormat			(screenBean))
		&&  (checkSequenceFormat		(screenBean))
		&&  (checkMenuNameFormat		(screenBean))
		&&  (checkScreenNameFormat		(screenBean))
		&&  (checkCreateOpFormat		(screenBean))
		&&  (checkReadOpFormat			(screenBean))
		&&  (checkUpdateOpFormat		(screenBean))
		&&  (checkDeleteOpFormat		(screenBean))
		&&  (checkCreateUserFormat 		(screenBean))
		&&  (checkCreateTimestampFormat (screenBean))
		&&  (checkModifyUserFormat 		(screenBean))
		&&  (checkModifyTimestampFormat (screenBean))) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getId()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkGroupIdFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(GROUP_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getGroupId()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkUserIdFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(USER_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getUserId()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkSequenceFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(SEQUENCE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getSeq()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkMenuNameFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(MENU_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenBean.getMenuName());
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkScreenNameFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(SCREEN_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenBean.getScreenName());
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateOpFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(CREATE_OP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getCreateOperation()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkReadOpFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(READ_OP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getReadOperation()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkUpdateOpFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(UPDATE_OP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getUpdateOperation()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDeleteOpFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(SCREEN_SCREEN);
		expressionBean.setFieldName(DELETE_OP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(screenBean.getDeleteOperation()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenBean.getCreateUser());
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenBean.getCreateTimestamp().toString().substring(0,19));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenBean.getModifyUser());
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(ScreenBean screenBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,screenBean.getModifyTimestamp().toString().substring(0,19));
	}
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request 
									  ,ScreenBean 			screenBean ) {
	
		@SuppressWarnings("unused")
		LogEvent inLog = null;
		boolean result = false;
		
		ScreenDao screenDao	= new ScreenDaoImpl();
		 
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
		case ACTIVATE_KEY:
			result = screenDao.select() != null ? true: false;
			break;
			
		case INSERT_RECORD:
			 result = screenDao.insert(screenBean) == 1 ? true : false;
			 break;
			 
		case UPDATE_RECORD:
			result = screenDao.update(screenBean) == 1 ? true : false;
			break;
			
		case DELETE_RECORD:
			result = screenDao.delete(screenBean.getId()) == 1 ? true : false;
			break;
			
		default:
			System.out.println("ScreenServlet ---> Button Not Depressed");
			result = false;
			break;
		}
	   
		screenReady = result;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayScreenForm (HttpServletRequest request,HttpServletResponse response) {
		
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/screen.jsp");

		try {
			
			rd.forward(request, response);
			
		} catch (ServletException e) {
			
			System.out.println("ScreenServlet ---> redisplayCustomerForm(request,response) Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("ScreenServlet ---> redisplayCustomerForm(request,response) Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void showScreenForm (HttpServletRequest request,HttpServletResponse response) {
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayScreenTable.jsp");

		try {
			
			rd.include(request, response);
		} catch (ServletException e) {
			
			System.out.println("ScreenServlet ---> showScreenForm(request,response) Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("ScreenServlet ---> showScreenForm(request,response) Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
  public void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {

	  ScreenBean screenBean = new ScreenServlet().formatScreenBean(request);
	  
	  if ((screenBean != null )
	  && new ScreenServlet().checkScreenBeanFieldFormat(screenBean)) {
		  performDatabaseAction (request, screenBean);
	  } else {
		  redisplayScreenForm (request,response);
		  return;
	  }
	  
	  if (screenReady)
		  showScreenForm (request,response);
	  else
		  redisplayScreenForm (request,response);
		  	
		/***********************************************************************************
		 ***********************************************************************************/	  
  }
}