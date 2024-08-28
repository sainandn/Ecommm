package com.ecomm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecomm.dto.Prod;
import com.ecomm.dto.ProdQuant;
import com.ecomm.dto.Quant;
import com.ecomm.service.ProdService;

@RestController
public class ProdController {
	
	@Autowired
	ProdService prodservice;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProdQuant(@RequestBody ProdQuant request ) {
		Prod prod =request.getProd();
		Quant quant =request.getQuant();
		prodservice.saveProdQuant(prod, quant);
		return ResponseEntity.ok("Product details saved successfully!");
		
	}
	
	

}
