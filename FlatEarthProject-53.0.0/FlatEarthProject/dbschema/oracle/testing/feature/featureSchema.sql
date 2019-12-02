DROP TABLE FEATURE_TABLE;

DROP SEQUENCE FEATURE_TABLE_SEQUENCE;

CREATE TABLE FEATURE_TABLE 
(
   	 ID           			NUMBER(4)    	NOT NULL
   	,UNKNOWN_PARAMETER		VARCHAR2(8)		NOT NULL
   	,INDEPENDENT_VARIABLE	VARCHAR2(8)		NOT NULL
   	,DEPENDENT_VARIABLE		VARCHAR2(8)		NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER			CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL
);

ALTER TABLE FEATURE_TABLE ADD (
  CONSTRAINT FEATURE_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE FEATURE_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER FEATURE_TABLE_TRIGGER 
BEFORE INSERT ON FEATURE_TABLE 
FOR EACH ROW

BEGIN
  SELECT FEATURE_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/