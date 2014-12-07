package com.cisco.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.cisco.dto.Filter;
import com.cisco.model.PartnerResult;
import com.cisco.util.DB;

@Service("partner_incentive_filter_service")
public class PartnerIncentiveFilterService {
	
	private static HashMap<String,String> sqlMap=new HashMap<String,String>();
	private JdbcTemplate jdbcTempate;
	
	static{
		sqlMap.put("year", "select distinct cisco_fiscal_year from DW_DATE_DIM_CISCO_CALENDAR where cisco_fiscal_year>2013 order by cisco_fiscal_year");
		sqlMap.put("quarter", "select 'Q1-Q2' from dual " +
				"union all " +
				"select 'Q3-Q4' from dual " +
				"union all " +
				"select 'Q1' from dual "+
				"union all "+
				"select 'Q2' from dual "+
				"union all "+
				"select 'Q3' from dual "+
				"union all "+
				"select 'Q4' from dual");
	}
	public JdbcTemplate getJdbcTempate() {
		return jdbcTempate;
	}
	
	@Resource(name="jdbcTemplate")
	public void setJdbcTempate(JdbcTemplate jdbcTempate) {
		this.jdbcTempate = jdbcTempate;
	}
	
	public List<Filter> load(String param) throws SQLException{
		/*ArrayList<Filter> al=new ArrayList<Filter>();
		Connection conn=DB.getConn();
		String sql="select distinct param_value1 from partner_incentive_parameter where param_name=?";
		PreparedStatement ps=DB.getstat(conn, sql);
		ResultSet rs=null;
		String value="";
		try {
			ps.setString(1, param);
			rs=ps.executeQuery();
			if(rs.next()){
				Filter f=new Filter();
				value=rs.getString(1);
				f.setVal(value);
				al.add(f);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw(e);
		}
		DB.close(rs);
		DB.close(ps);
		DB.close(conn);
		return al;*/
		String sql = sqlMap.get(param);
		List<Filter> filters;
		if(param=="year"){
		filters=jdbcTempate.query(sql, new RowMapper<Filter>(){
			public Filter<Integer> mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Filter<Integer> f =new Filter<Integer>();
				f.setVal(rs.getInt(1));
				return f;
			}
		});}
		else{
		filters=jdbcTempate.query(sql, new RowMapper<Filter>(){
			public Filter<String> mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Filter<String> f =new Filter<String>();
				f.setVal(rs.getString(1));
				return f;
			}
		});
		}
		return filters;
	}
}
