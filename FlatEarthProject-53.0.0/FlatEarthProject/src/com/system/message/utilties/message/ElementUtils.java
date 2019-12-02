package com.system.message.utilties.message;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.region09.processor.issuer.explain.model.SingleElementExplainBean;
import com.system.message.base.element.DataElement;
import com.system.message.base.element.DataElementField;
import com.system.message.element.impl.DE001Impl;
import com.system.message.element.load.CreateDE000;
import com.system.message.element.load.CreateDE001;
import com.system.message.element.load.CreateDE002;
import com.system.message.element.load.CreateDE003;
import com.system.message.element.load.CreateDE004;
import com.system.message.element.load.CreateDE005;
import com.system.message.element.load.CreateDE006;
import com.system.message.element.load.CreateDE007;
import com.system.message.element.load.CreateDE008;
import com.system.message.element.load.CreateDE009;
import com.system.message.element.load.CreateDE010;
import com.system.message.element.load.CreateDE011;
import com.system.message.element.load.CreateDE012;
import com.system.message.element.load.CreateDE013;
import com.system.message.element.load.CreateDE014;
import com.system.message.element.load.CreateDE015;
import com.system.message.element.load.CreateDE016;
import com.system.message.element.load.CreateDE017;
import com.system.message.element.load.CreateDE018;
import com.system.message.element.load.CreateDE019;
import com.system.message.element.load.CreateDE020;
import com.system.message.element.load.CreateDE021;
import com.system.message.element.load.CreateDE022;
import com.system.message.element.load.CreateDE023;
import com.system.message.element.load.CreateDE024;
import com.system.message.element.load.CreateDE025;
import com.system.message.element.load.CreateDE026;
import com.system.message.element.load.CreateDE027;
import com.system.message.element.load.CreateDE028;
import com.system.message.element.load.CreateDE029;
import com.system.message.element.load.CreateDE030;
import com.system.message.element.load.CreateDE031;
import com.system.message.element.load.CreateDE032;
import com.system.message.element.load.CreateDE033;
import com.system.message.element.load.CreateDE034;
import com.system.message.element.load.CreateDE035;
import com.system.message.element.load.CreateDE036;
import com.system.message.element.load.CreateDE037;
import com.system.message.element.load.CreateDE038;
import com.system.message.element.load.CreateDE039;
import com.system.message.element.load.CreateDE040;
import com.system.message.element.load.CreateDE041;
import com.system.message.element.load.CreateDE042;
import com.system.message.element.load.CreateDE043;
import com.system.message.element.load.CreateDE044;
import com.system.message.element.load.CreateDE045;
import com.system.message.element.load.CreateDE046;
import com.system.message.element.load.CreateDE047;
import com.system.message.element.load.CreateDE048;
import com.system.message.element.load.CreateDE049;
import com.system.message.element.load.CreateDE050;
import com.system.message.element.load.CreateDE051;
import com.system.message.element.load.CreateDE052;
import com.system.message.element.load.CreateDE053;
import com.system.message.element.load.CreateDE054;
import com.system.message.element.load.CreateDE055;
import com.system.message.element.load.CreateDE056;
import com.system.message.element.load.CreateDE057;
import com.system.message.element.load.CreateDE058;
import com.system.message.element.load.CreateDE059;
import com.system.message.element.load.CreateDE060;
import com.system.message.element.load.CreateDE061;
import com.system.message.element.load.CreateDE062;
import com.system.message.element.load.CreateDE063;
import com.system.message.element.load.CreateDE064;
import com.system.message.element.model.ElementBean;
import com.system.message.utilties.codes.CodeTableUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;

import static com.system.configuration.constants.Element.*;

