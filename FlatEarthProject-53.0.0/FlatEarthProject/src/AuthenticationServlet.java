

import static com.system.configuration.constants.Table.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.system.configuration.constants.Screen;
import com.system.language.expression.model.ExpressionBean;
import com.system.security.authentication.password.dao.PasswordDao;
import com.system.security.authentication.password.dao.PasswordDaoImpl;
import com.system.security.authentication.password.model.PasswordBean;
//import com.system.security.authorization.profile.dao.ProfileDao;
//import com.system.security.authorization.profile.dao.ProfileDaoImpl;
import com.system.security.authorization.profile.model.ProfileBean;
import com.system.language.expression.dao.ExpressionDao;
import com.system.language.expression.dao.ExpressionDaoImpl;

@WebServlet(
	    name = "AuthenticationServlet",
	    description = "A sample annotated servlet",
	    urlPatterns = {"/AuthenticationServlet"}
	)
public class AuthenticationServlet extends HttpServlet {
	
	private static final long serialVersionUID = -1262211178220919921L;
	
	public Class<?> className	= this.getClass();
	public String classNameStr	= className.getSimpleName().toString();

	int count; 
	 
	static int kludgeGroupId 	= 0; 	  
	static int kludgeUserId 	= 0; 	 
	static int kludgeSequence 	= 0;

