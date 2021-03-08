package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.Controller;
import com.nt.dto.MobileDto;

@SpringBootApplication
public class ProjSbStoringMobileDataApplication {

	public static void main(String[] args) {
	List<MobileDto> listdto;
	ApplicationContext ctx=SpringApplication.run(ProjSbStoringMobileDataApplication.class, args);
Controller con=ctx.getBean("controller",Controller.class);
	
try {
   listdto=con.getAllRecord("Vivo");
   for ( MobileDto dto: listdto) {
	System.out.println(dto);
}
}
catch (Exception e) {
	e.printStackTrace();
}
	}

}