public class ElementUtils {

	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
	public void parseField (DataElementField element, List<FieldBean> fieldList) {
		
		String fieldName = fieldList.get(element.getField()).getFieldName();
		
		String subfieldName 
		
			= fieldList.get(element.getField()).getSubFieldName() != null 
			? fieldList.get(element.getField()).getSubFieldName().get(element.getSubField()) : "null";
			
		String format 		= new CodeTableUtils().convertFormatCode 	(element.getFormat()	);
		String encoding 	= new CodeTableUtils().convertEncodingCode 	(element.getEncoding()	);	
		String dataType 	= new CodeTableUtils().convertDataTypeCode 	(element.getDataType()	);	
		String source 		= new CodeTableUtils().convertSourceCode 	(element.getSource()	);	
		String direction 	= new CodeTableUtils().convertDirectionCode (element.getDirection()	);	
		String existence 	= new CodeTableUtils().convertExistenceCode (element.getExistence()	);	
		String change 		= new CodeTableUtils().convertChangeCode 	(element.getChange()	);	
					
		System.out.println();
		System.out.println("Request Message Data Element Attribute ID.............: " 			+ element.getId()	);
		
		System.out.format("Request Message Data Element Attribute Field......... : %6s %s %s\n" , element.getField()     , ": " , fieldName    		);
		System.out.format("Request Message Data Element Attribute Subfield...... : %6s %s %s\n" , element.getSubField()  , ": " , subfieldName		);
		System.out.format("Request Message Data Element Attribute Format........ : %6s %s %s\n" , element.getFormat()  	 , ": " , format  			);
		System.out.format("Request Message Data Element Attribute Length.........: %6s %s %s\n" , element.getLength()  	 , ": " , "Length" 			);
		System.out.format("Request Message Data Element Attribute Encoding.......: %6s %s %s\n" , element.getEncoding()  , ": " , encoding 			);
		System.out.format("Request Message Data Element Attribute DataType.......: %6s %s %s\n" , element.getDataType()  , ": " , dataType 			);
		System.out.format("Request Message Data Element Attribute Source.........: %6s %s %s\n" , element.getSource()    , ": " , source   			);
		System.out.format("Request Message Data Element Attribute Direction......: %6s %s %s\n" , element.getDirection() , ": " , direction			);
		System.out.format("Request Message Data Element Attribute Existence......: %6s %s %s\n" , element.getExistence() , ": " , existence			);
		System.out.format("Request Message Data Element Attribute Change.........: %6s %s %s\n" , element.getChange()    , ": " , change   			);
		
		System.out.format("Request Message Data Element Attribute Value..........: %6s %s %s\n" , " "     				 , ": " , element.getValue());
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
	public ArrayList<Payload> parseField2 (SingleElementExplainBean element, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		ArrayList<Payload> payloadList = new ArrayList<Payload>();
		
		String line01 = "Element Attribute ID";
		String line02 = "Element Attribute Field";
		String line03 = "Element Attribute Subfield";
		String line04 = "Element Attribute Format";
		String line05 = "Element Attribute Length";
		String line06 = "Element Attribute Encoding";
		String line07 = "Element Attribute DataType";
		String line08 = "Element Attribute Source";
		String line09 = "Element Attribute Direction";
		String line10 = "Element Attribute Existence";
		String line11 = "Element Attribute Change";
		String line12 = "Element Attribute Value";
		
		String fieldName = fieldList.get(element.getField()).getFieldName();
		
		String subfieldName 
		
			= fieldList.get(element.getField()).getSubFieldName() != null 
			? fieldList.get(element.getField()).getSubFieldName().get(element.getSubField()) : "null";
			
		String format 		= new CodeTableUtils().convertFormatCode 	(element.getFormat()	);
		String encoding 	= new CodeTableUtils().convertEncodingCode 	(element.getEncoding()	);	
		String dataType 	= new CodeTableUtils().convertDataTypeCode 	(element.getDataType()	);	
		String source 		= new CodeTableUtils().convertSourceCode 	(element.getSource()	);	
		String direction 	= new CodeTableUtils().convertDirectionCode (element.getDirection()	);	
		String existence 	= new CodeTableUtils().convertExistenceCode (element.getExistence()	);	
		String change 		= new CodeTableUtils().convertChangeCode 	(element.getChange()	);	
/*					
		System.out.println();
		System.out.println("Request Message Data Element Attribute ID.............: " 			+ element.getId()	);
		
		System.out.format("Request Message Data Element Attribute Field......... : %6s %s %s\n" , element.getField()     , ": " , fieldName    		);
		System.out.format("Request Message Data Element Attribute Subfield...... : %6s %s %s\n" , element.getSubField()  , ": " , subfieldName		);
		System.out.format("Request Message Data Element Attribute Format........ : %6s %s %s\n" , element.getFormat()  	 , ": " , format  			);
		System.out.format("Request Message Data Element Attribute Length.........: %6s %s %s\n" , element.getLength()  	 , ": " , "Length" 			);
		System.out.format("Request Message Data Element Attribute Encoding.......: %6s %s %s\n" , element.getEncoding()  , ": " , encoding 			);
		System.out.format("Request Message Data Element Attribute DataType.......: %6s %s %s\n" , element.getDataType()  , ": " , dataType 			);
		System.out.format("Request Message Data Element Attribute Source.........: %6s %s %s\n" , element.getSource()    , ": " , source   			);
		System.out.format("Request Message Data Element Attribute Direction......: %6s %s %s\n" , element.getDirection() , ": " , direction			);
		System.out.format("Request Message Data Element Attribute Existence......: %6s %s %s\n" , element.getExistence() , ": " , existence			);
		System.out.format("Request Message Data Element Attribute Change.........: %6s %s %s\n" , element.getChange()    , ": " , change   			);
		
		System.out.format("Request Message Data Element Attribute Value..........: %6s %s %s\n" , " "     				 , ": " , element.getFieldValue());
*/		
		Payload payload01 = new Payload (line01, String.valueOf(element.getId())		, "" 			);
		Payload payload02 = new Payload (line02, String.valueOf(element.getField())		, fieldName 	);
		Payload payload03 = new Payload (line03, String.valueOf(element.getSubField())	, subfieldName 	);
		Payload payload04 = new Payload (line04, String.valueOf(element.getFormat())	, format 		);
		Payload payload05 = new Payload (line05, String.valueOf(element.getLength())	, "Length" 		);
		Payload payload06 = new Payload (line06, String.valueOf(element.getEncoding())	, encoding 		);
		Payload payload07 = new Payload (line07, String.valueOf(element.getDataType())	, dataType	 	);
		Payload payload08 = new Payload (line08, String.valueOf(element.getSource())	, source 		);
		Payload payload09 = new Payload (line09, String.valueOf(element.getDirection())	, direction 	);
		Payload payload10 = new Payload (line10, String.valueOf(element.getExistence())	, existence 	);
		Payload payload11 = new Payload (line11, String.valueOf(element.getChange())	, change 		);
		Payload payload12 = new Payload (line12, ""										, element.getFieldValue());
		
		payloadList.add(payload01);
		payloadList.add(payload02);
		payloadList.add(payload03);
		payloadList.add(payload04);
		payloadList.add(payload05);
		payloadList.add(payload06);
		payloadList.add(payload07);
		payloadList.add(payload08);
		payloadList.add(payload09);
		payloadList.add(payload10);
		payloadList.add(payload11);
		payloadList.add(payload12);
		
		return payloadList;
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */	
	public void display (List<DataElement> request, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		BitSet bitMap = new DE001Impl().getBitMap();
		
		for (int dataElement = 0; dataElement < request.size(); dataElement++) {	 
			
			if (bitMap.get(dataElement)) {
				
				int j = request.get(dataElement).getStorage().size();
				
				for (int subfields = 0; subfields < j; subfields++ ) {
					 
					DataElementField element = request.get(dataElement).getStorage().get(subfields);
						
					new ElementUtils().parseField (element, fieldList);
					
				}
			}
		}
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void display (DataElement request, List<FieldBean> fieldList, List<CodeBean> codeList) {
		
		int j = request.getStorage().size();
				
		for (int subfields = 0; subfields < j; subfields++ ) {
					 
			DataElementField element = request.getStorage().get(subfields);
						
			new ElementUtils().parseField (element, fieldList);
					
		}

	}
	/*********************************************************************************************************************
	 * ORA-12519 (TNS: no appropriate handler found) errors
	 * select * from v$resource_limit where resource_name = 'processes';
	 * alter system set processes=200 scope=spfile;
	 * 
	 * Increase the number of process.
     *
	 *	cmd>sqlplus / as sysdba
	 *	sqlplus>alter system set processes=300 scope=spfile;
	 *	sqlplus>shut immediate;
	 *	sqlplus>startup
     *
	 *********************************************************************************************************************
	 */	
	public void insert (JdbcTemplate jdbcTemplate, List<DataElement> request) {
		
		BitSet bitMap = new DE001Impl().getBitMap();
		
		Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		
		for (int dataElement = 0; dataElement < request.size(); dataElement++) {	 
		
			if (bitMap.get(dataElement)) {
				 
				int j = request.get(dataElement).getStorage().size();
				
				for (int subfields = 0; subfields < j; subfields++ ) {
					 
					DataElementField element = request.get(dataElement).getStorage().get(subfields);
					
					 String sqlInsert = 
							 
							 " INSERT INTO ELEMENT_TABLE "	+
					 		 "(							 "	+
					 		 "  FIELD					 "	+
					 		 ", SUBFIELD		 		 "	+
							 ", FORMAT		 		 	 "	+
							 ", LENGTH		 		 	 "	+
							 ", ENCODING		 		 "	+
							 ", DATATYPE		 		 "	+
							 ", SOURCE		 		 	 "	+
							 ", DIRECTION		 		 "	+
							 ", EXISTENCE		 		 "	+
							 ", CHANGE		 		 	 "	+
							 ", FIELD_VALUE		 		 "	+
							 ", CREATE_USER		 		 "	+
							 ", CREATE_TIMESTAMP		 "	+
							 ", MODIFY_USER		 		 "	+
							 ", MODIFY_TIMESTAMP		 "	+
					 		 ")							 "	+					
				             " VALUES 					 "	+
					 		 "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					
					jdbcTemplate.update ( sqlInsert
//										, element.getId()
										, element.getField()
										, element.getSubField()
										, element.getFormat()
										, element.getLength()
										, element.getEncoding()
										, element.getDataType()
										, element.getSource()
										, element.getDirection()
										, element.getExistence()
										, element.getChange()
										, element.getValue()
										, CREATE_USER
										, currentTimestamp
										, MODIFY_USER
										, currentTimestamp
										);
					
				}
			}
		}
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public List<DataElement> buildTransaction() {
		
		List<DataElement> requestMessage = new LinkedList<DataElement>();
		
		requestMessage.add(new CreateDE000().createDE000());
		requestMessage.add(new CreateDE001().createDE001());
		requestMessage.add(new CreateDE002().createDE002());
		requestMessage.add(new CreateDE003().createDE003());
		requestMessage.add(new CreateDE004().createDE004());
		requestMessage.add(new CreateDE005().createDE005());
		requestMessage.add(new CreateDE006().createDE006());
		requestMessage.add(new CreateDE007().createDE007());
		requestMessage.add(new CreateDE008().createDE008());
		requestMessage.add(new CreateDE009().createDE009());
		
		requestMessage.add(new CreateDE010().createDE010());
		requestMessage.add(new CreateDE011().createDE011());
		requestMessage.add(new CreateDE012().createDE012());
		requestMessage.add(new CreateDE013().createDE013());
		requestMessage.add(new CreateDE014().createDE014());
		requestMessage.add(new CreateDE015().createDE015());
		requestMessage.add(new CreateDE016().createDE016());
		requestMessage.add(new CreateDE017().createDE017());
		requestMessage.add(new CreateDE018().createDE018());
		requestMessage.add(new CreateDE019().createDE019());
		
		requestMessage.add(new CreateDE020().createDE020());
		requestMessage.add(new CreateDE021().createDE021());
		requestMessage.add(new CreateDE022().createDE022());
		requestMessage.add(new CreateDE023().createDE023());
		requestMessage.add(new CreateDE024().createDE024());
		requestMessage.add(new CreateDE025().createDE025());
		requestMessage.add(new CreateDE026().createDE026());
		requestMessage.add(new CreateDE027().createDE027());
		requestMessage.add(new CreateDE028().createDE028());
		requestMessage.add(new CreateDE029().createDE029());
		
		requestMessage.add(new CreateDE030().createDE030());
		requestMessage.add(new CreateDE031().createDE031());
		requestMessage.add(new CreateDE032().createDE032());
		requestMessage.add(new CreateDE033().createDE033());
		requestMessage.add(new CreateDE034().createDE034());
		requestMessage.add(new CreateDE035().createDE035());
		requestMessage.add(new CreateDE036().createDE036());
		requestMessage.add(new CreateDE037().createDE037());
		requestMessage.add(new CreateDE038().createDE038());
		requestMessage.add(new CreateDE039().createDE039());
		
		requestMessage.add(new CreateDE040().createDE040());
		requestMessage.add(new CreateDE041().createDE041());
		requestMessage.add(new CreateDE042().createDE042());
		requestMessage.add(new CreateDE043().createDE043());
		requestMessage.add(new CreateDE044().createDE044());
		requestMessage.add(new CreateDE045().createDE045());
		requestMessage.add(new CreateDE046().createDE046());
		requestMessage.add(new CreateDE047().createDE047());
		requestMessage.add(new CreateDE048().createDE048());
		requestMessage.add(new CreateDE049().createDE049());
		
		requestMessage.add(new CreateDE050().createDE050());
		requestMessage.add(new CreateDE051().createDE051());
		requestMessage.add(new CreateDE052().createDE052());
		requestMessage.add(new CreateDE053().createDE053());
		requestMessage.add(new CreateDE054().createDE054());
		requestMessage.add(new CreateDE055().createDE055());
		requestMessage.add(new CreateDE056().createDE056());
		requestMessage.add(new CreateDE057().createDE057());
		requestMessage.add(new CreateDE058().createDE058());
		requestMessage.add(new CreateDE059().createDE059());
		
		requestMessage.add(new CreateDE060().createDE060());
		requestMessage.add(new CreateDE061().createDE061());
		requestMessage.add(new CreateDE062().createDE062());
		requestMessage.add(new CreateDE063().createDE063());
		requestMessage.add(new CreateDE064().createDE064());
		
		return requestMessage;
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void update (JdbcTemplate jdbcTemplate, ElementBean element) {
		
	       String sqlUpdate 
	       
	       	= " UPDATE ELEMENT_TABLE 			"	+
	       	  "    SET FORMAT 			= ?		"	+
	          "      , LENGTH 			= ?		"	+
	          "      , ENCODING 		= ?		"	+
	          "      , DATATYPE 		= ?		"	+
	          "      , SOURCE 			= ?		"	+
	          "      , DIRECTION 		= ?		"	+
	          "      , CHANGE 			= ?		"	+
	          "      , FIELD_VALUE 		= ?		"	+
	          "      , MODIFY_USER 		= ?		"	+
	       	  "      , MODIFY_TIMESTAMP = ?		"	+
	       	  "  WHERE ID				= ?		"
	       	  ;
	        
	        jdbcTemplate.update ( sqlUpdate
	        					, element.getFormat()
	        					, element.getLength()
	        					, element.getEncoding()
	        					, element.getDataType()
	        					, element.getSource()
	        					, element.getDirection()
	        					, element.getChange()
	        					, element.getFieldValue()
	        					, element.getModifyUser()
	        					, element.getModifyTimestamp()
	        					);
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void delete (JdbcTemplate jdbcTemplate, int id) {
		
		String sqlDelete = "DELETE FROM ELEMENT_TABLE WHERE ID = ?";
		
        jdbcTemplate.update(sqlDelete, id);
        
        System.out.println("Delete ELEMENT_TABLE for ID = " + id + " is Completed.");
        
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public ElementBean selectElementById(JdbcTemplate jdbcTemplate, int id) {
		
		String sql 
		
		= "SELECT * "
		+ "  FROM ELEMENT_TABLE "
		+ " WHERE ID = ?";
	
		return jdbcTemplate.queryForObject  ( sql
								  		    , new Object[]{id}
								  		    , new BeanPropertyRowMapper<ElementBean>(ElementBean.class)
								  		    );
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public void select(JdbcTemplate jdbcTemplate) {
		
        String sqlSelect = "SELECT * FROM ELEMENT_TABLE ORDER BY FIELD, SUBFIELD";
        
        List<ElementBean> elementList = jdbcTemplate.query(sqlSelect, new RowMapper<ElementBean>() {
 
            public ElementBean mapRow(ResultSet result, int rowNum) throws SQLException {
            	
            	ElementBean element = new ElementBean();
            	
                element.setId				(result.getInt("ID"));
                element.setField			(result.getInt("FIELD"));
                element.setSubField			(result.getInt("SUBFIELD"));
                element.setFormat			(result.getInt("FORMAT"));
                element.setLength			(result.getInt("LENGTH"));
                element.setEncoding			(result.getInt("ENCODING"));
                element.setDataType			(result.getInt("DATATYPE"));
                element.setSource			(result.getInt("SOURCE"));
                element.setDirection		(result.getInt("DIRECTION"));
                element.setChange			(result.getInt("CHANGE"));
                element.setFieldValue		(result.getString("FIELD_VALUE"));
                element.setCreateUser		(result.getString("CREATE_USER"));
                element.setCreateTimestamp	(result.getTimestamp("CREATE_TIMESTAMP"));
                element.setModifyUser		(result.getString("MODIFY_USER"));
                element.setModifyTimestamp	(result.getTimestamp("MODIFY_TIMESTAMP"));
                 
                return element;
            }
             
        });
         
        for (ElementBean element : elementList) {
            System.out.println(element);
        }
		
	}
	/*********************************************************************************************************************
	 *********************************************************************************************************************
	 */
	public static void main(String[] args) {

		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
//		ElementBean element = new ElementBean();
		
//		int id = 0;
		    
		dataSource.setDriver(new oracle.jdbc.driver.OracleDriver());
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("secret");
		     
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<DataElement> message = new ElementUtils().buildTransaction();
		
		List<FieldBean> fieldList =  new FieldTableUtils().createFields();
		
		List<CodeBean> codeList =  new CodeTableUtils().createCodes();
		
		new ElementUtils().display (message, fieldList, codeList);
		
//		new ElementUtils().insert (jdbcTemplate, message);
		
//		new ElementUtils().update (jdbcTemplate, element);
		
//		new ElementUtils().delete (jdbcTemplate, id);
		
//		new ElementUtils().selectElementById (jdbcTemplate, id);
		
//		new ElementUtils().select (jdbcTemplate);
		
	}
}