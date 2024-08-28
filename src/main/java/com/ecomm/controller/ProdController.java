package com.ecomm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ecomm.dto.Prod;
import com.ecomm.dto.ProdQuant;
import com.ecomm.dto.Quant;
import com.ecomm.repo.ProdRepo;
import com.ecomm.repo.QuantRepo;
import com.ecomm.service.ProdService;


import jakarta.transaction.Transactional;

@RestController
public class ProdController {
	
	@Autowired
	ProdService prodservice;
	@Autowired
	ProdRepo prodrepo;
	@Autowired
	QuantRepo Qrepo;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProdQuant(@RequestBody ProdQuant request ) {
		Prod prod =request.getProd();
		Quant quant =request.getQuant();
		prodservice.saveProdQuant(prod, quant);
		return ResponseEntity.ok("Product details saved successfully!");
		
	}
	@GetMapping("/getproduct")
	public ResponseEntity<Prod> getProductById(@RequestParam("id") int id) {
		java.util.Optional<Prod> product = prodrepo.findById(id);
		return ResponseEntity.ok(product.get());
	}

	@DeleteMapping("/deleteproduct")
	public ResponseEntity<String> deleteProductbyId(@RequestParam("id") int id) {
		Qrepo.deletequantity(id);
		prodrepo.deleteById(id);
		return ResponseEntity.ok("Product details deleted successfully!");
	}
	
	

}
