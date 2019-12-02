DROP TABLE PROCESSOR_IMPACT_TABLE;

DROP SEQUENCE PROCESSOR_IMPACT_TBL_SEQUENCE;

CREATE TABLE PROCESSOR_IMPACT_TABLE
(
  	 ID           			NUMBER(4)  		NOT NULL  
	,EFFECTIVE_DATE			DATE			NOT NULL
	,MAJOR_VERSION			NUMBER(2)		NOT NULL
	,MINOR_VERSION			NUMBER(2)		NOT NULL
	,SECTION				NUMBER(2)		NOT NULL
	,SUBSECTION				NUMBER(2)		NOT NULL
	,PARAGRAPH				NUMBER(2)		NOT NULL
	,PROCESSOR				VARCHAR2(30)	NOT NULL	
	,IMPACT					NUMBER(1)		NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER			CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
);

ALTER TABLE PROCESSOR_IMPACT_TABLE ADD (
  CONSTRAINT PROCESSOR_IMPACT_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE PROCESSOR_IMPACT_TBL_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER PROCESSOR_IMPACT_TBL_TRIGGER 
BEFORE INSERT ON PROCESSOR_IMPACT_TABLE 
FOR EACH ROW

BEGIN
  SELECT PROCESSOR_IMPACT_TBL_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/