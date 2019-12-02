package com.system.message.base.element;

/***********************************************************************************************************************
 *  Source						Direction							Existence							Change						 
 *  
 *  0	Cardholder				0	Cardholder 	->	Merchant		1   Mandatory					1	Element Fixed	
 *  1	Merchant				1	Merchant	->	Acquirer 		2	Mandatory Echo				2   Element Added			
 *  2	Acquirer Processor		2	Acquirer	->	Association		3	Conditional					3   Element Removed
 *  3	Association				3	Association	->	Issuer			4	Prohibited					4   Element Change	 
 *  4	Issuer Processor		4	Issuer		->	Client										 
 *  5	Client Bank				5	Client		->	Issuer										 						
 *  6	Issuer Processor		6	Issuer 		->	Association									 							
 *  7	Association				7   Association	->	Acquirer									 
 *  8 	Acquirer				8	Acquirer	->	Merchant
 *  9	Merchant				9	Merchant	->	Cardholder
 ***********************************************************************************************************************
 */

public class DataElementField {

	private int 			id;				 
	private int 			field;			 
	private int 			subField;		 
	
	private	int				format;
	private int 			length;			 
	 
	private int  			encoding;		 
	private int  			dataType;		 
	
	private int 			source;			 
	private int 			direction;	
	private int 			existence;
	private int				change;
	
	private String 			value;
	
	public DataElementField () {}

	public DataElementField(int id, int field, int subField, int format, int length, int encoding, int dataType,
			int source, int direction, int existence, int change, String value) {
		super();
		this.id = id;
		this.field = field;
		this.subField = subField;
		this.format = format;
		this.length = length;
		this.encoding = encoding;
		this.dataType = dataType;
		this.source = source;
		this.direction = direction;
		this.existence = existence;
		this.change = change;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getField() {
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}

	public int getSubField() {
		return subField;
	}

	public void setSubField(int subField) {
		this.subField = subField;
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

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getExistence() {
		return existence;
	}

	public void setExistence(int existence) {
		this.existence = existence;
	}

	public int getChange() {
		return change;
	}

	public void setChange(int change) {
		this.change = change;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
