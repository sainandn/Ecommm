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
@Table(name="ord")
public class Ord {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int OrderID ;
	private int OrderQuantity ;
	
	@ManyToOne
	@JoinColumn(name = "ProductID")
	private Prod prod;

}
