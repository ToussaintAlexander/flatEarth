package com.system.security.authorization.profile.service;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.configuration.constants.Screen;

import com.system.language.expression.model.ExpressionBean;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.security.authorization.profile.dao.ProfileDao;
import com.system.security.authorization.profile.dao.ProfileDaoImpl;
import com.system.security.authorization.profile.model.ProfileBean;

import static com.system.configuration.constants.Table.*;

public class ProfileServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	private int			id;
	
	private int 		groupId;			 
	private int 		userId;				 
	private int 		sequence;			 
	
	private String 		menuName;
	private String 		screenName;
	private String 		fieldName;
	
	private int			profileStatus;
	private int			menuStatus;
	
	//---
	
	private String 		viewJsp;
	private int			screenStatus;
	private String 		controllerBean;
	
	private int			createStatus;
	private	int			readStatus;
	private int			updateStatus;
	private int			deleteStatus;
	
	private int			fieldVisible;
	private int			fieldEditable;
	
	//---
	
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;
	
	private static boolean 	profileReady;
	
	/***********************************************************************************
	 ***********************************************************************************/
	public ProfileBean formatProfileBean (HttpServletRequest request) {
		
		System.out.println("ProfileServlet ---> Entering formatProfileBean ()");
		
		id 				= Integer.valueOf(request.getParameter("id"));
		
		groupId 		= Integer.valueOf(request.getParameter("groupId"));
		userId 			= Integer.valueOf(request.getParameter("userId"));
		sequence 		= Integer.valueOf(request.getParameter("sequence"));
		
		menuName 		= request.getParameter("menuName");
		screenName 		= request.getParameter("screenName");
		fieldName 		= request.getParameter("fieldName");
		
		profileStatus 	= Integer.valueOf(request.getParameter("profileStatus"));
		menuStatus 		= Integer.valueOf(request.getParameter("menuStatus"));
 		
		viewJsp 		= request.getParameter("viewJsp");
		screenStatus 	= Integer.valueOf(request.getParameter("screenStatus"));
		controllerBean 	= request.getParameter("controllerBean");
		
		createStatus 	= Integer.valueOf(request.getParameter("createStatus"));
		readStatus 		= Integer.valueOf(request.getParameter("readStatus"));
		updateStatus 	= Integer.valueOf(request.getParameter("updateStatus"));
		deleteStatus 	= Integer.valueOf(request.getParameter("deleteStatus"));
		
		fieldVisible 	= Integer.valueOf(request.getParameter("fieldVisible"));
		fieldEditable 	= Integer.valueOf(request.getParameter("fieldEditable"));
		
		createUser 		= request.getParameter("createUser");
		createTimestamp = Timestamp.valueOf(request.getParameter("createTimestamp"));
		modifyUser 		= request.getParameter("modifyUser");
		modifyTimestamp = Timestamp.valueOf(request.getParameter("modifyTimestamp"));

		ProfileBean profileBean = new ProfileBean ( id
			     								  , groupId 			 
			     								  , userId 				 
			     								  , sequence 			 
			     								  , menuName 
			     								  , screenName 
			     								  , fieldName 
			     								  , profileStatus 
			     								  , menuStatus 
			     								  , viewJsp 			 
			     								  , screenStatus 				 
			     								  , controllerBean 			 
			     								  , createStatus 
			     								  , readStatus 
			     								  , updateStatus 
			     								  , deleteStatus 
			     								  , fieldVisible 
			     								  , fieldEditable 			 
			     								  , createUser 			 
			     								  , createTimestamp 	 
			     								  , modifyUser 			 
			     								  , modifyTimestamp 		
												  );
				
		return profileBean;
		
	} 
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkProfileBeanFieldFormat(ProfileBean profileBean) {
		
		if ((checkIdFormat				(profileBean))
		
		&&  (checkGroupIdFormat 		(profileBean))
		&&  (checkUserIdFormat 			(profileBean))
		&&  (checkSequenceFormat 		(profileBean))
		&&  (checkMenuNameFormat 		(profileBean))
		&&  (checkScreenNameFormat 		(profileBean))
		&&  (checkFieldNameFormat 		(profileBean))
		&&  (checkProfileFormat 		(profileBean))
		&&  (checkStatusFormat 			(profileBean))
				
		&&  (checkCreateUserFormat 		(profileBean))
		&&  (checkCreateTimestampFormat (profileBean))
		&&  (checkModifyUserFormat 		(profileBean))
		&&  (checkModifyTimestampFormat (profileBean))) {
		
			return true;
			
		} else {
			
			return false;
			
		}
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat (ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(profileBean.getId()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkGroupIdFormat (ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(GROUP_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(profileBean.getGroupId()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkUserIdFormat (ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(USER_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(profileBean.getUserId()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkSequenceFormat (ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(SEQUENCE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(profileBean.getSeq()));
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkMenuNameFormat (ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(START_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,profileBean.getMenuName());
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkScreenNameFormat (ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(SCREEN_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,profileBean.getScreenName());
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFieldNameFormat (ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(FIELD_NAME_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,profileBean.getFieldName());
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkProfileFormat (ProfileBean profileBean) {
		
//		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(PROFILE_FIELD);
		
//		return expressionHelpDao.validateScreenField(expressionBean
//													,String.valueOf(profileBean.getProfile()));
	    return true;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkStatusFormat (ProfileBean profileBean) {
		
//		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(PROFILE_SCREEN);
		expressionBean.setFieldName(STATUS_FIELD);
		
//		return expressionHelpDao.validateScreenField(expressionBean
//													,String.valueOf(profileBean.getStatus()));
		return true;
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat(ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,profileBean.getCreateUser());
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat(ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,profileBean.getCreateTimestamp().toString().substring(0,19));
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat(ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,profileBean.getModifyUser());
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat(ProfileBean profileBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,profileBean.getModifyTimestamp().toString().substring(0,19));
		
	}
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request
									  ,ProfileBean 			profileBean) {

		boolean result = false;

		ProfileDao profileDao = new ProfileDaoImpl();

		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));

		switch (intValue) {

			case ACTIVATE_KEY:
				result = profileDao.selectProfileById(profileBean.getId()) != null ? true: false;
				break;

			case INSERT_RECORD:
				result = profileDao.insert(profileBean);;
				break;

			case UPDATE_RECORD:
				result = profileDao.update(profileBean);
				break;

			case DELETE_RECORD:
				result = profileDao.delete(profileBean.getId());
				break;

			default:
				System.out.println("ProfileServlet ---> Button Not Depressed");
				result = false;
				break;
		}

		profileReady = result;
		
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayProfileForm (HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("ProfileServlet ---> Entering redisplayProfileForm()");
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayProfile.jsp");

		try {
			
			rd.forward(request, response);
			
		} catch (ServletException e) {
			
			System.out.println("ProfileServlet ---> redisplayProfileForm() Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("ProfileServlet ---> redisplayProfileForm() Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void showProfileForm (HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("ProfileServlet ---> Entering showProfileForm()");
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayProfile.jsp");

		try {
			
			rd.include(request, response);
			
		} catch (ServletException e) {
			
			System.out.println("ProfileServlet ---> showProfileForm() Failure");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			System.out.println("ProfileServlet ---> showProfileForm() Failure");
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
   public void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {

	  System.out.println("ProfileServlet ---> Entering doGet()");
	  
	  ProfileBean profileBean = new ProfileServlet().formatProfileBean(request);
	  
	  if ((profileBean != null )
	  && new ProfileServlet().checkProfileBeanFieldFormat(profileBean)) {
		  performDatabaseAction (request, profileBean);
	  } else {
		  redisplayProfileForm (request,response);
		  return;
	  }
	  
	  if (profileReady)
		  showProfileForm (request,response);
	  else
		  redisplayProfileForm (request,response);
    }
}