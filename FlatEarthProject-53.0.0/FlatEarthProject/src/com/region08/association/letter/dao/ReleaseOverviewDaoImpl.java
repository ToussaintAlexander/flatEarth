package com.region08.association.letter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.region08.association.letter.model.ReleaseOverviewBean;

public class ReleaseOverviewDaoImpl implements ReleaseOverviewDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

@Override
public int insert(ReleaseOverviewBean releaseOverview){

			String sql 
			
				= "INSERT INTO RELEASE_OVERVIEW_TABLE "
						+ "("
						+ " DATE"
						+ ",EVENT"
						
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIMESTAMP"
						+ ") "
						+ "VALUES"
						+ "('"	+	releaseOverview.getDate()				+	"'"
						+ ",'"	+	releaseOverview.getEvent()				+	"'"
						
						+ ",'"	+	releaseOverview.getCreateUser()			+	"'"
						+ ",'"	+	releaseOverview.getCreateTimestamp()	+	"'"
						+ ",'"	+	releaseOverview.getModifyUser()			+	"'"
						+ ",'"	+	releaseOverview.getModifyTimestamp()	+	"'"
						+ ")";

	return template.update(sql);
	
}

@Override
public int update(ReleaseOverviewBean releaseOverview){
	
	String sql =
			
			" UPDATE RELEASE_OVERVIEW_TABLE  " 	+
			
			"    SET DATE 				= '" 	+ releaseOverview.getDate() 			+	"'"	+
			"      , EVENT 				= '"  	+ releaseOverview.getEvent()	 		+	"'"	+
			
			"      , MODIFY_USER		= '" 	+ releaseOverview.getModifyUser()  		+	"'"	+
			"      , MODIFY_TIMESTAMP	= '" 	+ releaseOverview.getModifyTimestamp()	+	"'"	+	
			
			"  WHERE ID 				= "		+ releaseOverview.getId()				+	"'"	+
			"    AND SEQ 				= "		+ releaseOverview.getSeq()				+ 	" ";
	
	return template.update(sql);
	
}

@Override
public int delete(int id, int seq){
	
	String sql =
			
			"DELETE FROM RELEASE_OVERVIEW_TABLE 	"	+
			" WHERE ID 			= 					"	+
			"   AND SEQUENCE 	= 					"	+
			        id									+
			","											+
			        seq								+
			" ";
	
	return template.update(sql);
	
}

@Override
public ReleaseOverviewBean selectReleaseOverviewById(int id, int seq){
	
	String sql 
	
		= "SELECT * "						+
		 "   FROM RELEASE_OVERVIEW_TABLE "	+
		 "  WHERE ID			 = ? "		+
		 "    AND SEQ            = ? "		+
		 "";
	
	return template.queryForObject( sql
								  , new Object[]{id, seq}
								  , new BeanPropertyRowMapper<ReleaseOverviewBean>(ReleaseOverviewBean.class));
	
}

@Override
public List<ReleaseOverviewBean> select(){
	
	return template.query( "SELECT * FROM RELEASE_OVERVIEW_TABLE"
						 ,new RowMapper<ReleaseOverviewBean>(){
		
		public ReleaseOverviewBean mapRow(ResultSet rs, int row) throws SQLException {
			
			ReleaseOverviewBean releaseOverview = new ReleaseOverviewBean();
			
			releaseOverview.setId					(rs.getInt(1));
			releaseOverview.setSeq					(rs.getInt(2));
			releaseOverview.setDate					(rs.getDate(3));
			releaseOverview.setEvent				(rs.getString(4));
			releaseOverview.setCreateUser			(rs.getString(5));
			releaseOverview.setCreateTimestamp		(rs.getTimestamp(6));
			releaseOverview.setModifyUser			(rs.getString(7));
			releaseOverview.setModifyTimestamp		(rs.getTimestamp(8));
			
			return releaseOverview;
			
		}
	});
  }
}
