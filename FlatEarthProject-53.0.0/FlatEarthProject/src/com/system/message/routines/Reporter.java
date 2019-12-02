package com.system.message.routines;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.system.language.logger.service.LogEvent;

public class Reporter {

	private Class<Reporter> cls = Reporter.class;
	private String myFileName;
	private LogEvent myLog;
	private PrintWriter log;
	private boolean logValid;
	
	private final static int ERROR = 1;

	public Reporter(LogEvent inLog) {
		myLog = inLog;
		logValid = false;
	}

	public boolean open(String inFileName) {
		myFileName = inFileName;
		try {
			log = new PrintWriter(new FileWriter(myFileName), true);
		} catch (IOException e) {
			myLog.logException(cls.getName(), "open", e,
					"Error opening report log file", ERROR);
			return false;
		}
		logValid = true;
		return true;
	}

	public boolean write(String dataLine) {
		if (!logValid)
			return false;
		log.println(dataLine);
		return true;
	}

	public void close() {
		if (logValid) {
			log.close();
			logValid = false;
		}
		return;
	}

	public boolean rotate(String inFileName) {
		close();
		return open(inFileName);
	}

	public boolean hasError() {
		if (logValid) {
			if (log.checkError()) {
				log.close();
				logValid = false;
				return false;
			}
			return false;
		}
		return true;
	}
}