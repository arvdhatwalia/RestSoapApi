package com.test.dao;

import java.util.List;

import com.test.model.PushRequestEntity;

public interface PushRequestDAO {

	void save(PushRequestEntity pushRequestEntity);

	List<PushRequestEntity> findAll();
	
}
