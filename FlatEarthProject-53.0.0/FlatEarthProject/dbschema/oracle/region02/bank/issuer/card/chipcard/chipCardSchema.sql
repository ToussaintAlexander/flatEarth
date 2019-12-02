DROP TABLE CHIP_CARD_TABLE;

DROP SEQUENCE CHIP_CARD_TABLE_SEQUENCE;

CREATE TABLE CHIP_CARD_TABLE 
(
   	 ID           					NUMBER(4)    	NOT NULL
   	,PRIMARY_ACCOUNT_NUMBER			VARCHAR2(19)	NOT NULL
   	,PRIMARY_ACCOUNT_NUMBER_SEQ		NUMBER(2)		NOT NULL   	
   	,ASSOCIATION_NAME				VARCHAR2(30)	NOT NULL
   	,BANK_NAME						VARCHAR2(30)	NOT NULL
   	,BRAND_NAME						VARCHAR2(30)	NOT NULL   	
   	,CARDHOLDER_FIRST_NAME			VARCHAR2(30)	NOT NULL	 
   	,CARDHOLDER_MIDDLE_NAME			VARCHAR2(30)	NOT NULL	 
   	,CARDHOLDER_LAST_NAME			VARCHAR2(30)	NOT NULL   	
	,CARD_EXPIRATION_DATE			DATE			NOT NULL					 
	,CARD_VERIFICATION_VALUE		NUMBER(3)		NOT NULL
  	,CREATE_USER					CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP				TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER					CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP				TIMESTAMP(4)	NOT NULL	
);

ALTER TABLE CHIP_CARD_TABLE ADD (
  CONSTRAINT CHIP_CARD_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE CHIP_CARD_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER CHIP_CARD_TABLE_TRIGGER 
BEFORE INSERT ON CHIP_CARD_TABLE 
FOR EACH ROW

BEGIN
  SELECT CHIP_CARD_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/