elDROP TABLE ELEMENT_TABLE;

DROP SEQUENCE ELEMENT_TABLE_SEQUENCE;

CREATE TABLE ELEMENT_TABLE 
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

ALTER TABLE ELEMENT_TABLE ADD (
  CONSTRAINT ELEMENT_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE ELEMENT_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER ELEMENT_TABLE_TRIGGER 
BEFORE INSERT ON ELEMENT_TABLE 
FOR EACH ROW

BEGIN
  SELECT ELEMENT_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/