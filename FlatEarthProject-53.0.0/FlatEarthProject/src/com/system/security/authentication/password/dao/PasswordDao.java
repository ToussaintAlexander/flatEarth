package com.system.security.authentication.password.dao;

import java.util.List;

import com.system.security.authentication.password.model.PasswordBean;

public interface PasswordDao  {
	
	public boolean insert(PasswordBean password);												 
	public boolean update(PasswordBean password);												 
	public boolean delete(int groupId, int userId, int sequence);									 
	public PasswordBean selectPassword (String username, String password, String domain);
	public PasswordBean selectPasswordById (int id);
	public List<PasswordBean> select();	
	
	/**********************************************************************
	 * Rule #1
	 * 
	 * Determines if the unique GROUP ID and USER ID representing an
	 * account is currently in [status] status.	
	 * 
	 * @return boolean
	 **********************************************************************/	
	public boolean isAccountStatusEqual ( PasswordBean 	passwordBean
										, int	 		accountStatus);
	
	/**********************************************************************
	 * Rule #2
	 * 
	 * Determines whether a password is of type PERMANENT or TEMPORARY.
	 * 
	 * @return boolean
	 **********************************************************************/	
	public boolean isPasswordTypeEqual ( PasswordBean 	passwordBean
									   , int	 		passwordType);
	
	/**********************************************************************
	 * Rule #3
	 * 
	 * Determines whether a password is of type PERMANENT or TEMPORARY.
	 * 
	 * @return boolean
	 **********************************************************************/	
	public PasswordBean getPasswordGroupItems (PasswordBean passwordBean);
		
	/**********************************************************************
	 * Rule #4
	 * 
	 * Determines whether the number of days since the active account was 
	 * last successfully accessed is before the maximum days allowed.
	 * 
	 * @return boolean
	 **********************************************************************/		
	public boolean isLastAccessDateBefore ( PasswordBean 	passwordBean
									      , int 			maximumDaysLastAccessed); 
	
	/**********************************************************************
	 * Rule #5
	 * 								   Floor				 Ceiling
	 * [last change date]			[min days]				[max days]
	 * 										   ^
	 * 										   |
	 * 									[today's date]
	 * 
	 * Determines whether the number of days since the last password
	 * change is after the minimum days allowed for a password change.
	 * 
	 * @return boolean
	 **********************************************************************/	
	public boolean isPasswordChangeWithinWindow ( PasswordBean 	passwordBean
											    , int 			floor
											    , int			ceiling); 
	
	/**********************************************************************
	 * Rule #6
	 * 
	 * A persistent store for the account that accumulates the total number
	 * of times a user fails to provide the correct password for that
	 * this session.		
	 * 
	 * @return boolean
	 **********************************************************************/
	public boolean isPasswordAttemptsLessThan ( PasswordBean 	passwordBean
											  , int 			maximumPasswordAttempts);
	
	/**********************************************************************
	 * Rule #7
	 * 
	 * Determines whether the password provided already exists in history
	 * within [numberOfMonths] of today's date.
	 * 
	 * @return boolean
	 **********************************************************************/
	public boolean isPasswordUniqueInHistory ( PasswordBean passwordBean
											 , int 			numberOfMonths);
	
	/**********************************************************************
	 **********************************************************************/
	public void displayPasswordBean (PasswordBean passwordBean);
	
}