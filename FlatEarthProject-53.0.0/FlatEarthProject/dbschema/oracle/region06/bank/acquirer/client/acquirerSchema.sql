DROP TABLE ACQUIRER_TABLE;

DROP SEQUENCE ACQUIRER_TABLE_SEQUENCE;

CREATE TABLE ACQUIRER_TABLE 
(
   	 ID           					NUMBER(4)    	NOT NULL
   	,INTL_BANK_ACCOUNT_NUMBER		VARCHAR2(34)	NOT NULL
   	,BANK_IDENTIFIER_CODE			VARCHAR2(11)	NOT NULL
   	,BANK_IDENTIFICATION_NUMBER		NUMBER(6)		NOT NULL 
  	,NAME							VARCHAR2(30)	NOT NULL
	,STREET							VARCHAR2(30)	NOT NULL
	,CITY							VARCHAR2(30)	NOT NULL
	,STATE							VARCHAR2(30)	NOT NULL
  	,COUNTRY						CHAR(3)			NOT NULL
  	,ZIP_CODE						VARCHAR2(9)		NOT NULL
  	,PHONE_NUMBER					CHAR(10)		NOT NULL
  	,CREATE_USER					CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP				TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER					CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP				TIMESTAMP(4)	NOT NULL
);

ALTER TABLE ACQUIRER_TABLE ADD (
  CONSTRAINT ACQUIRER_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE ACQUIRER_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER ACQUIRER_TABLE_TRIGGER 
BEFORE INSERT ON ACQUIRER_TABLE 
FOR EACH ROW

BEGIN
  SELECT ACQUIRER_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/