package com.system.language.batch.service;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.system.configuration.constants.Screen;
import com.system.language.batch.dao.BatchDao;
import com.system.language.batch.dao.BatchDaoImpl;
import com.system.language.batch.model.BatchBean;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;
import com.system.language.expression.model.ExpressionBean;
import com.system.language.logger.service.LogEvent;

import static com.system.configuration.constants.Table.*;

public class BatchServlet extends HttpServlet  {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	private int 		id;	
	private String 		batchKey;
	private String 		contextFile;	
	private String 		databaseFile;			
	private String 		jobReportFile;	
	
	private String 		inCsvFile;	
	private String 		databaseLoc;	
	
	private String 		createUser;			 
	private Timestamp 	createTimestamp;	 
	private String 		modifyUser;			 
	private Timestamp 	modifyTimestamp;	 
	
	public boolean 		batchReady;
	
	protected LogEvent 	myLog;
	public String 		className = this.getClass().getName();
	
	/***********************************************************************************
	 ***********************************************************************************/
	public BatchBean formatBatchBean (HttpServletRequest request) {
		
		try {
			id	= Integer.valueOf(request.getParameter("id"));
		 } catch( NumberFormatException  e){
			 System.out.println( "Exception Reading " + id );
		 }
		
		batchKey 		= request.getParameter("batchKey");
		contextFile 	= request.getParameter("contextFile");
		databaseFile 	= request.getParameter("databaseFile");
		jobReportFile 	= request.getParameter("jobReportFile");
		
		inCsvFile 		= request.getParameter("inCsvFile");
		databaseLoc 	= request.getParameter("databaseLoc");
		
		createUser 		= request.getParameter("createUser");
		createTimestamp	= Timestamp.valueOf( request.getParameter("createTimestamp"));
		modifyUser 		= request.getParameter("modifyUser");
		modifyTimestamp = Timestamp.valueOf(request.getParameter("modifyTimestamp"));
				
		BatchBean batchBean = new BatchBean ( 
										      id
											, batchKey
											, contextFile
											, databaseFile
											, jobReportFile
											, inCsvFile
											, databaseLoc
											, createUser
											, createTimestamp
											, modifyUser
											, modifyTimestamp
				 							);

		return batchBean;
		
	} 
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkBatchBeanFieldFormat (BatchBean batchBean) {
		
		if ((checkIdFormat				(batchBean))
				
		&&  (checkBatchKeyFormat 		(batchBean))
		&&  (checkContextFileFormat 	(batchBean))
		&&  (checkDatabaseFileFormat 	(batchBean))
		&&  (checkJobReportFileFormat 	(batchBean))
		
		&&  (checkCreateUserFormat 		(batchBean))
		&&  (checkCreateTimestampFormat (batchBean))
		&&  (checkModifyUserFormat 		(batchBean))
		&&  (checkModifyTimestampFormat (batchBean))) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkIdFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(BATCH_SCREEN);
		expressionBean.setFieldName(BATCH_ID_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,String.valueOf(batchBean.getId()));
	}
		
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkBatchKeyFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(BATCH_SCREEN);
		expressionBean.setFieldName(BATCH_KEY_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,batchBean.getBatchKey());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkContextFileFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(BATCH_SCREEN);
		expressionBean.setFieldName(CONTEXT_FILE_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,batchBean.getContextFile());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDatabaseFileFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(BATCH_SCREEN);
		expressionBean.setFieldName(DATABASE_CONFIG_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,batchBean.getDatabaseConfiguration());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkJobReportFileFormat (BatchBean batchBean) {
		
//		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(BATCH_SCREEN);
		expressionBean.setFieldName(JOB_REPORT_FIELD);
		
//		return expressionHelpDao.validateScreenField(expressionBean
//													,batchBean.getJobReportFile());
		return false;
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateUserFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,batchBean.getCreateUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkCreateTimestampFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(CREATE_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,batchBean.getCreateTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyUserFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_USER_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,batchBean.getModifyUser());
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkModifyTimestampFormat (BatchBean batchBean) {
		
		ExpressionDao expressionHelpDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(GENERIC_SCREEN);
		expressionBean.setFieldName(MODIFY_TIMESTAMP_FIELD);
		
		return expressionHelpDao.validateScreenField(expressionBean
													,batchBean.getModifyTimestamp().toString().substring(0,19));
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void performDatabaseAction (HttpServletRequest 	request
									  ,HttpServletResponse  response
									  ,BatchBean 			batchBean) {
	
		@SuppressWarnings("unused")
		LogEvent inLog = null;
		boolean result = false;
		
		BatchDao batchDao = new BatchDaoImpl();
		
		int intValue = Screen.getButtonCode (request.getParameter("submitAction"));
		
		switch (intValue) {
		
		case ACTIVATE_KEY:
			result = batchDao.select () != null ? true: false;
			break;
			
		case INSERT_RECORD:
			 result = batchDao.insert (batchBean) == 1 ? true : false;
			 break;
			 
		case UPDATE_RECORD:
			result = batchDao.update (batchBean) == 1 ? true : false;
			break;
			
		case DELETE_RECORD:
			result = batchDao.delete (batchBean.getId()) == 1 ? true : false;
			break;
			
		case TRANSFER_RECORD:
			new BatchServlet().performDatabaseTransfer (request,response,batchBean);
			break;
			
		default:
			System.out.println("BatchServlet ---> Button Not Depressed");
			result = false;
			break;
		}
	   
		batchReady = result;
		
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
    public void performDatabaseTransfer(HttpServletRequest 	request
    								   ,HttpServletResponse response
    								   ,BatchBean 			batchBean) {
    	  
    	System.out.println("BatchServlet --> performDatabaseTransfer()");
    	
        try {
        
			if ((new BatchServlet().checkFormat	  (batchBean)) 	
			&&  (new BatchServlet().checkDatabase (batchBean))) {    
        	
//				request.getSession().setAttribute("contextFile"	 , kludgeGroupId);
//				request.getSession().setAttribute("databaseFile" , kludgeUserId);
//				request.getSession().setAttribute("jobReportFile", kludgeSequence);
				
				request.getSession().setAttribute("groupId"	, batchBean.getContextFile());
				request.getSession().setAttribute("userId"	, batchBean.getDatabaseConfiguration());
//				request.getSession().setAttribute("sequence", batchBean.getJobReportFile());
				 
				response.sendRedirect("batchTransfer1.htm?contextFile="
									 +batchBean.getContextFile()
									 +"&databaseFile="
									 +batchBean.getDatabaseConfiguration()
									 +"&jobReportFile="
//									 +batchBean.getJobReportFile()
									 );
									 
			} else {
				
				response.sendRedirect("attributesFailed.htm");
			}
			
		} catch (Throwable exc) {
			  
			System.out.println(exc);
		}
        
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFormat (BatchBean batchBean) {
		 
		return false;

	}
    
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDatabase (BatchBean batchBean) {
		 
		return false;
		
	}
    
	/***********************************************************************************
	 ***********************************************************************************/	
	public void redisplayBatchForm  (HttpServletRequest 	request
									,HttpServletResponse 	response) {
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/cvsToDatabase.jsp");

		try {
			
			rd.forward(request, response);
			
		} catch (ServletException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/***********************************************************************************
	 ***********************************************************************************/	
	public void showBatchForm (HttpServletRequest request,HttpServletResponse response) {
		
		ServletContext sc = this.getServletContext();

		RequestDispatcher rd = sc.getRequestDispatcher("/displayCvsToDb.jsp");

		try {
			
			rd.include(request, response);
			
		} catch (ServletException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/***********************************************************************************
	 ***********************************************************************************/
	public void doGet (HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {

		  System.out.println("BatchServlet ---> Entering doGet()");
		  
		  BatchBean batchBean = new BatchServlet().formatBatchBean(request);
		  
		  new BatchServlet().display(batchBean);
		  
		  if ((batchBean != null )
		  && new BatchServlet().checkBatchBeanFieldFormat(batchBean)) {
			  performDatabaseAction (request, response, batchBean);
		  } else {
			  redisplayBatchForm (request,response);
			  return;
		  }
		  
		  
		  if (batchReady)
			  showBatchForm (request,response);
		  else
			  redisplayBatchForm (request,response);
	}

	/***********************************************************************************
	 ***********************************************************************************/
	public void display(BatchBean batchBean) {

		System.out.printf("ID...............= %20s\n", batchBean.getId() );
		System.out.printf("Batch Key........= %20s\n", batchBean.getBatchKey());
		System.out.printf("Context File.....= %20s\n", batchBean.getContextFile() );
		System.out.printf("Database Config..= %20s\n", batchBean.getDatabaseConfiguration() );
		System.out.printf("Job Report.......= %20s\n", batchBean.getJobReport());
		System.out.printf("Job Launcher.....= %20s\n", batchBean.getJobLauncher());
		System.out.printf("Report Job.......= %20s\n", batchBean.getReportJob());
		
		System.out.printf("Create User......= %20s\n", batchBean.getCreateUser());
		System.out.printf("Create Timestamp.= %20s\n", batchBean.getCreateTimestamp());
		System.out.printf("Modify User......= %20s\n", batchBean.getModifyUser() );
		System.out.printf("Modify Timestamp.= %20s\n", batchBean.getModifyTimestamp());
	 
	}
 
}