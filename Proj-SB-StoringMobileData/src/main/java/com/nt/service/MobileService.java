package com.nt.service;

import java.util.List;

import com.nt.dto.MobileDto;

public interface MobileService {
	
	public List<MobileDto> getRecord(String name)throws Exception;

}
