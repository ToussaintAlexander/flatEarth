package com.system.message.base.rule;

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

public class DataElementRuleField {

	private int 			id;				 
	private int 			field;			 
	private int 			subField;	
	
	private boolean			fire;
	
	private int 			format;
	private int 			minumumLength;	
	private int 			maxumumLength;			 
	 
	private int  			encoding;		 
	private int  			dataType;		 
	
	private int 			source;			 
	private int 			direction;	
	private int 			existence;
	private int				change;
	
	public DataElementRuleField () {}

	public DataElementRuleField(int id, int field, int subField, boolean fire, int format, int minumumLength,
			int maxumumLength, int encoding, int dataType, int source, int direction, int existence, int change) {
		super();
		this.id = id;
		this.field = field;
		this.subField = subField;
		this.fire = fire;
		this.format = format;
		this.minumumLength = minumumLength;
		this.maxumumLength = maxumumLength;
		this.encoding = encoding;
		this.dataType = dataType;
		this.source = source;
		this.direction = direction;
		this.existence = existence;
		this.change = change;
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

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		this.fire = fire;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public int getMinumumLength() {
		return minumumLength;
	}

	public void setMinumumLength(int minumumLength) {
		this.minumumLength = minumumLength;
	}

	public int getMaxumumLength() {
		return maxumumLength;
	}

	public void setMaxumumLength(int maxumumLength) {
		this.maxumumLength = maxumumLength;
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

}
