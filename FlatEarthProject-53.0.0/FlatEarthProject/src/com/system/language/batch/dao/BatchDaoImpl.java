package com.system.language.batch.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.system.language.batch.model.BatchBean;

public class BatchDaoImpl implements BatchDao {
	
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public int insert(BatchBean batch){

			String sql 
			
				= "INSERT INTO BATCH_TABLE "
						+ "("
						+ " BATCH_KEY"
						+ ",CONTEXT_FILE"
						+ ",DATABASE_CONFIGURATION"
						+ ",JOB_REPORT"
						+ ",JOB_LAUNCHER"
						+ ",REPORT_JOB"
						+ ",CREATE_USER"
						+ ",CREATE_TIMESTAMP"
						+ ",MODIFY_USER"
						+ ",MODIFY_TIESTAMP"
						+ ") "
						+ "VALUES "
						+ "('"	+	batch.getBatchKey()					+	"'"
						+ ",'"	+	batch.getContextFile()				+	"'"
						+ ",'"	+	batch.getDatabaseConfiguration()	+	"'"
						+ ",'"	+	batch.getJobReport()				+	"'"
						+ ",'"	+	batch.getJobLauncher()				+	"'"
						+ ",'"	+	batch.getReportJob()				+	"'"
						+ ",'"	+	batch.getCreateUser()				+	"'"
						+ ",'"	+	batch.getCreateTimestamp()			+	"'"
						+ ",'"	+	batch.getModifyUser()				+	"'"
						+ ",'"	+	batch.getModifyTimestamp()			+	"'"
						+ ")";

	return template.update(sql);
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public int update(BatchBean batch){
	
	String sql =
			
			" UPDATE BATCH_TABLE " 	+
			
			"    SET BATCH_KEY 					= '" 	+ batch.getBatchKey() 				+	"'"	+
			"      , CONTEXT_FILE 				= '"  	+ batch.getContextFile()			+	"'"	+
			"      , DATABASE_CONFIGURATION		= '" 	+ batch.getDatabaseConfiguration()  +	"'"	+
			"      , JOB_REPORT					= '" 	+ batch.getJobReport()  			+	"'"	+
			"      , JOB_LAUNCHER				= '" 	+ batch.getJobLauncher()  			+	"'"	+
			"      , REPORT_JOB					= '" 	+ batch.getReportJob()  			+	"'"	+
			"      , create_user				= '" 	+ batch.getCreateUser()  			+	"'"	+
			"      , create_timestamp			= '" 	+ batch.getCreateTimestamp()  		+	"'"	+
			"      , modify_user				= '" 	+ batch.getModifyUser()  			+	"'"	+
			"      , modify_timestamp			= '" 	+ batch.getModifyTimestamp()  		+	"'"	+	
			
			"  WHERE ID 						= "		+ batch.getId()						+ 	"";
	
	return template.update(sql);
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public int delete(int id){
	
	String sql =
			
			"DELETE FROM BATCH_TABLE "
			+ "WHERE ID = "
			+id
			+"";
	
	return template.update(sql);
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public BatchBean selectBatchById(int id){
	
	String sql 
	
		= "SELECT * "
		+ "FROM BATCH_TABLE "
		+ "WHERE ID = ?";
	
	return template.queryForObject( sql
								  , new Object[]{id}
								  , new BeanPropertyRowMapper<BatchBean>(BatchBean.class));
	
}
/***********************************************************************************/
/***********************************************************************************/	
@Override
public List<BatchBean> select(){
	
	return template.query( "SELECT * FROM BATCH_TABLE"
						 ,new RowMapper<BatchBean>(){
		
		public BatchBean mapRow(ResultSet rs, int row) throws SQLException {
			
			BatchBean batch = new BatchBean();
			
			batch.setId						(rs.getInt(1));
			batch.setBatchKey				(rs.getString(2));
			batch.setContextFile			(rs.getString(3));
			batch.setDatabaseConfiguration	(rs.getString(4));
			batch.setJobReport				(rs.getString(5));
			batch.setJobLauncher			(rs.getString(6));
			batch.setReportJob				(rs.getString(7));
			batch.setCreateUser				(rs.getString(8));
			batch.setCreateTimestamp		(rs.getTimestamp(9));
			batch.setModifyUser				(rs.getString(10));
			batch.setModifyTimestamp		(rs.getTimestamp(11));
			
			return batch;
			
		}
	});
  }
/***********************************************************************************/
/***********************************************************************************/	
public void displayBatch (BatchBean batchBean) {
	
	System.out.println("BatchDaoImpl ---> ID 				= " + batchBean.getId()						);
	System.out.println("BatchDaoImpl ---> Batch Key 		= " + batchBean.getBatchKey()				);
	System.out.println("BatchDaoImpl ---> Context File 		= " + batchBean.getContextFile()			);
	System.out.println("BatchDaoImpl ---> Database Config 	= " + batchBean.getDatabaseConfiguration()	);
	System.out.println("BatchDaoImpl ---> Job Report 		= " + batchBean.getJobReport()				);
	System.out.println("BatchDaoImpl ---> Job Launcher 		= " + batchBean.getJobLauncher()			);
	System.out.println("BatchDaoImpl ---> Report Job 		= " + batchBean.getReportJob()				);
	
	System.out.println("BatchDaoImpl ---> CreateUser 		= " + batchBean.getCreateUser()				);
	System.out.println("BatchDaoImpl ---> CreateTimestamp	= " + batchBean.getCreateTimestamp()		);
	System.out.println("BatchDaoImpl ---> ModifyUser 		= " + batchBean.getModifyUser()				);
	System.out.println("BatchDaoImpl ---> ModifyTimestamp	= " + batchBean.getModifyTimestamp()		);
	
	}
}
