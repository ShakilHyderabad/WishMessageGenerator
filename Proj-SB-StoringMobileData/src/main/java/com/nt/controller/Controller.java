package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dto.MobileDto;
import com.nt.service.MobileService;

@Component("controller")
public class Controller {
  @Autowired	
  private MobileService ser; 
	
 public List<MobileDto> getAllRecord(String name)throws Exception{
	 List<MobileDto> listdto;
	 listdto=ser.getRecord(name); 
	 
	 return listdto;
 }
	
}
