DROP TABLE RULE_HEADER_TABLE;

DROP SEQUENCE RULE_HEADER_TABLE_SEQUENCE;

CREATE TABLE RULE_HEADER_TABLE 
(
   	 ID           		NUMBER(4)    	NOT NULL
  	,FIELD				NUMBER(3)    	NOT NULL
	,SUBFIELD			NUMBER(2)    	NOT NULL
	,FIRE				NUMBER(1)    	NOT NULL
	,FORMAT				NUMBER(1)    	NOT NULL
	,MINIMUM_LENGTH		NUMBER(3)    	NOT NULL
	,MAXIMUM_LENGTH		NUMBER(3)    	NOT NULL
  	,ENCODING			NUMBER(2)    	NOT NULL
  	,DATATYPE			NUMBER(2)    	NOT NULL
  	,SOURCE				NUMBER(2)    	NOT NULL
  	,DIRECTION			NUMBER(2)    	NOT NULL
  	,EXISTENCE			NUMBER(2)    	NOT NULL
  	,CHANGE				NUMBER(2)    	NOT NULL
  	,CREATE_USER		CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP	TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER		CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP	TIMESTAMP(4)	NOT NULL		 
);

ALTER TABLE RULE_HEADER_TABLE ADD (
  CONSTRAINT RULE_HEADER_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE RULE_HEADER_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER RULE_HEADER_TABLE_TRIGGER 
BEFORE INSERT ON RULE_HEADER_TABLE 
FOR EACH ROW

BEGIN
  SELECT RULE_HEADER_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/