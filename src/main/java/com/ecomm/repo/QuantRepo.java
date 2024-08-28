package com.ecomm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.dto.Quant;

@Repository
public interface QuantRepo extends  JpaRepository<Quant, Integer> {

}
