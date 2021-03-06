package com.glqdlt.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glqdlt.persistence.entity.CrawRawDataEntity;
import com.glqdlt.persistence.service.CrawDataService;

@Controller
public class MainController {

	
	@Autowired
	CrawDataService cJobService;
	
	
	@RequestMapping("/")
	public String index(Model model) {
		
		List<CrawRawDataEntity> result = cJobService.getAllRawData();
		Collections.reverse(result);

		model.addAttribute("list",result);
		return "index";

	}

	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
