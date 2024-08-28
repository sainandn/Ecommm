package com.ecomm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.dto.Ord;

@Repository
public interface OrdRepo extends JpaRepository<Ord, Integer>{
}
