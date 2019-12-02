DROP TABLE REQUIREMENT_TABLE;

DROP SEQUENCE REQUIREMENT_TBL_SEQUENCE;

CREATE TABLE REQUIREMENT_TABLE
(
   	 ID           		NUMBER(4)  		NOT NULL  
	,ELEMENT_NUMBER		VARCHAR2(3)		NOT NULL	 
	,ELEMENT_NAME		VARCHAR2(30)	NOT NULL	 
	,REQUIRED			NUMBER(1)		NOT NULL
	,TYPE_FIELD			VARCHAR2(30)	NOT NULL	
	,LENGTH_FIELD		NUMBER(3)		NOT NULL	
	,VALUE_FIELD		NUMBER(3)		NOT NULL
  	,CREATE_USER		CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP	TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER		CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP	TIMESTAMP(4)	NOT NULL		 
);

ALTER TABLE REQUIREMENT_TABLE ADD (
  CONSTRAINT REQUIREMENT_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE REQUIREMENT_TBL_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER REQUIREMENT_TABLE_TRIGGER 
BEFORE INSERT ON REQUIREMENT_TABLE 
FOR EACH ROW

BEGIN
  SELECT REQUIREMENT_TBL_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/