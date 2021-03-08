package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.MobileBo;

@Repository("dao")
public class MobileDaoImpl implements MobileDao{
	private static String getQuery="select id,name,model,price from mobiledata where name=?";
	@Autowired
	private DataSource ds;
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;



	@Override
	public List<MobileBo> getAllRecordBasedOnName(String name) throws Exception {
		MobileBo bo=null;
		List<MobileBo> bolist;
		bolist=new ArrayList<MobileBo>();
		//get connection obejcct
		con=ds.getConnection();
		//send the sql query for compilation
		ps=con.prepareStatement(getQuery);
		ps.setString(1,name);
		//sent the sql query for execution
		rs=ps.executeQuery();
		//get record
		while(rs.next()) { 
        bo=new MobileBo();
        bo.setId(rs.getInt(1));
        bo.setCname(rs.getString(2));
        bo.setName(rs.getString(3));
        bo.setPrice(rs.getInt(4));
	     bolist.add(bo);
	    }//while 
		return bolist;

	}
}