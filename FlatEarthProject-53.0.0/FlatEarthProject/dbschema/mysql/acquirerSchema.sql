Creating Auto Increment on Primary Key ID
=========================================

Table definition:
=================
CREATE TABLE TEST.ACQUIRER_TABLE (
   	 ID           		INT 			NOT NULL AUTO_INCREMENT
  	,NAME				VARCHAR(20)		NOT NULL
  	,STREET				VARCHAR(20)		NOT NULL
  	,CITY				VARCHAR(30)		NOT NULL
  	,STATE				VARCHAR(2)		NOT NULL
  	,COUNTRY			VARCHAR(3)		NOT NULL
  	,ZIP_CODE			VARCHAR(9)		NOT NULL
  	,PHONE_NUMBER		VARCHAR(10)		NOT NULL
  	,CREATE_USER		VARCHAR(8)		NOT NULL
  	,CREATE_TIMESTAMP	TIMESTAMP		NOT NULL
  	,MODIFY_USER		VARCHAR(8)		NOT NULL
	,MODIFY_TIMESTAMP	TIMESTAMP		NOT NULL
	,PRIMARY KEY ( ID )
);

======================
Session
======================
mysql> source c:\acquirerSchema.sql
Query OK, 0 rows affected (0.41 sec)

mysql> desc acquirer_table;
+------------------+-------------+------+-----+---------------------+-----------------------------+
| Field            | Type        | Null | Key | Default             | Extra                       |
+------------------+-------------+------+-----+---------------------+-----------------------------+
| ID               | int(11)     | NO   | PRI | NULL                | auto_increment              |
| NAME             | varchar(20) | NO   |     | NULL                |                             |
| STREET           | varchar(20) | NO   |     | NULL                |                             |
| CITY             | varchar(30) | NO   |     | NULL                |                             |
| STATE            | varchar(2)  | NO   |     | NULL                |                             |
| COUNTRY          | varchar(3)  | NO   |     | NULL                |                             |
| ZIP_CODE         | varchar(9)  | NO   |     | NULL                |                             |
| PHONE_NUMBER     | varchar(10) | NO   |     | NULL                |                             |
| CREATE_USER      | varchar(8)  | NO   |     | NULL                |                             |
| CREATE_TIMESTAMP | timestamp   | NO   |     | CURRENT_TIMESTAMP   | on update CURRENT_TIMESTAMP |
| MODIFY_USER      | varchar(8)  | NO   |     | NULL                |                             |
| MODIFY_TIMESTAMP | timestamp   | NO   |     | 0000-00-00 00:00:00 |                             |
+------------------+-------------+------+-----+---------------------+-----------------------------+
12 rows in set (0.05 sec)
