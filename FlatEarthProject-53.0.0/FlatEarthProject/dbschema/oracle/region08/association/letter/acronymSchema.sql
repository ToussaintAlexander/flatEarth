DROP TABLE ACRONYM_TABLE;

DROP SEQUENCE ACRONYM_TABLE_SEQUENCE;

CREATE TABLE ACRONYM_TABLE 
(
   	 ID           			NUMBER(4)   	NOT NULL 
    ,SEQ           			NUMBER(3)   	NOT NULL 	   
	,ACRONYM				VARCHAR2(5)		NOT NULL
	,FULL_NAME				VARCHAR2(30)	NOT NULL
	,DESCRIPTION			VARCHAR2(40)	NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER			CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
);

ALTER TABLE ACRONYM_TABLE ADD (
  CONSTRAINT ACRONYM_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE ACRONYM_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER ACRONYM_TABLE_TRIGGER 
BEFORE INSERT ON ACRONYM_TABLE 
FOR EACH ROW

BEGIN
  SELECT ACRONYM_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/