package com.scs.atm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.scs.atm.services.TransactionEntityService;
@Controller
public class TransactionController {

	@Autowired
	TransactionEntityService services;
	

	@GetMapping("/a")
	public String index() {
		return "uploadpage";
	}
	@GetMapping("/")
	public String index2() {
		return "atm";
	}
}

