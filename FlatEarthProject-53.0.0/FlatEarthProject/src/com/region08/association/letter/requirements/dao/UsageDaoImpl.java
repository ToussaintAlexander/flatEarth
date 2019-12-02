package com.region08.association.letter.requirements.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.requirements.model.UsageBean;

public class UsageDaoImpl implements UsageDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(UsageBean usage){

			String sql 
			
				= "INSERT INTO USAGE_TABLE "
						+ "("
						+ ",EFFECTIVE_DATE"
						+ ",MAJOR_VERSION"
						+ ",MINOR_VERSION"
						+ ",SECTION"
						+ ",SUBSECTION"
						+ ",PARAGRAPH"
						+ ",SENTENCE"
						
						+ ",SYSTEM"
						+ ",REGION"
						+ ",PLATFORM"
						+ ",PROCESSING"
						+ ",MESSAGE_TYPE"
						+ ",STATUS"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	usage.getEffectiveDate()	+	"'"
						+ ",'"	+	usage.getMajorVersion()		+	"'"
						+ ",'"	+	usage.getMinorVersion()		+	"'"
						+ ",'"	+	usage.getSection()			+	"'"
						+ ",'"	+	usage.getSubsection()		+	"'"
						+ ",'"	+	usage.getParagraph()		+	"'"
						+ ",'"	+	usage.getSentence()			+	"'"
						
						+ ",'"	+	usage.getSystem()			+	"'"
						+ ",'"	+	usage.getRegion()			+	"'"
						+ ",'"	+	usage.getPlatform()			+	"'"
						+ ",'"	+	usage.getProcessing()		+	"'"
						+ ",'"	+	usage.getMessageType()		+	"'"
						+ ",'"	+	usage.getStatus()			+	"'"
						
						+ ",'"	+	usage.getCreateUser()		+	"'"
						+ ",'"	+	usage.getCreateTimestamp()	+	"'"
						+ ",'"	+	usage.getModifyUser()		+	"'"
						+ ",'"	+	usage.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(UsageBean usage){
	
	String sql =
			
			" UPDATE USAGE_TABLE " 	+
			
			"    SET EFFECTIVE_DATE 	= '"  	+ usage.getEffectiveDate()		+	"'"	+
			"      , MAJOR_VERSION 		= '"  	+ usage.getMajorVersion()		+	"'"	+
			"      , MINOR_VERSION 		= '"  	+ usage.getMinorVersion()		+	"'"	+
			"      , SECTION 			= '"  	+ usage.getSection()			+	"'"	+
			"      , SUBSECTION 		= '"  	+ usage.getSubsection()			+	"'"	+
			"      , PARAGRAPH 			= '"  	+ usage.getParagraph()			+	"'"	+
			"      , SENTENCE 			= '"  	+ usage.getSentence()			+	"'"	+
			
			"      , SYSTEM 			= '"  	+ usage.getSystem()				+	"'"	+
			"      , REGION 			= '"  	+ usage.getRegion()				+	"'"	+
			"      , PLATFORM 			= '"  	+ usage.getPlatform()			+	"'"	+
			"      , PROCESSING 		= '"  	+ usage.getProcessing()			+	"'"	+
			"      , MESSAGE_TYPE 		= '"  	+ usage.getMessageType()		+	"'"	+
			"      , STATUS 			= '"  	+ usage.getStatus()				+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ usage.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ usage.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ usage.getId()					+ 	"'";
	
	return template.update(sql);
	
}

@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM USAGE_TABLE "	+
			" WHERE ID = 		"		+
			       id					+
			" ";
	
	return template.update(sql);
	
}

@Override
public UsageBean selectUsageById(int id){
	
	String sql 
	
		= "SELECT * "					+
		 "   FROM USAGE_TABLE "			+
		 "  WHERE ID			 = ? "	+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<UsageBean>(UsageBean.class));
	
}

@Override
public List<UsageBean> select(){
	
	return template.query( "SELECT * FROM USAGE_TABLE"
						 ,new RowMapper<UsageBean>(){
		
		public UsageBean mapRow(ResultSet rs, int row) throws SQLException {
			
			UsageBean usage = new UsageBean();
			
			usage.setId					(rs.getInt(1));
			
			usage.setEffectiveDate		(rs.getDate(2));
			usage.setMajorVersion		(rs.getInt(3));
			usage.setMinorVersion		(rs.getInt(4));
			usage.setSection			(rs.getInt(5));
			usage.setSubsection			(rs.getInt(6));
			usage.setParagraph			(rs.getInt(7));
			usage.setSentence			(rs.getInt(8));
			
			usage.setSystem				(rs.getString(9));
			usage.setRegion				(rs.getString(10));
			usage.setPlatform			(rs.getString(11));
			usage.setProcessing			(rs.getString(12));
			usage.setMessageType		(rs.getString(13));
			usage.setStatus				(rs.getInt(14));
			
			usage.setCreateUser			(rs.getString(15));
			usage.setCreateTimestamp	(rs.getTimestamp(16));
			usage.setModifyUser			(rs.getString(17));
			usage.setModifyTimestamp	(rs.getTimestamp(18));
			
			return usage;
			
		}
	});
  }
}
