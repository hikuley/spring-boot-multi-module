package com.hikuley.core.service;

import java.util.Collection;

import com.hikuley.core.domain.MyEntity;
import com.hikuley.core.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyEntityServiceImpl implements EntityService {
	
	@Autowired
	private MyEntityRepository repository;
	
	@Override
	@Transactional(readOnly = false)
	public MyEntity save(MyEntity entity) {
		return repository.save(entity);
	}

	@Override
	public MyEntity find(Long id) {
		return repository.findOne(id);
	}

	@Override
	public Collection<MyEntity> findAll() {
		return repository.findAll();
	}
	
}
