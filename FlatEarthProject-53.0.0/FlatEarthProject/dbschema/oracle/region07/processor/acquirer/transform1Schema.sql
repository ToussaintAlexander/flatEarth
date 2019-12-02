DROP TABLE TRANSFORM1_TABLE;

DROP SEQUENCE TRANSFORM1_TABLE_SEQUENCE;

CREATE TABLE TRANSFORM1_TABLE 
(
   	 ID           		NUMBER(4)    	NOT NULL
  	,NAME				VARCHAR2(30)	NOT NULL
	,STREET				VARCHAR2(30)	NOT NULL
	,CITY				VARCHAR2(30)	NOT NULL
	,STATE				CHAR(2)			NOT NULL
  	,COUNTRY			CHAR(3)			NOT NULL
  	,ZIP_CODE			VARCHAR2(9)		NOT NULL
  	,PHONE_NUMBER		CHAR(10)		NOT NULL
  	,CREATE_USER		CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP	TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER		CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP	TIMESTAMP(4)	NOT NULL	
);

ALTER TABLE TRANSFORM1_TABLE ADD (
  CONSTRAINT TRANSFORM1_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE TRANSFORM1_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER TRANSFORM1_TABLE_TRIGGER 
BEFORE INSERT ON TRANSFORM1_TABLE 
FOR EACH ROW

BEGIN
  SELECT TRANSFORM1_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/