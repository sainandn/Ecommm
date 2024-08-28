package com.ecomm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomm.dto.Prod;
import com.ecomm.dto.Quant;
import com.ecomm.repo.ProdRepo;
import com.ecomm.repo.QuantRepo;


@Service
public class ProdService {
	
	@Autowired
	ProdRepo prodrepo;
	@Autowired
	QuantRepo quantrepo;
	
	public void saveProdQuant(Prod prod,Quant quant ) {
		 Prod savedprod = prodrepo.save(prod);
		quant.setProd(savedprod);
		quantrepo.save(quant);    
	}
	
	

}
