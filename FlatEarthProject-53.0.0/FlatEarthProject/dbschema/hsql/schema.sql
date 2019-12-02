drop table T_CUSTOMER if exists;
drop table T_PAYMENT if exists;
drop table T_PRODUCT if exists;
drop table T_INVOICE if exists;

create table T_CUSTOMER (CUSTOMER_ID integer identity primary key,FIRST_NAME varchar(20) not null,LAST_NAME varchar(30) not null,STREET varchar(30) not null,CITY varchar(30) not null,STATE varchar(30) not null,ZIP_CODE	varchar(05) not null,COUNTRY varchar(30) not null,EMAIL	varchar(30) not null);
create table T_PRODUCT  (PRODUCT_ID integer identity primary key,DESCRIPTION varchar(30) not null, PRICE float not null);
create table T_PAYMENT  (PAYMENT_ID integer identity primary key, CARD_NUMBER double not null,SECURITY_CODE integer not null,EXPIRATION_DATE Timestamp not null, AMOUNT float not null);
create table T_INVOICE  (ORDER_ID integer identity primary key,CUSTOMER_ID integer not null,PRODUCT_ID integer not null,PAYMENT_ID integer not null,QUANTITY integer not null,DELIVERY_TYPE varchar(30) not null,TERMS varchar(30) not null,CONTACT	char(1)	not null);

