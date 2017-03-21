package com.test.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.PushRequestEntity;

@Repository
@Transactional
public class PushRequestDAOImpl implements PushRequestDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(PushRequestEntity pushRequestEntity) {
		getCurrentSession().save(pushRequestEntity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PushRequestEntity> findAll() {
		return (List<PushRequestEntity>)getCurrentSession().getNamedQuery(PushRequestEntity.GET_ALL_RECORD).list();
	}

}
