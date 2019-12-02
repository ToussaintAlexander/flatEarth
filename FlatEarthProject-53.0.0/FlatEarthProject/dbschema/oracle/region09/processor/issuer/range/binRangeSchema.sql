DROP TABLE BIN_LEVEL_TABLE;

DROP SEQUENCE BIN_LEVEL_TABLE_SEQUENCE;

CREATE TABLE BIN_LEVEL_TABLE 
(
   	 ID           				NUMBER(4)    	NOT NULL
  	,LOW_BIN_LEVEL_NUMBER		VARCHAR2(19)	NOT NULL
  	,HIGH_BIN_LEVEL_NUMBER		VARCHAR2(19)	NOT NULL
  	,BIN_LENGTH					NUMBER(2)		NOT NULL
  	,ACCOUNT_NUMBER_LENGTH		NUMBER(2)		NOT NULL
  	,CARD_TYPE					VARCHAR2(30)	NOT NULL
  	,CARD_SUBTYPE				VARCHAR2(30)	NOT NULL
	,PRODUCT_GROUP				VARCHAR2(30)	NOT NULL
	,PRODUCT_TYPE				VARCHAR2(30)	NOT NULL
	,COUNTRY_CODE				CHAR(3)			NOT NULL
	,CURRENCY_CODE				CHAR(3)			NOT NULL
	,ATM_OVERDRAFT_SWITCH		NUMBER(1)		NOT NULL
	,POS_OVERDRAFT_SWITCH		NUMBER(1)		NOT NULL
	,CHECKING_SWITCH			NUMBER(1)		NOT NULL
	,SAVINGS_SWITCH				NUMBER(1)		NOT NULL
	,RANGE_LEVEL_ALL			CHAR(7)			NOT NULL
	,PARTIAL_AUTHORIZATION		NUMBER(1)		NOT NULL
	,DERVIATION_TYPE			VARCHAR2(30)	NOT NULL
	,EXPIRATION_DATE			DATE			NOT NULL
	,PRODUCTION_DATE			DATE			NOT NULL
	,CERTIFICATION_DATE			DATE			NOT NULL
  	,CREATE_USER				CHAR(8)			NOT NULL
  	,CREATE_TIMESTAMP			TIMESTAMP(4)	NOT NULL
  	,MODIFY_USER				CHAR(8)			NOT NULL
  	,MODIFY_TIMESTAMP			TIMESTAMP(4)	NOT NULL
);

ALTER TABLE BIN_LEVEL_TABLE ADD (
  CONSTRAINT BIN_LEVEL_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE BIN_LEVEL_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER BIN_LEVEL_TABLE_TRIGGER 
BEFORE INSERT ON BIN_LEVEL_TABLE 
FOR EACH ROW

BEGIN
  SELECT BIN_LEVEL_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/