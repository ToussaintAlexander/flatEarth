package com.system.message.utilties;

/***********************************************************************************************
 PRIMARY ACCOUNT NUMBER
													
ID_INDEX 		= 0;	ROW 1=ID			0				1				2
TAG_INDEX 		= 1;	ROW 2=TAG			BIN				PAN				CHECK DIGIT
FORMAT_INDEX	= 2;	ROW 3=FORMAT		FIXED			FIXED			FIXED
LENGTH_INDEX 	= 2;	ROW 3=LENGTH		6				9				1
ENCODING_INDEX 	= 3;	ROW 4=ENCODING		ASCII			ASCII			ASCII
DATA_TYPE_INDEX	= 4;	ROW 5=DATA TYPE		NUMBER			NUMBER			NUMBER
VALUE_INDEX		= 5;	ROW 6=VALUE			450125			000000000		5
************************************************************************************************
*/
public class Storage {

	private int id;
	private String tag;
	private int format;
	private int length;
	private int  encoding;
	private int  dataType;
	private String value;
	
	public Storage(int id, String tag, int format, int length, int encoding, int dataType, String value) {
		super();
		this.id = id;
		this.tag = tag;
		this.format = format;
		this.length = length;
		this.encoding = encoding;
		this.dataType = dataType;
		this.value = value;
	}
	
	public Storage() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getEncoding() {
		return encoding;
	}

	public void setEncoding(int encoding) {
		this.encoding = encoding;
	}

	public int getDataType() {
		return dataType;
	}

	public void setDataType(int dataType) {
		this.dataType = dataType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
