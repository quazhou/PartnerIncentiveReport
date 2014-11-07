package com.cisco.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cisco.model.Filter;
import com.cisco.util.DB;

@Service("partner_incentive_filter_service")
public class PartnerIncentiveFilterService {
	public List<Filter> load(String param) throws SQLException{
		ArrayList<Filter> al=new ArrayList<Filter>();
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
		return al;
	}
}
