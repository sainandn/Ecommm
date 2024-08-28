package com.ecomm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecomm.dto.Quant;

@Repository
public interface QuantRepo extends  JpaRepository<Quant, Integer> {

	
	@Modifying
	@Query(value = "DELETE FROM Quant where product_id=:productId", nativeQuery = true)
	void deletequantity(@Param("productId") Integer productId);

}
