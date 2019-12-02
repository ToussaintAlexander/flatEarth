DROP TABLE INVOICE_PART3_TABLE;

DROP SEQUENCE INVOICE_PART3_TABLE_SEQUENCE;

CREATE TABLE INVOICE_PART3_TABLE 
(
   	 ID           			NUMBER(4)    	NOT NULL
	,CODE					NUMBER(4)    	NOT NULL
	,CATEGORY				NUMBER(4)    	NOT NULL
	,SEQ					NUMBER(2)    	NOT NULL
	,PRODUCT_NAME			VARCHAR2(30)   	NOT NULL
	,DESCRIPTION			VARCHAR2(30)   	NOT NULL
	,SEASON					VARCHAR2(7)		NOT NULL
	,GENDER					VARCHAR2(7)   	NOT NULL
	,FREQUENCY				NUMBER(1)    	NOT NULL			
	,SUPPLIER				NUMBER(4)    	NOT NULL
	,UNITS_IN_STOCK_SIZE	NUMBER(4)    	NOT NULL
	,UNIT_SIZE				NUMBER(4)    	NOT NULL
	,UNIT_PRICE				NUMBER(6)    	NOT NULL
	,UNIT_WEIGHT			NUMBER(4)    	NOT NULL
	,DISCOUNT				NUMBER(2)    	NOT NULL
	,PICTURE				NUMBER(4)    	NOT NULL
	,NOTES					VARCHAR2(30)   	NOT NULL
  	,CREATE_USER			CHAR(8)			NOT NULL	 
  	,CREATE_TIMESTAMP		TIMESTAMP(4)	NOT NULL	 
  	,MODIFY_USER			CHAR(8)			NOT NULL	 
  	,MODIFY_TIMESTAMP		TIMESTAMP(4)	NOT NULL	
);

ALTER TABLE INVOICE_PART3_TABLE ADD (
  CONSTRAINT INVOICE_PART3_TABLE_PK PRIMARY KEY (ID));

CREATE SEQUENCE INVOICE_PART3_TABLE_SEQUENCE START WITH 1;

CREATE OR REPLACE TRIGGER INVOICE_PART3_TABLE_TRIGGER 
BEFORE INSERT ON INVOICE_PART3_TABLE 
FOR EACH ROW

BEGIN
  SELECT INVOICE_PART3_TABLE_SEQUENCE.NEXTVAL
  INTO   :NEW.ID
  FROM   DUAL;
END;
/