package com.hikuley.core.service;

import java.util.Collection;

import com.hikuley.core.domain.MyEntity;

public interface EntityService {

	MyEntity save(MyEntity entity);
	
	MyEntity find(Long id);
	
	Collection<MyEntity> findAll();
	
}
