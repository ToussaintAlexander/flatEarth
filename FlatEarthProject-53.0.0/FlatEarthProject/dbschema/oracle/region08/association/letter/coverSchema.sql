DROP TABLE COVER_TABLE;

DROP SEQUENCE COVER_TABLE_SEQUENCE;

CREATE TABLE COVER_TABLE 
(
   	 ID           			NUMBER(4)   	NOT NULL 	   
	,TITLE					VARCHAR2(30)	NOT NULL
	,SUBTITLE				VARCHAR2(30)	NOT NULL
	,EFFECTIVE_DATE			DATE			NOT NULL
	,MAJOR_VERSION			NUMBER(2)		NOT NULL
	,MINOR_VERSION			NUMBER(2)		NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER			CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
);

ALTER TABLE COVER_TABLE ADD (
  CONSTRAINT COVER_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE COVER_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER COVER_TABLE_TRIGGER 
BEFORE INSERT ON COVER_TABLE 
FOR EACH ROW

BEGIN
  SELECT COVER_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/