package com.agile.bangalore.ekart.service;

import java.util.List;

import com.agile.bangalore.ekart.entities.MobileDto;

public interface MobileService {
	
	void addmobile(MobileDto mobileDto);
	
	
	
	List<MobileDto> getAllMobile();

}
