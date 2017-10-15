package com.hikuley.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hikuley.core.domain.MyEntity;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {

	
	
}
