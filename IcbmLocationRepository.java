package com.yang.icbm.application.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IcbmLocationRepository extends JpaRepository<Location, Long>{
	Optional<Location> findByIcbmCode(Long icbmCode);
    Optional<Location> findByIcbmId(String icbmId);

   
}
