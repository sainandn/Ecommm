package com.ecomm.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Quant")
public class Quant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int QuantityID;
	String ProductName ;
	int Quantity ;
	
	@ManyToOne
	@JoinColumn(name = "ProductID")
	Prod prod;
}
