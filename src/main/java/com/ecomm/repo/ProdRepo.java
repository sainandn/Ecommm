package com.ecomm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.dto.Prod;
@Repository
public interface ProdRepo extends JpaRepository<Prod, Integer>{

}
