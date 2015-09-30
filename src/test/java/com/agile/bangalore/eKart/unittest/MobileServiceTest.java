package com.agile.bangalore.eKart.unittest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.agile.bangalore.ekart.dao.MobileDao;
import com.agile.bangalore.ekart.dao.MobileDaoImpl;
import com.agile.bangalore.ekart.entities.MobileDto;
import com.agile.bangalore.ekart.service.MobileService;
import com.agile.bangalore.ekart.service.MobileServiceImpl;




public class MobileServiceTest {
	
	private MobileDao mobileDao;
    private MobileService mobileService;
 
    @Before
    public void doSetup() {
    	
    }
    
	@Test
	public void addMobilesTest() {
		mobileDao = Mockito.mock(MobileDaoImpl.class);
		mobileService = new MobileServiceImpl(mobileDao);
		MobileDto mobileDto = new MobileDto();
		mobileDto.setMobileManufactureDate(new Date(2014, 3, 5));
		mobileDto.setMobileName("Samsung");
		double price = 1000.00;
		mobileDto.setPrice(price);
		mobileDto.setDescription("Android Kitkat Toch Phone");
		mobileService.addmobile(mobileDto);
		Mockito.verify(mobileDao).addMobile(mobileDto);
	}
}
