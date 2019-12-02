SET LINESIZE 150
COLUMN SCREEN_NAME FORMAT A20
COLUMN FIELD_NAME  FORMAT A25
COLUMN EXPRESSION  FORMAT A50
select id, screen_name,field_name,expression from expression_table;