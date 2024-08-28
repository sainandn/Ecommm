package com.ecomm.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="prod")
public class Prod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ProductID ;
	String ProductCategory ;
	String	ProductName ;
	String ProductDescription ;
	double ProductPrice ;
	double ProductCost ;
	@Column(name = "current_stock")
	private int currentStock;

	@Column(name = "reorder_level")
	private int reorderLevel;

	@Column(name = "reorder_quantity")
	private int reorderQuantity;
	
}
