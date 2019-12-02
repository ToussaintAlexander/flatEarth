--   login.sql
--   SQL*Plus user login startup file.
--
--   This script is automatically run after glogin.sql
--
--   Change SQL*Plus prompt to display the current user, SID, and current time.
--
--   First set the database date format to show the time.
--
ALTER SESSION SET nls_date_format = 'HH:MI:SS';

--   Set SQLPROMPT to include _USER, _CONNECT_IDENTIFIER, and _DATE variables.

SET SQLPROMPT "_USER'@'_CONNECT_IDENTIFIER _DATE> "

--   Set number of lines to display report page to 24.

SET PAGESIZE 24

--   To set the number of characters to display on each report line to 150.

SET LINESIZE 150

