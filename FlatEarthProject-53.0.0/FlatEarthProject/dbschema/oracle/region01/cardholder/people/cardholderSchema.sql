DROP TABLE CARDHOLDER_TABLE;

DROP SEQUENCE CARDHOLDER_TABLE_SEQUENCE;

CREATE TABLE CARDHOLDER_TABLE 
(
   	 ID           		NUMBER(4)    	NOT NULL
  	,FIRST_NAME			VARCHAR2(30)	NOT NULL
  	,MIDDLE_NAME		VARCHAR2(30)	NOT NULL
  	,LAST_NAME			VARCHAR2(30)	NOT NULL
  	,SOCIAL_SECURITY	CHAR(9)			NOT NULL
	,COMPANY			VARCHAR2(30)	NOT NULL
	,DEPARTMENT			VARCHAR2(30)	NOT NULL
	,TITLE				VARCHAR2(30)	NOT NULL
	,SALARY				NUMBER(12)		NOT NULL
	,AGE				NUMBER(3)		NOT NULL
	,MARITAL_STATUS		CHAR(1)			NOT NULL
	,DATE_OF_BIRTH		DATE			NOT NULL
	,EDUCATION			VARCHAR2(30)	NOT NULL
	,INTERESTS			VARCHAR2(30)	NOT NULL
	,USER_NAME			CHAR(8)			NOT NULL
	,USER_ID			CHAR(7)			NOT NULL
	,SECRET				VARCHAR2(30)	NOT NULL
	,CLEARTEXT_PIN		NUMBER(4)		NOT NULL
   	,CREATE_USER		CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP	TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER		CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP	TIMESTAMP(4)	NOT NULL	
);

ALTER TABLE CARDHOLDER_TABLE ADD (
  CONSTRAINT CARDHOLDER_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE CARDHOLDER_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER CARDHOLDER_TABLE_TRIGGER 
BEFORE INSERT ON CARDHOLDER_TABLE 
FOR EACH ROW

BEGIN
  SELECT CARDHOLDER_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/