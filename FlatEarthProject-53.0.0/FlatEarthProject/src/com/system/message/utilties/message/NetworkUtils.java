package com.system.message.utilties.message;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

public class NetworkUtils {

	/***********************************************************************************
	 ***********************************************************************************
	 */		
	public BinLevel getBinLevel () {
		
		BinLevel binLevel = new BinLevel(1, 2, 3);				
		
		return binLevel;			// = 7
		
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
	public AcctLevel getAccountlevel () {
		
		AcctLevel accountLevel = new AcctLevel (4, 5, 6);		
		
		return accountLevel;		// = 34
	}
	/***********************************************************************************
	 ***********************************************************************************
	 */		
	public TransLevel getTransactionlevel () {
		
		TransLevel transactionLevel = new TransLevel (7, 8, 9);	
		
		return transactionLevel;	// = 79
	}
	
}
