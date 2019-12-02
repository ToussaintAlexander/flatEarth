select table_name
      ,tablespace_name 
      ,status
  from user_tables 
 where table_name 
  like '%_TABLE'
  order by table_name;