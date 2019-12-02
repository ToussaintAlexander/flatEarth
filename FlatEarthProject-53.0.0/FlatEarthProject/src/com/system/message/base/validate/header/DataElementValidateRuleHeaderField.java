package com.system.message.base.validate.header;

public class DataElementValidateRuleHeaderField {

	private int		id;				 
	private int 	field;			 
	private int 	subField;		
	
	private int		fire;	
	
	private int 	format;				 		
	private int 	minimumLength;	
	private int 	maximumLength;	
	private int  	encoding;			 			
	private int  	dataType;			 	
	
	private int 	source;				 
	private int 	direction;		
	private int		existence;			 
	private int 	change;	

	public DataElementValidateRuleHeaderField() {}

	public DataElementValidateRuleHeaderField(int id, int field, int subField, int fire, int format, int minimumLength,
			int maximumLength, int encoding, int dataType, int source, int direction, int existence, int change) {
		super();
		this.id = id;
		this.field = field;
		this.subField = subField;
		this.fire = fire;
		this.format = format;
		this.minimumLength = minimumLength;
		this.maximumLength = maximumLength;
		this.encoding = encoding;
		this.dataType = dataType;
		this.source = source;
		this.direction = direction;
		this.existence = existence;
		this.change = change;
	}
	/**********************************************************************
	 **********************************************************************
	 */
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

	public int getFire() {
		return fire;
	}

	public void setFire(int fire) {
		this.fire = fire;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public int getMinimumLength() {
		return minimumLength;
	}

	public void setMinimumLength(int minimumLength) {
		this.minimumLength = minimumLength;
	}

	public int getMaximumLength() {
		return maximumLength;
	}

	public void setMaximumLength(int maximumLength) {
		this.maximumLength = maximumLength;
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
