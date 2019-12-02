package com.system.message.base.rule.detail;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

public class DataElementRuleDetailField {

	private int 			id;		
	private int 			field;			 
	private int 			subField;
	
	private boolean			fire;
	private int 			type;		
	private int 			group;
	
	private BinLevel		bLevel;
	private AcctLevel		aLevel;
	private TransLevel 		tLevel;
	
	private int 			sequence;
	private int 			pointer;	
	private int 			value;
	
	private String			createUser;
	private Timestamp		createTimestamp;
	private String			modifyUser;
	private Timestamp		modifyTimestamp;
	
	public DataElementRuleDetailField () {}

	public DataElementRuleDetailField(int id, int field, int subField, boolean fire, int type, int group,
			BinLevel bLevel, AcctLevel aLevel, TransLevel tLevel, int sequence, int pointer, int value,
			String createUser, Timestamp createTimestamp, String modifyUser, Timestamp modifyTimestamp) {
		super();
		this.id = id;
		this.field = field;
		this.subField = subField;
		this.fire = fire;
		this.type = type;
		this.group = group;
		this.bLevel = bLevel;
		this.aLevel = aLevel;
		this.tLevel = tLevel;
		this.sequence = sequence;
		this.pointer = pointer;
		this.value = value;
		this.createUser = createUser;
		this.createTimestamp = createTimestamp;
		this.modifyUser = modifyUser;
		this.modifyTimestamp = modifyTimestamp;
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

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		this.fire = fire;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public BinLevel getbLevel() {
		return bLevel;
	}

	public void setbLevel(BinLevel bLevel) {
		this.bLevel = bLevel;
	}

	public AcctLevel getaLevel() {
		return aLevel;
	}

	public void setaLevel(AcctLevel aLevel) {
		this.aLevel = aLevel;
	}

	public TransLevel gettLevel() {
		return tLevel;
	}

	public void settLevel(TransLevel tLevel) {
		this.tLevel = tLevel;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public int getPointer() {
		return pointer;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public Timestamp getModifyTimestamp() {
		return modifyTimestamp;
	}

	public void setModifyTimestamp(Timestamp modifyTimestamp) {
		this.modifyTimestamp = modifyTimestamp;
	}

}
