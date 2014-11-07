package com.zac.util;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.cisco.util.DB;

public class DBTest {

	@Test
	public void test() {
		Connection conn=DB.getConn();
		String sql="select param_value1 from partner_incentive_parameter where param_name=?";
		PreparedStatement ps=DB.getstat(conn, sql);
		ResultSet rs=null;
		try {
			ps.setString(1, "quarter");
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DB.close(rs);
		DB.close(ps);
		DB.close(conn);
	}

}
