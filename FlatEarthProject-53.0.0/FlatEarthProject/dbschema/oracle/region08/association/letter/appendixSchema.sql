DROP TABLE APPENDIX_TABLE;

DROP SEQUENCE APPENDIX_TABLE_SEQUENCE;

CREATE TABLE APPENDIX_TABLE  
(
   	 ID           			NUMBER(4)		NOT NULL  
   	,SEQ					NUMBER(4)		NOT NULL
    ,ACRONYM				NUMBER(2)		NOT NULL
    ,RELATED_DOCUMENT		NUMBER(2)		NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER			CHAR(8)			NOT NULL		 
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL
);

ALTER TABLE APPENDIX_TABLE ADD (
  CONSTRAINT APPENDIX_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE APPENDIX_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER APPENDIX_TABLE_TRIGGER 
BEFORE INSERT ON APPENDIX_TABLE 
FOR EACH ROW

BEGIN
  SELECT APPENDIX_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/