package com.nt.dao;

import java.util.List;

import com.nt.bo.MobileBo;

public interface MobileDao {
	
	public List<MobileBo> getAllRecordBasedOnName(String name)throws Exception ;
	

}
