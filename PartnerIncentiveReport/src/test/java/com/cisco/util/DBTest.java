package com.cisco.util;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.cisco.model.PartnerResult;

public class DBTest {

	@Test
	public void test() throws Exception{
		ArrayList<PartnerResult> al=new ArrayList<PartnerResult>();
		Connection conn=DB.getConn();
		String sql="select * from partner_incentive_report where quarter=? ";
		PreparedStatement ps=DB.getstat(conn, sql);
		ResultSet rs=null;
		String quarter="";
		try {
			ps.setString(1, "Q1");
			rs=ps.executeQuery();
			if(rs.next()){
				PartnerResult pr=new PartnerResult();
				quarter=rs.getString(1);
				pr.setQuarter(quarter);
				pr.setYear(rs.getString(2));
				pr.setClawbackPeriod(rs.getInt(3));
				al.add(pr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw(e);
		}
		DB.close(rs);
		DB.close(ps);
		DB.close(conn);
		System.out.println(al.get(0).getQuarter());
	}

}
