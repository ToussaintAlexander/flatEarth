package com.system.language.logger.service;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.XMLFormatter;

import com.system.configuration.constants.Table;

/******************************************************************************/
/******************************************************************************/
public class LogFormatter implements Table {
	
	private Formatter format;
	
	public Formatter getFormatter (int inputFormatCode) {
		
		switch (inputFormatCode)
		{
			case HTML_FORMAT:
						format = new HTMLFormatter();
						break;
			case PLAIN_FORMAT: 
						format = new LogFileFormatter();
						break;
			case XML_FORMAT:
						format = new XMLFormatter();
						break;
			default:
						format = new LogFileFormatter();
						break;			
		}
		
		return format;
	}
	
	/******************************************************************************/
	// Kludge: Used getMessage to extract class & method names from LogRecord.
	/******************************************************************************/
	public class LogFileFormatter extends Formatter {
		
		private final DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
	    public String format(LogRecord record) {
	    	
//	    	LogEvent log = null;
	    	String 	subsystem = null;
	    	
//	    	IncrementHelpDao incrementHelpDao = new IncrementHelpDaoImpl(INCREMENT_TABLE, log);
//	    	IncrementBean incrementBean = new IncrementBean();
//	    	incrementBean.setTableName(LOGGER_TABLE);
//	    	int lineNumber = incrementHelpDao.getNextIncrement(incrementBean);
	    	String lineNumberStr = null;
	    	
//	    	if 		(lineNumber < 10) 	lineNumberStr = "000" 	+ lineNumber;
//	    	else if (lineNumber < 100) 	lineNumberStr = "00" 	+ lineNumber;
//	    	else if	(lineNumber < 1000) lineNumberStr = "0" 	+ lineNumber;
//	    	else 	 lineNumberStr = String.valueOf(lineNumber);
	    	
//			String processName = new SysProperties("T_SYSPROPERTIES",log).getProcessName();
/*	    	
			CACHE
			LOGGER
			SECURE
			VALID
			TRANS 
			REPORT 
			BATCH
			APPL
*/			
			if  (record.getMessage().startsWith("Expression"))
				subsystem	= "*VALIDF";
			
			if  (record.getMessage().startsWith("Password"))
				subsystem	= "*SECURE";
			
			if  ((record.getMessage().startsWith("Account")
			||	 (record.getMessage().startsWith("Customer"))
			||	 (record.getMessage().startsWith("Invoice"))
			||	 (record.getMessage().startsWith("Product"))))
				subsystem	= "*SQLDML";
			
			if  ((record.getMessage().startsWith("Increment")
			||	 (record.getMessage().startsWith("Logger"))
			||	 (record.getMessage().startsWith("Message"))
			||	 (record.getMessage().startsWith("Properties"))
			||	 (record.getMessage().startsWith("Sysproperty"))
			||	 (record.getMessage().startsWith("Version"))))
				subsystem	= "*SYSTEM";
	    	
//	    	VersionBean versionBean = new VersionBean();
//	    	String version = new VersionDaoImpl("T_VERSION", log).readVersion(versionBean).getProjectVersion(); // bad - recursion !!!
	    	
	    	return
	    			
		        	" " 
		        	+ lineNumberStr 
				    + "  "
					+ getDf().format(new Date(record.getMillis()))
					+ "  "
//					+ processName 
				    + "  "
				    + subsystem 
				    + "."
//					+ version 
				    + "  "
					+ record.getLevel() 	
					+ "  "
					+ record.getMessage()
					+ "  "
					+ "\n";
	    	
	    	
	        }

		public DateFormat getDf() {
			return df;
		}
	}
	
	/******************************************************************************/
	/******************************************************************************/
	public class HTMLFormatter extends Formatter {

		public String format(LogRecord rec) {
			
			StringBuffer buf = new StringBuffer(1000);
			
			// Bold any levels >= WARNING
			if (rec.getLevel().intValue() == Level.WARNING.intValue()) {
				buf.append("<tr bgcolor='yellow' valign='top'><td>"	+ rec.getLevel() + "</td>");
				
			} else if (rec.getLevel().intValue() == Level.SEVERE.intValue()) {
				buf.append("<tr bgcolor='red' valign='top'><td>" + rec.getLevel() + "</td>");
				
			} else if (rec.getLevel().intValue() == Level.FINE.intValue()) {
				buf.append("<tr bgcolor='lightGreen' valign='top'><td>" + rec.getLevel() + "</td>");
				
			} else {
				buf.append("<tr bgcolor='white'  valign='top'><td>"	+ rec.getLevel() + "</td>");
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS",Locale.ENGLISH);
			Date d = new Date(rec.getMillis());

			buf.append("<td>&nbsp;" + sdf.format(d) 			+ "</td>");
			buf.append("<td>&nbsp;" + rec.getThreadID() 		+ "</td>");
			buf.append("<td>&nbsp;" + rec.getSourceClassName() 	+ "</td>");
			buf.append("<td>&nbsp;" + rec.getSourceMethodName() + "</td>");
			
			if (rec.getThrown() != null) {
				buf.append("<td>&nbsp;" + getStackTrace(rec.getThrown()) + "</td></tr>\n");
			} else {
				buf.append("<td>&nbsp;" + formatMessage(rec) + "</td></tr>\n");
			}
			return buf.toString();
		}
		
		/*******************************************************************************/
		// This method is called just after the handler using this
		// formatter is created
		/*******************************************************************************/
		@Override
		public String getHead(Handler h) {
			return "<head>"
					+ "<title>LOG FILE</title>"
					+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>"
					+ "<style>"
					+ "body {font-size:16px;font-weight:bold}"
					+ "td {font-face:monospaced;font-size:12px}"
					+ "th {font-size:14px;font-weight:bold;background:#AAAAAA}"
					+ "</style></head><body><p>\n"
					+ (new Date())
					+ "\n"
					+ "<table width = '90%' border='1' cellspacing = '0' cellpadding='3'>"
					+ "<tr valign='top'>" + "<th width='50px'>LEVEL</th>"
					+ "<th width='100px'>TIME</th>" + "<th>THREAD</th>"
					+ "<th>CLASS</th>" + "<th>METHOD</th>" + "<th>MESSAGE</th>"
					+ "</tr>\n";
		}

		/*******************************************************************************/
		// This method is called just after the handler using this
		// formatter is closed
		/*******************************************************************************/
		@Override
		public String getTail(Handler h) {
			return "</table></body>\n";
		}

		/*******************************************************************************/
		/*******************************************************************************/
		private String getStackTrace(Throwable aThrowable) {
			final Writer result = new StringWriter();
			final PrintWriter printWriter = new PrintWriter(result);
			aThrowable.printStackTrace(printWriter);
			return result.toString().replaceAll("\n", "<br />");
		}
	}
}	