	/***********************************************************************************
	 ***********************************************************************************/
	  public void init(ServletConfig config) throws ServletException { 
		    
		  System.out.println("AuthenticationServlet ---> Entering init() Method");
		  
		    super.init(config); 

		    incrementCounter();
		    
		    getServletConfiguration(config);
		    
		    getServletContext(config);
		    
	 } 
	/***********************************************************************************
	 ***********************************************************************************/
	public void incrementCounter() {
			 
		System.out.println("AuthenticationServlet ---> Entering incrementCounter() Method");
			
	    // Try to load the initial count from our saved persistent state 
	    // C:\Users\Toussaint\Documents\Education\Frameworks\Spring\Spring Modules\springSource\sts-3.5.0.RELEASE
	    
	    try { 
	    	
	      FileReader fileReader = new FileReader("InitDestroyCounter.initial"); 
	      BufferedReader bufferedReader = new BufferedReader(fileReader); 
	      String initial = bufferedReader.readLine(); 
	      count = Integer.parseInt(initial); 
	      bufferedReader.close();
	      System.out.println("AuthenticationServlet ---> Exiting incrementCounter() Method");
	      return; 
	      
	    } 
	    
	    catch (FileNotFoundException ignored) { }  // no saved state 
	    catch (IOException ignored) { }            // problem during read 
	    catch (NumberFormatException ignored) { }  // corrupt saved state 
	  
	    // No luck with the saved state, check for an init parameter 
	    String initial = getInitParameter("initial"); 
	    try { 
	      count = Integer.parseInt(initial); 
	      return; 
	    } 
	    catch (NumberFormatException ignored) { }  // null or non-integer value 
	  
	    // Default to an initial count of "0" 
	    count = 0; 
			
	}
	/***********************************************************************************
	 * A servlet configuration object used by a servlet container to pass information 
	 * to a servlet during initialization.
	 * 
	 * This object can be used to get configuration information from web.xml file.
	 * 
	 * Methods:
	 * 1. public String getInitParameter(String name) 
	 * 2. public Enumeration getInitParameterNames() 
	 * 3. public String getServletName() 
	 * 4. public ServletContext getServletContext() 
	 ***********************************************************************************/
	public void getServletConfiguration(ServletConfig config) {
			 
		System.out.println("AuthenticationServlet ---> Entering getServletConfiguration() Method");
		
		//ServletConfig config = getServletConfig(); 
		
		System.out.println("Servlet Name = " + getServletName());
		
	    Enumeration<String> e = config.getInitParameterNames();  
        
	    String str="";  
	    
	    while(e.hasMoreElements()){  
	    	str=e.nextElement();  
	    	System.out.println("<br>Name: "	+	str);  
	    	System.out.println(" value: "	+	config.getInitParameter(str));  
	    }  
	      
	    System.out.println("AuthenticationServlet ---> Exiting getServletConfiguration() Method");
	    
	}
	/***********************************************************************************
	 * An object of ServletContext is created by the web container at time of deploying 
	 * the project. 
	 * 
	 * 1. The object of ServletContext provides an interface between the container and 
	 *    servlet.
	 * 2. The ServletContext object can be used to get configuration information from 
	 *    the web.xml file.
	 * 3. The ServletContext object can be used to set, get or remove attribute from the 
	 *    web.xml file.
	 * 4. The ServletContext object can be used to provide inter-application 
	 *    communication.
	 * 
	 * There is only one ServletContext object per web application.
	 * 
	 * Methods:
	 * 1. public String getInitParameter(String name):Returns the parameter value for 
	 *    the specified parameter name.
	 * 2. public Enumeration getInitParameterNames():Returns the names of the context's 
	 *    initialization parameters.
	 * 3. public void setAttribute(String name,Object object):sets the given object in 
	 *    the application scope.
	 * 4. public Object getAttribute(String name):Returns the attribute for the specified 
	 *    name.
	 * 5. public Enumeration getInitParameterNames():Returns the names of the context's 
	 *    initialization parameters as an Enumeration of String objects.
	 * 6. public void removeAttribute(String name):Removes the attribute with the given 
	 *    name from the servlet context.
	 ***********************************************************************************/
	public void getServletContext(ServletConfig config) {
			 
		System.out.println("AuthenticationServlet ---> Entering getServletContext() Method");
		
		//creating ServletContext object  
		ServletContext context=getServletContext();  
		
		Enumeration<String> e=context.getInitParameterNames();  
		      
		String str="";  
		
		while(e.hasMoreElements()){  
		    str=e.nextElement();  
		    System.out.println("<br> "+context.getInitParameter(str));  
		}  
	      
	    System.out.println("AuthenticationServlet ---> Exiting getServletContext() Method");
	    
	}
	/***********************************************************************************
	 *  The only valid test for check box is to see whether getParameter() returns 
	 *  null or not. 
	 *  
	 *  If the return value is null it's unchecked, otherwise it's checked.
	 ***********************************************************************************/	
	public PasswordBean formatPasswordBean (HttpServletRequest request) {
		
		System.out.println("AuthenticationServlet ---> Entering formatPasswordBean() Method");
		
		PasswordBean passwordBean = new PasswordBean();
		
		passwordBean.setUsername(request.getParameter("username").toUpperCase());
		passwordBean.setPassword(request.getParameter("password"));	
		passwordBean.setDomain	(request.getParameter("domain").toUpperCase());
		
		if (request.getParameter("rememberMe") != null) {
			passwordBean.setRememberMe(true);
		} else {
			passwordBean.setRememberMe(false);
		}
		
		System.out.println("AuthenticationServlet ---> Exiting formatPasswordBean() Method");
		
		return passwordBean;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkFormat(PasswordBean passwordBean) {
		 
		System.out.println("AuthenticationServlet ---> Entering checkFormat() Method");
		
		if ((checkUsernameFormat	(passwordBean))
		&&  (checkPasswordFormat 	(passwordBean))
		&&  (checkDomainFormat 		(passwordBean))
		&&  (checkRememberMeFormat 	(passwordBean))) {
			
			System.out.println("AuthenticationServlet ---> Exiting checkFormat() Method: " + true);
			
			return true;
			
		} else {
			
			System.out.println("AuthenticationServlet ---> Exiting checkFormat() Method: " + false);
			
			return false;		
			
		}
		
	}
	/***********************************************************************************
	 *  If failure here possibly Oracle Service in a Stopped State
	 ***********************************************************************************/
	@SuppressWarnings("unused")
	public boolean checkUsernameFormat(PasswordBean passwordBean) {
		 
		boolean result = false;
		
		System.out.println("AuthenticationServlet ---> Entering checkUsernameFormat() " + passwordBean.getUsername() + " " + result);
		
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		 
		ExpressionBean expressionBean = new ExpressionBean();
		 
		expressionBean.setScreenName(LOGIN_SCREEN);
		expressionBean.setFieldName(USERNAME_FIELD);
		System.out.println("Hello 1");
		result = true; //expressionDao.validateScreenField(expressionBean, passwordBean.getUsername());
		System.out.println("Hello 2");
		System.out.println("AuthenticationServlet ---> Exiting checkUsernameFormat() " + passwordBean.getUsername() + " " + result);
		
		return result;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkPasswordFormat(PasswordBean passwordBean) {
		
		boolean result = false;
		
		System.out.println("AuthenticationServlet ---> Exiting checkPasswordFormat() " + passwordBean.getPassword() + " " + result);
		
		@SuppressWarnings("unused")
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGIN_SCREEN);
		expressionBean.setFieldName(PASSWORD_FIELD);
		
		result = true; //expressionDao.validateScreenField(expressionBean,passwordBean.getPassword());
		
		System.out.println("AuthenticationServlet ---> Exiting checkPasswordFormat() " + passwordBean.getPassword() + " " + result);
		
		return result;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkDomainFormat(PasswordBean passwordBean) {
		
		boolean result = false;
		
		System.out.println("AuthenticationServlet ---> Entering checkDomainFormat() " + passwordBean.getDomain() + " " + result);
		
		@SuppressWarnings("unused")
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGIN_SCREEN);
		expressionBean.setFieldName(DOMAIN_FIELD);
		
		result = true; //expressionDao.validateScreenField(expressionBean,passwordBean.getDomain());
		
		System.out.println("AuthenticationServlet ---> Exiting checkDomainFormat() " + passwordBean.getDomain() + " " + result);
		
		return result;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public boolean checkRememberMeFormat(PasswordBean passwordBean) {
		
		boolean result = false;
		
		String rememberMe = null;
				
		System.out.println("AuthenticationServlet ---> Entering checkRememberMeFormat() " + rememberMe + " " + result);
		
		@SuppressWarnings("unused")
		ExpressionDao expressionDao = new ExpressionDaoImpl();
		
		ExpressionBean expressionBean = new ExpressionBean();
		
		expressionBean.setScreenName(LOGIN_SCREEN);
		expressionBean.setFieldName(REMEMBER_ME_FIELD);
		
		if(passwordBean.getRememberMe()) {
			rememberMe = "Yes";
		} else {
			rememberMe = "No";
		}
		
		result = true; //expressionDao.validateScreenField(expressionBean,rememberMe.toUpperCase());
		
		System.out.println("AuthenticationServlet ---> Exiting checkRememberMeFormat() " + rememberMe + " " + result);
		
		return result;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public void resetPasswordAttemptCounter (PasswordBean passwordBean) {
		
		System.out.println("AuthenticationServlet ---> Entering resetPasswordAttemptCounter() Method");
		
		PasswordDao passwordDao = new PasswordDaoImpl();
		
		passwordBean.setPasswordAttempts(ZERO_FAILED_ATTEMPTS );
		
		passwordDao.update(passwordBean);
		
		System.out.println("AuthenticationServlet ---> Exiting resetPasswordAttemptCounter() Method");
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public void incrementPasswordAttemptCounter (PasswordBean passwordBeanIn) {
		
		System.out.println("AuthenticationServlet ---> Entering incrementPasswordAttemptCounter() Method");
		
		PasswordDao passwordDao = new PasswordDaoImpl();
		
		String username = passwordBeanIn.getUsername();
		String password = passwordBeanIn.getPassword();
		String domain 	= passwordBeanIn.getDomain();
		
		PasswordBean passwordBeanOut = passwordDao.selectPassword(username,password,domain);
		
		int passwordAttempts = passwordBeanOut.getPasswordAttempts();
			
		switch (passwordAttempts) {
		
			case ZERO_FAILED_ATTEMPTS:	
			
				passwordAttempts = passwordBeanOut.getPasswordAttempts() + 1;
				passwordBeanOut.setPasswordAttempts(passwordAttempts);
				passwordDao.update(passwordBeanOut);
				break;
		
			case ONE_FAILED_ATTEMPT:
			
				passwordAttempts = passwordBeanOut.getPasswordAttempts() + 1;
				passwordBeanOut.setPasswordAttempts(passwordAttempts);
				passwordDao.update(passwordBeanOut);
				break;
			
			case TWO_FAILED_ATTEMPTS:
			
				passwordAttempts = passwordBeanOut.getPasswordAttempts() + 1;
				passwordBeanOut.setPasswordAttempts(passwordAttempts);
				passwordBeanOut.setAccountStatus(FROZEN_STATUS);
				break;
				
		}
		
		System.out.println("AuthenticationServlet ---> Exiting incrementPasswordAttemptCounter() Method");
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	@SuppressWarnings("unused")
	public boolean checkDatabase(PasswordBean passwordIn) {
		 
		System.out.println("AuthenticationServlet ---> Entering checkDatabase() Method");
		
		PasswordDao passwordDao = new PasswordDaoImpl();
		 
		String username = passwordIn.getUsername();
		String password = passwordIn.getPassword();
		String domain 	= passwordIn.getDomain();
		System.out.println("Hello 1");
		PasswordBean passwordFound = new PasswordBean(); //passwordDao.selectPassword(username,password,domain);
		System.out.println("Hello 2"); 
		if (passwordFound != null) {
			
			passwordFound = rememberMeOnThisComputer (passwordFound);
			System.out.println("Hello 3");
			//passwordDao.update (passwordFound);
			System.out.println("Hello 4");
		}
		
		System.out.println("AuthenticationServlet ---> Exiting checkDatabase() Method");
		
		return true;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public PasswordBean rememberMeOnThisComputer (PasswordBean passwordBean) {
		
		System.out.println("AuthenticationServlet --> Entering rememberMeOnThisComputer() Method");
		
		String computerName	= passwordBean.getComputerName();
		String modifyUser 	= passwordBean.getModifyUser();
	
		if ((passwordBean.getRememberMe()) && (computerName != null)) {
			
			passwordBean.setComputerName(computerName);
		
			passwordBean.setModifyUser(modifyUser);
			passwordBean.setModifyTimestamp(new Timestamp(System.currentTimeMillis()));			
		}
		
		System.out.println("AuthenticationServlet --> Exiting rememberMeOnThisComputer() Method");
		
		return passwordBean;
		
	}
	/***********************************************************************************
	 * Password Policy
	 * 
	 * - Must be at least 8 characters in length
	 * - Cannot include more than 3 identical consecutive characters
	 * - Must have at least 1 alphabetic character
	 * - Must have at least 1 numeric character
	 * - Cannot include the following special characters: ,<.>/;:'"[{}]-
	 * - Cannot be any of the past 13 passwords
	 * - Cannot be SPACES
	 * - Cannot be the user name 
	 * 
	 ***********************************************************************************/
	public boolean checkRules (int buttonPressed, PasswordBean passwordBeanIn) {
		 
		System.out.println("AuthenticationServlet --> Entering checkRules() Method");
		
		boolean result = false;
		
		PasswordDao passwordDao = new PasswordDaoImpl();
		System.out.println("Hello 5");
		//PasswordBean passwordBeanOut = passwordDao.getPasswordGroupItems (passwordBeanIn);
		System.out.println("Hello 6");
		//System.out.println("isAccountStatusEqual         = " + passwordDao.isAccountStatusEqual			(passwordBeanIn, ACTIVE_STATUS)); 
		System.out.println("Hello 7");
		//System.out.println("isPasswordTypeEqual          = " + passwordDao.isPasswordTypeEqual			(passwordBeanIn, PERMANENT_TYPE)); 
		System.out.println("Hello 8");
		//System.out.println("isLastAccessDateBefore       = " + passwordDao.isLastAccessDateBefore		(passwordBeanOut, LAST_ACCESS_DAYS)); 
		System.out.println("Hello 9");
		//System.out.println("isPasswordChangeWithinWindow = " + passwordDao.isPasswordChangeWithinWindow	(passwordBeanIn, LAST_PLUS_FLOOR,LAST_MINUS_CEILING));
		System.out.println("Hello 10");
		//System.out.println("isPasswordAttemptsLessThan   = " + passwordDao.isPasswordAttemptsLessThan 	(passwordBeanIn, MAXIMUM_ATTEMPTS)); 
		System.out.println("Hello 11");
		
  		switch (buttonPressed) {
  		
		case LOGIN_BUTTON:
			
//			if ((passwordDao.isAccountStatusEqual 			(passwordBeanIn, ACTIVE_STATUS)) 
//			&   (passwordDao.isPasswordTypeEqual   			(passwordBeanIn, PERMANENT_TYPE)) 
//			&   (passwordDao.isLastAccessDateBefore  		(passwordBeanOut,LAST_ACCESS_DAYS)) 
//			&   (passwordDao.isPasswordChangeWithinWindow 	(passwordBeanIn, LAST_PLUS_FLOOR,LAST_MINUS_CEILING))
//			&   (passwordDao.isPasswordAttemptsLessThan 	(passwordBeanIn, MAXIMUM_ATTEMPTS))) 
//			{
//			if (true) {
				result = true;
//			} else {
//				result = false;
//			}
				
			break;
			
		case RESET_BUTTON:
			
			if ((passwordDao.isAccountStatusEqual 			(passwordBeanIn, ACTIVE_STATUS))
			&&  (passwordDao.isPasswordTypeEqual   			(passwordBeanIn, PERMANENT_TYPE)) 
			&&  (passwordDao.isLastAccessDateBefore  		(passwordBeanIn, LAST_ACCESS_DAYS)) 
			&&  (passwordDao.isPasswordChangeWithinWindow 	(passwordBeanIn, LAST_PLUS_FLOOR,LAST_MINUS_CEILING))
			&&  (passwordDao.isPasswordAttemptsLessThan 	(passwordBeanIn, MAXIMUM_ATTEMPTS))
			
			&&  (passwordDao.isPasswordUniqueInHistory   	(passwordBeanIn, NUMBER_OF_MONTHS))) 
			{
				result = true;
			} else {
				result = false;
			}
			
			break;
			 
		default:
		
			System.out.println("AuthenticationServlet ---> Exit Button Pressed");
			break;
			
		}
  		
  		System.out.println("AuthenticationServlet --> Exiting checkRules() Method");
  		
  		return result;
		
	}
	/***********************************************************************************
	 ***********************************************************************************/
	public void getSecurityProfile (PasswordBean passwordBean) {
		
		System.out.println("AuthenticationServlet --> Entering getSecurityProfile() Method");
		
		ProfileBean profileBeanIn = new ProfileBean();
		
		List<ProfileBean> profileBeanList = new ArrayList<ProfileBean>();
		List<String> profileBeanString = new ArrayList<String>();
		
		// Read Password Table Twice Here - Rework
		PasswordDao passwordDao = new PasswordDaoImpl();
		
		String username = passwordBean.getUsername();
		String password = passwordBean.getPassword();
		String domain 	= passwordBean.getDomain();
		
		PasswordBean passwordBeanOut = passwordDao.selectPassword(username,password,domain);
		
		profileBeanIn.setGroupId	(passwordBeanOut.getGroupId()	);
		profileBeanIn.setUserId		(passwordBeanOut.getUserId()	);
		profileBeanIn.setSeq		(passwordBeanOut.getSeq()		);
		
		//ProfileDao profileDao = new ProfileDaoImpl();
	 
//		profileBeanList = profileDao.readProfile (profileBeanIn);
		
//		profileBeanString = profileDao.readProfile (profileBeanIn);
		
		System.out.println("Login Size = " + profileBeanList.size());
		System.out.println("list = " + profileBeanList );
		
//		Iterator<ProfileBean> itr = profileBeanList.iterator();
		Iterator<String> itr = profileBeanString.iterator();
		
		while (itr.hasNext()) {
//		    ProfileBean element = itr.next();
		    String element = itr.next();
		    System.out.println("Element = " + element);
//		    System.out.println("Menu   = " + element.getMenuName());
//		    System.out.println("Screen = " + element.getScreenName());
//		    System.out.println("Field  = " + element.getFieldName());
		}
		
		System.out.println("AuthenticationServlet --> Exiting getSecurityProfile() Method");
	
	}
	/***********************************************************************************
	 ***********************************************************************************/
    public void doGet(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {
    	  
    	count++; 
    	 
    	System.out.println("AuthenticationServlet --> Entering doGet(): Accessed " + count + " Times");
    	   
        try {
        	
			PasswordBean passwordBean = new AuthenticationServlet().formatPasswordBean(request);
			
			int buttonPressed = Screen.getButtonCode (request.getParameter("submitAction"));
			 
			if ((new AuthenticationServlet().checkFormat	(passwordBean)) 	
			&&  (new AuthenticationServlet().checkDatabase	(passwordBean))    
			&&  (new AuthenticationServlet().checkRules		(buttonPressed, passwordBean))) { 			
				 
				request.getSession().setAttribute("groupId"	, kludgeGroupId);
				request.getSession().setAttribute("userId"	, kludgeUserId);
				request.getSession().setAttribute("sequence", kludgeSequence);
				
				request.getSession().setAttribute("groupId"	, passwordBean.getGroupId());
				request.getSession().setAttribute("userId"	, passwordBean.getUserId());
				request.getSession().setAttribute("sequence", passwordBean.getSeq());
				
				System.out.println("Hello 9");	
				
				//response.sendRedirect("mainMenu.htm");
				response.sendRedirect("environmentMenu.htm");
				
/*				
				response.sendRedirect("authorization.htm?groupId="
									 +passwordBean.getGroupId()
									 +"&userId="
									 +passwordBean.getUserId()
									 +"&sequence="
									 +passwordBean.getSeq());
*/				
				System.out.println("Hello 10");											 
								 
			} else {
				
				response.sendRedirect("loginFailed.htm");
			}
			
		} catch (Throwable exc) {
			  
			System.out.println(exc);
		}
        
        if (count % 10 == 0) saveState(); 
        
        System.out.println("AuthenticationServlet --> Exiting doGet(): Accessed " + count + " Times");
        
	}
	/***********************************************************************************
	 ***********************************************************************************/
    public void doGet2(HttpServletRequest request,HttpServletResponse response)
      throws ServletException, IOException {
    	  
    	System.out.println("AuthenticationServlet --> Entering doGet2 Method");
    	
        try {
        	  
			PasswordBean passwordBean = new AuthenticationServlet().formatPasswordBean(request);
			  
			int buttonPressed = Screen.getButtonCode (request.getParameter("submitAction"));
			  
			if ((new AuthenticationServlet().checkFormat(passwordBean)) 	
			&&  (new AuthenticationServlet().checkDatabase(passwordBean))    
			&&  (new AuthenticationServlet().checkRules(buttonPressed, passwordBean))) { 			
				 
				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser",passwordBean);
				
				new AuthenticationServlet().getSecurityProfile (passwordBean);

				String var1 = "Toussaint";
				String var2 = "Alexander";
				
//				response.sendRedirect("HelloServlet");
				response.sendRedirect("controller.htm?username="+var1+"&password="+var2);
				
			} else {
				  
				response.sendRedirect("loginFailed.htm");
			}
			
		} catch (Throwable exc) {
			  
			System.out.println(exc);
			
		}
        
        System.out.println("AuthenticationServlet --> Exiting doGet2 Method");
        
	}
	/***********************************************************************************
	 * Servlet Life Cycle
	 * 
	 * The servlet is initialized by calling the init () method.
	 * The servlet calls service() method to process a client's request.
	 * The servlet is terminated by calling the destroy() method.
	 * Finally, servlet is garbage collected by the garbage collector of the JVM.
	 *
	 * When a user invokes a servlet, a single instance of each servlet gets created, 
	 * with each user request resulting in a new thread that is handed off to doGet 
	 * or doPost as appropriate. 
	 *
	 ***********************************************************************************/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("AuthenticationServlet --> Entering doPost() Method");
		
		doGet(request, response);	
		
		System.out.println("AuthenticationServlet --> Exiting doPost() Method");
		
	}
	/***********************************************************************************
	 * Called only once at the end of the life cycle of a servlet. 
	 * This method gives your servlet a chance to close database connections, 
	 * halt background threads, write cookie lists or hit counts to disk, and 
	 * perform other such cleanup activities.
	 *
	 * After the destroy() method is called, the servlet object is marked for
	 * garbage collection.
	 ***********************************************************************************/
	  public void destroy() { 
		  
		  System.out.println("AuthenticationServlet:Entering destroy() Method");
		  
		  saveState(); 
		    
		  System.out.println("AuthenticationServlet:Exiting destroy() Method");
		  
	  } 
	/***********************************************************************************
	 ***********************************************************************************/
	 public void saveState() { 
	
		System.out.println("AuthenticationServlet:Entering saveState() Method");
		 
	    try { 
	    	 
		      FileWriter fileWriter = new FileWriter("InitDestroyCounter.initial"); 
		      String initial = Integer.toString(count); 
		      fileWriter.write(initial, 0, initial.length()); 
		      fileWriter.close(); 
		      return; 
		      
		} catch (IOException e) {  
		      
		} 
	    
	    System.out.println("AuthenticationServlet:Exiting saveState() Method");
	    
	} 
	
}