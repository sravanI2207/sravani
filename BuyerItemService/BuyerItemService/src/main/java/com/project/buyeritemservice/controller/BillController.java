package com.project.buyeritemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.buyeritemservice.pojo.BillPojo;
import com.project.buyeritemservice.service.BillService;


@CrossOrigin
@RestController
@RequestMapping("emart")

public class BillController{
	
	@Autowired
	BillService billService; 
	
	@PostMapping("/bill")
	BillPojo saveBill(@RequestBody BillPojo billPojo)
	{
		return  billService.saveBill(billPojo);
		
	}
	
}
