DROP TABLE ELEMENT_EDITOR_TABLE;

DROP SEQUENCE ELEMENT_EDITOR_TABLE_SEQ;

CREATE TABLE ELEMENT_EDITOR_TABLE 
(
   	 ID           		NUMBER(4)    	NOT NULL
  	,FIELD				NUMBER(3)    	NOT NULL
	,SUBFIELD			NUMBER(2)    	NOT NULL
	,FORMAT				NUMBER(2)    	NOT NULL
	,LENGTH				NUMBER(3)    	NOT NULL
  	,ENCODING			NUMBER(2)    	NOT NULL
  	,DATATYPE			NUMBER(2)    	NOT NULL
  	,SOURCE				NUMBER(2)    	NOT NULL
  	,DIRECTION			NUMBER(2)    	NOT NULL
  	,EXISTENCE			NUMBER(2)    	NOT NULL
  	,CHANGE				NUMBER(2)    	NOT NULL
  	,FIELD_VALUE		VARCHAR2(35)    NOT NULL
  	,CREATE_USER		CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP	TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER		CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP	TIMESTAMP(4)	NOT NULL	
);

ALTER TABLE ELEMENT_EDITOR_TABLE ADD (
  CONSTRAINT ELEMENT_EDITOR_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE ELEMENT_EDITOR_TABLE_SEQ START WITH 1;

CREATE OR REPLACE TRIGGER ELEMENT_EDITOR_TABLE_TRIG 
BEFORE INSERT ON ELEMENT_EDITOR_TABLE 
FOR EACH ROW

BEGIN
  SELECT ELEMENT_EDITOR_TABLE_SEQ.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/