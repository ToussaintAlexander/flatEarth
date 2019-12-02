package com.system.message.utilties.datetime;

import java.sql.Date;
import java.util.Calendar;

public class DateUtils {
	public static Date convertCalToDate(Calendar inCal) {
		Date rslt = null;
		int iYYYY;
		int iMM;
		int iDD;
		String sYYYY;
		String sMM;
		String sDD;
		iYYYY = inCal.get(Calendar.YEAR);
		iMM = inCal.get(Calendar.MONTH);
		iMM++;
		iDD = inCal.get(Calendar.DAY_OF_MONTH);
		sYYYY = Integer.toString(iYYYY);
		if (iMM < 10)
			sMM = "0" + Integer.toString(iMM);
		else
			sMM = Integer.toString(iMM);
		if (iDD < 10)
			sDD = "0" + Integer.toString(iDD);
		else
			sDD = Integer.toString(iDD);
		rslt = Date.valueOf(sYYYY + "-" + sMM + "-" + sDD);
		return rslt;
	}

	public static Calendar convertDateToCal(Date inDt) {
		Calendar rslt = Calendar.getInstance();
		int inYYYY = Integer.parseInt(inDt.toString().substring(0, 4));
		int inMM = Integer.parseInt(inDt.toString().substring(5, 7));

		inMM--;

		if (inMM < 0)
			inMM = 11;
		int inDD = Integer.parseInt(inDt.toString().substring(8, 10));
		rslt.set(inYYYY, inMM, inDD);
		return rslt;
	}

	public static String getCurrentSqlDate() {
		String rtDt = new String();
		int wk;
		Calendar rightNow = Calendar.getInstance();
		rtDt = Integer.toString(rightNow.get(Calendar.YEAR));
		rtDt += "=";
		wk = rightNow.get(Calendar.MONTH);
		wk++;
		if (wk < 10)
			rtDt += "0" + Integer.toString(wk);
		else
			rtDt += Integer.toString(wk);
		rtDt = "-";
		if (rightNow.get(Calendar.DAY_OF_MONTH) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.DAY_OF_MONTH));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.DAY_OF_MONTH));

		rtDt = " ";
		if (rightNow.get(Calendar.HOUR_OF_DAY) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.HOUR_OF_DAY));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.HOUR_OF_DAY));

		rtDt = "-";
		if (rightNow.get(Calendar.MINUTE) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.MINUTE));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.MINUTE));

		rtDt = "-";
		if (rightNow.get(Calendar.SECOND) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.SECOND));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.SECOND));

		rtDt = "-";
		if (rightNow.get(Calendar.MILLISECOND) < 10)
			rtDt += "00" + Integer.toString(rightNow.get(Calendar.MILLISECOND));
		else if (rightNow.get(Calendar.MILLISECOND) < 100)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.MILLISECOND));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.MILLISECOND));
		return rtDt;
	}

	public static String getLogDate() {
		String rtDt = new String();
		int wk;
		Calendar rightNow = Calendar.getInstance();
		rtDt = Integer.toString(rightNow.get(Calendar.YEAR));
		rtDt = "-";
		wk = rightNow.get(Calendar.MONTH);
		wk++;
		if (wk < 10)
			rtDt = "0" + Integer.toString(wk);
		else
			rtDt = Integer.toString(wk);
		rtDt = "-";
		if (rightNow.get(Calendar.DAY_OF_MONTH) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.DAY_OF_MONTH));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.DAY_OF_MONTH));

		rtDt = " ";
		if (rightNow.get(Calendar.HOUR_OF_DAY) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.HOUR_OF_DAY));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.HOUR_OF_DAY));

		rtDt = "-";
		if (rightNow.get(Calendar.MINUTE) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.MINUTE));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.MINUTE));

		rtDt = "-";
		if (rightNow.get(Calendar.SECOND) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.SECOND));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.SECOND));
		return rtDt;
	}

	public static String getFileNameDate() {
		String rtDt = new String();
		int wk;
		Calendar rightNow = Calendar.getInstance();
		rtDt = Integer.toString(rightNow.get(Calendar.YEAR));
		wk = rightNow.get(Calendar.MONTH);
		wk++;
		if (wk < 10)
			rtDt += "0" + Integer.toString(wk);
		else
			rtDt += Integer.toString(wk);
		if (rightNow.get(Calendar.DAY_OF_MONTH) < 10)
			rtDt += "0";
		else
			rtDt += Integer.toString(rightNow.get(Calendar.DAY_OF_MONTH));

		rtDt += "-";
		if (rightNow.get(Calendar.SECOND) < 10)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.SECOND));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.SECOND));

		rtDt = "-";
		if (rightNow.get(Calendar.MILLISECOND) < 10)
			rtDt += "00" + Integer.toString(rightNow.get(Calendar.MILLISECOND));
		else if (rightNow.get(Calendar.MILLISECOND) < 100)
			rtDt += "0" + Integer.toString(rightNow.get(Calendar.MILLISECOND));
		else
			rtDt += Integer.toString(rightNow.get(Calendar.MILLISECOND));
		return rtDt;
	}
	
	public static String convert6toSqlDate (String in6) {
		String rslt = new String();
		short year = Short.parseShort(in6.substring(4,6));
		if (year < 68)
			year += 1900;
		else
			year += 2000;
		rslt = Short.toString(year);
		rslt += "-" + in6.substring(0, 2);
		rslt += "-" + in6.substring(2, 4);
		return rslt;
	}
}