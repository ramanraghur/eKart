package com.agile.bangalore.ekart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.agile.bangalore.ekart.entities.MobileDto;
import com.agile.bangalore.ekart.service.MobileService;

@Controller
@RequestMapping("/")
public class MobileController {

	@Autowired
	MobileService mobileService;
	
	@Autowired
	MessageSource messageSource;

	
	@RequestMapping(value = { "/", "/listMobiles" }, method = RequestMethod.GET)
	public String listAllMobiles(ModelMap model) {

		List<MobileDto> mobiles = mobileService.getAllMobile();
		model.addAttribute("mobiles", mobiles);
		return "allmobiles";
	}

	
	@RequestMapping(value = { "/addMobile" }, method = RequestMethod.GET)
	public String addMobile(ModelMap model) {
		MobileDto mobileDto = new MobileDto();
		model.addAttribute("mobile", mobileDto);
		return "mobileAdd";
	}

	
	@RequestMapping(value = { "/addMobile" }, method = RequestMethod.POST)
	public String saveMobile( @ModelAttribute("mobile") MobileDto mobile, ModelMap model) {

		mobileService.addmobile(mobile);
		model.addAttribute("success","Mobile added successfully");
		return "success";
	}

}
