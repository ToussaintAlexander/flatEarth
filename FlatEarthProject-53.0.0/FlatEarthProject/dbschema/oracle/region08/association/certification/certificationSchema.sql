DROP TABLE CERTIFICATION_TABLE;

DROP SEQUENCE CERTIFICATION_TABLE_SEQUENCE;

CREATE TABLE CERTIFICATION_TABLE 
(
   	 ID           			NUMBER(4)   	NOT NULL 
	,PROCESSOR_NAME			VARCHAR2(30)	NOT NULL
	,PROCESSOR_NUMBER		NUMBER(4)		NOT NULL
	,PROJECT_MANAGER		VARCHAR2(30)	NOT NULL
	,TELEPHONE_NUMBER1		CHAR(10)		NOT NULL
	,EMAIL_ADDRESS1			VARCHAR2(30)	NOT NULL
	,PROCESSOR_TESTER		VARCHAR2(30)	NOT NULL
	,TELEPHONE_NUMBER2		CHAR(10)		NOT NULL
	,EMAIL_ADDRESS2			VARCHAR2(30)	NOT NULL
	,TEST_DATES1			DATE			NOT NULL
	,TEST_TIME1				TIMESTAMP(4)	NOT NULL
	,TEST_DATES2			DATE			NOT NULL
	,TEST_TIME2				TIMESTAMP(4)	NOT NULL
	,TEST_DATES3			DATE			NOT NULL
	,TEST_TIME3				TIMESTAMP(4)	NOT NULL
	,NEW_PROCESSOR			NUMBER(1)		NOT NULL
	,PROCESSOR_UPGRADE		NUMBER(1)		NOT NULL
	,DISASTER_RECOVERY		NUMBER(1)		NOT NULL
	,CONNECTIVITY_ONLY		NUMBER(1)		NOT NULL
	,KEY_ENCRYPTION_KEY		NUMBER(1)		NOT NULL
	,FRAUD_SYSTEM			NUMBER(1)		NOT NULL
	,CVV1					NUMBER(1)		NOT NULL
	,CVV2					NUMBER(1)		NOT NULL
	,ICVV					NUMBER(1)		NOT NULL
	,DCVV					NUMBER(1)		NOT NULL
	,PIN_VALIDATION			NUMBER(1)		NOT NULL
	,PINLESS_BILL_PAY		NUMBER(1)		NOT NULL
	,ECOMMERCE_SUPPORTED	NUMBER(1)		NOT NULL
	,ACCOUNT_TO_ACCOUNT		NUMBER(1)		NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER			CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
);

ALTER TABLE CERTIFICATION_TABLE ADD (
  CONSTRAINT CERTIFICATION_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE CERTIFICATION_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER CERTIFICATION_TABLE_TRIGGER 
BEFORE INSERT ON CERTIFICATION_TABLE 
FOR EACH ROW

BEGIN
  SELECT CERTIFICATION_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/