package com.agile.bangalore.ekart.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.agile.bangalore.ekart.entities.MobileDto;
@Repository("mobileDao")
public class MobileDaoImpl  extends AbstractDao<Integer, MobileDto> implements  MobileDao{

	
	public void addMobile(MobileDto mobileDto) {
		persist(mobileDto);
	}

	
	@SuppressWarnings("unchecked")
	public List<MobileDto> getAllMobiles() {
		Criteria criteria = createEntityCriteria();
		return (List<MobileDto>) criteria.list();
	}

}
