package com.ecomm.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdQuant {
	
	public Prod prod;
	public Quant quant;
	
	public void ProdQuantRequest (Prod prod,Quant quant) {
		this.prod=prod;
		this.quant= quant;
		
	}
	

}
