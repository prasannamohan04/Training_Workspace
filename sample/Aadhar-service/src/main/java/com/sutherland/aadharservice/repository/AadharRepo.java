package com.sutherland.aadharservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutherland.aadharservice.entity.AadharDetails;

@Repository
public interface AadharRepo extends JpaRepository<AadharDetails, String> {

}
