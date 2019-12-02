delete from REJECT_CODE_TABLE;
insert into REJECT_CODE_TABLE values ( 0, 0, 0, 0, '0000', 'Placeholder Name' 	, 'Placeholder Description'		,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into REJECT_CODE_TABLE values ( 0, 1, 0, 0, '1001', 'Invalid Bitmap'     , 'Bitmap Failed Edits'			,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into REJECT_CODE_TABLE values ( 0, 2, 0, 0, '2001', 'Invalid BIN'        , 'BIN Failed Edits'			,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into REJECT_CODE_TABLE values ( 0, 2, 1, 0, '2101', 'Invalid PAN'        , 'PAN Failed Edits'			,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into REJECT_CODE_TABLE values ( 0, 2, 2, 0, '2201', 'Invalid Check Digit', 'Check Digit Failed Edits'	,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
commit; 