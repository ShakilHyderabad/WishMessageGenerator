package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.MobileBo;
import com.nt.dao.MobileDao;
import com.nt.dto.MobileDto;

@Service("ser")
public class MobileServiceImpl implements MobileService {
    @Autowired
	private MobileDao dao;
    
	@Override
	public List<MobileDto> getRecord(String name) throws Exception {
	 List<MobileDto> dtolist=null;
	 List<MobileBo> bolist=null;
	 dtolist=new ArrayList<MobileDto>();
	 //use the dao
	 bolist=dao.getAllRecordBasedOnName(name);
	 //convert bo to dto
	 for (MobileBo bo : bolist) {
      MobileDto dto=new MobileDto();
      dto.setId(bo.getId());
      dto.setCname(bo.getName());
      dto.setName(bo.getName());
	  dto.setPrice(bo.getPrice());
	  dtolist.add(dto);
	 }
	 
	 
	 
	 
	 
		return dtolist;
	}
	
    
    
	
}
