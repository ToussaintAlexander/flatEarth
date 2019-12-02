package com.system.language.logger.service;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import com.system.configuration.constants.Message;
import com.system.configuration.constants.Table;
import com.system.language.message.model.MessageBean;

/*******************************************************************************/
/*******************************************************************************/
public class LogFilter implements Table {

	public Filter getFilter ( int 			inputFilterCode
						    , Message	filterValue
						    ) {
		
		Filter filter = null;
		
		switch (inputFilterCode)
		{
			case MESSAGE_FILTER:
								filter = new MessageFilter(filterValue);
								break;
			case OBJECT_FILTER: 
								filter = new ObjectFilter(filterValue);
								break;
			case PRIMITIVE_FILTER:
								filter = new PrimitiveFilter(filterValue);
								break;
			default:
								filter = new MessageFilter(filterValue);
								break;			
		}
		
		return filter;
	}
	
	/*******************************************************************************/
	/*******************************************************************************/
	public class MessageFilter implements Filter {
		
		private Message filterValue;
		
		public MessageFilter (Message filterValue) {
			this.setFilterValue(filterValue);
		}
		
		public Message getFilterValue() {
			return filterValue;
		}

		public void setFilterValue(Message filterValue) {
			this.filterValue = filterValue;
		}
		
		public boolean isLoggable(LogRecord lr) {
			
			String msg = lr.getMessage();
			
			for(int i=0;i < getFilterValue().getStringVector().size();i++){
				
				if (msg.startsWith(filterValue.getStringVector().elementAt(i)))
					return true;
				
//				if (msg.contains(filterValue.getStringVector().elementAt(i)))
//					return true;				
				
			}
			
			return false;
		}
	}
	
	/*******************************************************************************/
	// Hard-coded daoClass -  Not an Optimal Solution
	/*******************************************************************************/
	public class ObjectFilter implements Filter {
		
		private Message filterValue;
		
		public ObjectFilter (Message filterValue) {
			this.setFilterValue(filterValue);
		}
		
		public Message getFilterValue() {
			return filterValue;
		}

		public void setFilterValue(Message filterValue) {
			this.filterValue = filterValue;
		}
		
	    public boolean isLoggable(LogRecord record) {
	    	
	        Object[] params = record.getParameters();
	        
	        if (params == null)
	          return true; // No parameters
	        
	        System.out.println("Constructor Passed Value = " + filterValue.getObjectVector());
	        
			//if (record.getParameters()[0] instanceof DaoClass) {
//			if (record.getParameters()[0] instanceof filterValue.getObjectVector()) {	
				
//	          return true; 
//	        }
	        return false;
	      }
	}
	
	/*******************************************************************************/
	/*******************************************************************************/
	public boolean getRange(Message filterValue, MessageBean message) {
		
//		if ((accountBean.getAccountId() >= filterValue.getIntegerVector().get(0).intValue())
//		&&  (accountBean.getAccountId() <= filterValue.getIntegerVector().get(1).intValue()))
//		{
//			int min = filterValue.getAccountIdVector().get(0).intValue();
//			int max = filterValue.getAccountIdVector().get(1).intValue();
			
//			System.out.println(min + " <= " + accountBean.getAccountId() + " >= " + max);
			
			return true;
//		}
	
//	return false;
	}
	/*******************************************************************************/
	/*******************************************************************************/
	public boolean getTargets(Message	filterValue, MessageBean message) {
		
//		for(int i=0;i < filterValue.getIntegerVector().size();i++){

//			System.out.println("Target Log Param   = " + accountBean.getAccountId());
//			System.out.println("Target Constructor = " + filterValue.getIntegerVector().get(i).intValue());
			
//			if (accountBean.getAccountId() == filterValue.getIntegerVector().get(i).intValue())
			
				return true;
//		}
//		return false;
	}
	/*******************************************************************************/
	/*******************************************************************************/
	public class PrimitiveFilter implements Filter {

		private Message 	filterValue;
		
		public PrimitiveFilter (Message filterValue) {
			this.filterValue = filterValue;
		}
		
		public Message getFilterValue() {
			return filterValue;
		}

		public void setFilterValue(Message filterValue) {
			this.filterValue = filterValue;
		}

		public boolean isLoggable(LogRecord record) {
			
			boolean result = false;
			
			Object[] objs = record.getParameters();
			
			MessageBean accountBean = (MessageBean) objs[0];	// Parameter values
			
			if (accountBean != null) {
				
				if (getFilterValue().getIntegerVector().size() == 2) {
					result = getRange(filterValue, accountBean);
				} else {
					result = getTargets(filterValue, accountBean);
				}
			}
			return result;
		}
	}
		
	/*******************************************************************************/
	/*******************************************************************************/
	public class MyLoggingFilter implements Filter {
		
	    public boolean isLoggable(LogRecord record) {
	    	
	        if (!record.getLevel().equals(Level.FINEST) 
	        &&   record.getMessage().startsWith("DEBUG")){
	        	
	         return false;   
	        }
	        return true;
	    }
	}
}
/*******************************************************************************/
/*******************************************************************************/
