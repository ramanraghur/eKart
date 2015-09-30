/**
 * 
 */
package com.agile.bangalore.ekart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agile.bangalore.ekart.dao.MobileDao;
import com.agile.bangalore.ekart.entities.MobileDto;

/**
 * @author Raghuraman.r
 *
 */
@Service("mobileService")
@Transactional
public class MobileServiceImpl implements MobileService{

	private MobileDao mobileDao;
	@Autowired
	public MobileServiceImpl(MobileDao mobileDao)
	{
		this.mobileDao = mobileDao;
	}
	public void addmobile(MobileDto mobileDto) {

		mobileDao.addMobile(mobileDto);
		
	}


	public List<MobileDto> getAllMobile() {
		List<MobileDto> mobileList= mobileDao.getAllMobiles();
		return mobileList;
	}

}
