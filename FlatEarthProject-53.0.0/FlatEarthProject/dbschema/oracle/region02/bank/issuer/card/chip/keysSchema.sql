DROP TABLE KEYS_TABLE;

DROP SEQUENCE KEYS_TABLE_SEQUENCE;

CREATE TABLE KEYS_TABLE 
(
   	 ID           						NUMBER(4)    	NOT NULL
   	,PRIMARY_ACCOUNT_NUMBER				VARCHAR2(19)	NOT NULL
   	,PRIMARY_ACCOUNT_NUMBER_SEQ			NUMBER(2)		NOT NULL
   	,PIN_ENCIPHER_PUBLIC_KEY_CERT		NUMBER(1)		NOT NULL
   	,PIN_ENCIPHER_PUBLIC_KEY_EXP		NUMBER(1)		NOT NULL
   	,PIN_ENCIPHER_PUBLIC_KEY_REMAIN		NUMBER(1)		NOT NULL
   	,PUBLIC_KEY_CERTIFICATE				VARCHAR2(176)	NOT NULL
   	,PUBLIC_KEY_INDEX					NUMBER(1)		NOT NULL
   	,PUBLIC_KEY_EXPONENT				NUMBER(1)		NOT NULL
   	,PUBLIC_KEY_REMAINDER				NUMBER(1)		NOT NULL
   	,DYNAMIC_NUMBER						NUMBER(1)		NOT NULL
  	,CREATE_USER						CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP					TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER						CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP					TIMESTAMP(4)	NOT NULL	
);

ALTER TABLE KEYS_TABLE ADD (
  CONSTRAINT KEYS_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE KEYS_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER KEYS_TABLE_TRIGGER 
BEFORE INSERT ON KEYS_TABLE 
FOR EACH ROW

BEGIN
  SELECT KEYS_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/