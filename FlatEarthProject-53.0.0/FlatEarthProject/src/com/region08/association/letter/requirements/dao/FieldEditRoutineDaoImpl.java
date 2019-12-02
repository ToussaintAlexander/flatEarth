package com.region08.association.letter.requirements.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.requirements.model.FieldEditRoutineBean;

public class FieldEditRoutineDaoImpl implements FieldEditRoutineDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(FieldEditRoutineBean fieldEditRoutine){

				String sql 
				
					= "INSERT INTO FIELD_EDIT_HEADER_TABLE "
							+ "("
							+ " FIELD"
							+ ",SUBFIELD"
							+ ",FORMAT"
							+ ",MINIMUM_LENGTH"
							+ ",MAXIMUM_LENGTH"
							+ ",ENCODING"
							+ ",DATA_TYPE"
							+ ",SOURCE"
							+ ",DIRECTION"
							+ ",EXISTENCE"
							+ ",CHANGE"
							+ ",CREATE_USER"
							+ ",CREATE_TIMESTAMP"
							+ ",MODIFY_USER"
							+ ",MODIFY_TIMESTAMP"
							+ ") "
							+ "VALUES"
							+ "('"	+	fieldEditRoutine.getField()				+	"'"
							+ ",'"	+	fieldEditRoutine.getSubfield()			+	"'"
							+ ",'"	+	fieldEditRoutine.getFormat()				+	"'"
							+ ",'"	+	fieldEditRoutine.getMinimumLength()		+	"'"
							+ ",'"	+	fieldEditRoutine.getMaximumLength()		+	"'"
							+ ",'"	+	fieldEditRoutine.getEncoding()			+	"'"
							+ ",'"	+	fieldEditRoutine.getDatatype()			+	"'"
							+ ",'"	+	fieldEditRoutine.getSource()				+	"'"
							+ ",'"	+	fieldEditRoutine.getDirection()			+	"'"
							+ ",'"	+	fieldEditRoutine.getExistence()			+	"'"
							+ ",'"	+	fieldEditRoutine.getChange()				+	"'"
							+ ",'"	+	fieldEditRoutine.getCreateUser()			+	"'"
							+ ",'"	+	fieldEditRoutine.getCreateTimestamp()	+	"'"
							+ ",'"	+	fieldEditRoutine.getModifyUser()			+	"'"
							+ ",'"	+	fieldEditRoutine.getModifyTimestamp()	+	"'"
							+ ")";

		return template.update(sql);
		
	}

	@Override
	public int update(FieldEditRoutineBean fieldEditRoutine){
		
		String sql =
				
				" UPDATE FIELD_EDIT_HEADER_TABLE  "	+
				
				"    SET FIELD 				= '" 	+ fieldEditRoutine.getField() 			+	"'"	+
				"      , SUBFIELD 			= '"  	+ fieldEditRoutine.getSubfield()	 		+	"'"	+
				"      , FORMAT 			= '"  	+ fieldEditRoutine.getFormat()			+	"'"	+
				"      , MINIMUM_LENGTH 	= '"  	+ fieldEditRoutine.getMinimumLength()	 	+	"'"	+
				"      , MAXIMUM_LENGTH 	= '"  	+ fieldEditRoutine.getMaximumLength()		+	"'"	+
				"      , ENCODING 			= '"  	+ fieldEditRoutine.getEncoding()	 		+	"'"	+
				"      , DATA_TYPE 			= '"  	+ fieldEditRoutine.getDatatype()			+	"'"	+
				"      , SOURCE 			= '"  	+ fieldEditRoutine.getSource()	 		+	"'"	+
				"      , DIRECTION 			= '"  	+ fieldEditRoutine.getDirection()			+	"'"	+
				"      , EXISTENCE 			= '"  	+ fieldEditRoutine.getExistence()	 		+	"'"	+
				"      , CHANGE 			= '"  	+ fieldEditRoutine.getChange()			+	"'"	+
				
				"      , MODIFY_USER		= '" 	+ fieldEditRoutine.getModifyUser()  		+	"'"	+
				"      , MODIFY_TIMESTAMP	= '" 	+ fieldEditRoutine.getModifyTimestamp()  	+	"'"	+	
				
				"  WHERE ID 				= "		+ fieldEditRoutine.getId()				+ 	"";
		
		return template.update(sql);
		
	}

	@Override
	public int delete(int id, int sequence){
		
		String sql =
				
				"DELETE FROM FIELD_EDIT_HEADER_TABLE "	+
				" WHERE ID = 		"					+
				"   AND SEQUENCE = "					+	
				       id								+
				","										+       
				       sequence							+       
				" ";
		
		return template.update(sql);
		
	}

	@Override
	public FieldEditRoutineBean selectFieldEditRoutineById(int id){
		
		String sql 
		
			= "SELECT * "						+
			 "   FROM FIELD_EDIT_HEADER_TABLE "	+
			 "  WHERE ID		   = ? "		+
			 "";
		
		return template.queryForObject( sql
									  , new Object[]{id}
									  , new BeanPropertyRowMapper<FieldEditRoutineBean>(FieldEditRoutineBean.class));
		
	}

	@Override
	public List<FieldEditRoutineBean> select(){
		
		return template.query( "SELECT * FROM FIELD_EDIT_HEADER_TABLE"
							 ,new RowMapper<FieldEditRoutineBean>(){
			
			public FieldEditRoutineBean mapRow(ResultSet rs, int row) throws SQLException {
				
				FieldEditRoutineBean fieldEditRoutine = new FieldEditRoutineBean();
				
				fieldEditRoutine.setId				(rs.getInt(1));
				fieldEditRoutine.setField				(rs.getInt(3));
				fieldEditRoutine.setSubfield			(rs.getInt(4));
				fieldEditRoutine.setFormat			(rs.getInt(5));
				fieldEditRoutine.setMinimumLength		(rs.getInt(6));
				fieldEditRoutine.setMaximumLength		(rs.getInt(7));
				fieldEditRoutine.setEncoding			(rs.getInt(8));
				fieldEditRoutine.setDatatype			(rs.getInt(9));
				fieldEditRoutine.setSource			(rs.getInt(10));
				fieldEditRoutine.setDirection			(rs.getInt(11));
				fieldEditRoutine.setExistence			(rs.getInt(12));
				fieldEditRoutine.setChange			(rs.getInt(13));
				
				fieldEditRoutine.setCreateUser		(rs.getString(14));
				fieldEditRoutine.setCreateTimestamp	(rs.getTimestamp(15));
				fieldEditRoutine.setModifyUser		(rs.getString(16));
				fieldEditRoutine.setModifyTimestamp	(rs.getTimestamp(17));
				
				return fieldEditRoutine;
				
			}
		});
	  }
}

	
