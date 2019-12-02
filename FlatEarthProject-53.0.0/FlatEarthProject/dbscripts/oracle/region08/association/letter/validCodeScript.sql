delete from VALID_CODE_TABLE;
insert into VALID_CODE_TABLE values ( 0, 0, 0, 0, '0000', 'Placeholder Name' , 'Placeholder Description'		,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into VALID_CODE_TABLE values ( 0, 1, 0, 0, '1000', 'Valid Bitmap'     , 'Bitmap Passed All Edits'		,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into VALID_CODE_TABLE values ( 0, 2, 0, 0, '2000', 'Valid BIN'        , 'BIN Passed All Edits'			,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into VALID_CODE_TABLE values ( 0, 2, 1, 0, '2100', 'Valid PAN'        , 'PAN Passed All Edits'			,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
insert into VALID_CODE_TABLE values ( 0, 2, 2, 0, '2200', 'Valid Check Digit', 'Passed All Edits'				,'TALEXAND',CURRENT_TIMESTAMP,'TALEXAND',CURRENT_TIMESTAMP);
commit; 