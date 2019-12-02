package com.system.message.rule.detail;

import static com.system.configuration.constants.Element.*;

import java.sql.Timestamp;

import com.system.message.base.network.AcctLevel;
import com.system.message.base.network.BinLevel;
import com.system.message.base.network.TransLevel;

import static com.system.configuration.constants.Network.*;

public abstract interface DE041RuleDetail {

	public static final int NUMBER_OF_DE041_FIELDS	                    							= 1;
	
	public static final int CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_INDEX							= 0;
	
	/***************************************************************
	 ***************************************************************
	 */
	
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_ID		= 41000;
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_FIELD		= 41;
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_SUBFIELD	= 0;
	
	public static final boolean		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_FIRE		= RULE_NOT_FIRED_B;
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_TYPE		= UNASSIGNED_RULE_TYPE;
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_GROUP		= UNASSIGNED_RULE_GROUP;

	public static final BinLevel	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_BL		= BIN_LEVEL_CONSTANT;
	public static final AcctLevel	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_AL		= ACCOUNT_LEVEL_CONSTANT;
	public static final TransLevel	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_TL		= TRANSACTION_LEVEL_CONSTANT;
	
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_SEQUENCE	= 10;
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_POINTER	= EXACT_RULE_ROUTINE;
	public static final int 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_VALUE		= 30;
	
	public static final String 		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_CU		= CREATE_USER;
	public static final Timestamp	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_CT		= CREATE_TIMESTAMP;
	public static final String		CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_MU		= MODIFY_USER;
	public static final Timestamp	CARD_ACCEPTOR_TERMINAL_IDENTIFICATION_041_RULE_DETAIL_MT		= MODIFY_TIMESTAMP;
	
}
