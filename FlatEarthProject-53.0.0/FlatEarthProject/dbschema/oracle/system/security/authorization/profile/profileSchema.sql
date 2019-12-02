DROP TABLE PROFILE_TABLE;

DROP SEQUENCE PROFILE_TABLE_SEQUENCE;

CREATE TABLE PROFILE_TABLE 
(
   	 ID           			NUMBER(4)    	NOT NULL
  	,GROUP_ID				NUMBER(3)    	NOT NULL
	,USER_ID				NUMBER(3)    	NOT NULL
	,SEQ					NUMBER(2)    	NOT NULL
	,MENU_NAME				VARCHAR2(30)    NOT NULL
	,SCREEN_NAME			VARCHAR2(30)    NOT NULL
	,FIELD_NAME				VARCHAR2(30)    NOT NULL
  	,PROFILE_STATUS			NUMBER(1)    	NOT NULL
  	,MENU_STATUS			NUMBER(1)    	NOT NULL
  	,VIEW_JSP				VARCHAR2(30)    NOT NULL
  	,SCREEN_STATUS			NUMBER(1)    	NOT NULL
  	,CONTROLLER_BEAN		VARCHAR2(30)    NOT NULL
  	,CREATE_STATUS			NUMBER(1)    	NOT NULL
  	,READ_STATUS			NUMBER(1)    	NOT NULL
  	,UPDATE_STATUS			NUMBER(1)    	NOT NULL
  	,DELETE_STATUS			NUMBER(1)    	NOT NULL
  	,FIELD_VISIBLE			NUMBER(1)    	NOT NULL
  	,FIELD_EDITABLE			NUMBER(1)    	NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL
  	,MODIFY_USER			CHAR(8)			NOT NULL
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL
);

ALTER TABLE PROFILE_TABLE ADD (
  CONSTRAINT PROFILE_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE PROFILE_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER PROFILE_TABLE_TRIGGER 
BEFORE INSERT ON PROFILE_TABLE 
FOR EACH ROW

BEGIN
  SELECT PROFILE_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/