DROP TABLE SUBSECTION_TABLE;

DROP SEQUENCE SUBSECTION_SEQUENCE;

CREATE TABLE SUBSECTION_TABLE
(
  	 ID           		NUMBER(4)  		NOT NULL  
	,TITLE				VARCHAR2(50)	NOT NULL	
	,EFFECTIVE_DATE		DATE			NOT NULL
	,MAJOR_VERSION		NUMBER(2)		NOT NULL
	,MINOR_VERSION		NUMBER(2)		NOT NULL
	,SECTION			NUMBER(2)		NOT NULL
	,SUBSECTION			NUMBER(2)		NOT NULL
  	,CREATE_USER		CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP	TIMESTAMP(4)	NOT NULL	  
  	,MODIFY_USER		CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP	TIMESTAMP(4)	NOT NULL	 	 
);

ALTER TABLE SUBSECTION_TABLE ADD (
  CONSTRAINT SUBSECTION_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE SUBSECTION_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER SUBSECTION_TABLE_TRIGGER 
BEFORE INSERT ON SUBSECTION_TABLE 
FOR EACH ROW

BEGIN
  SELECT SUBSECTION_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/