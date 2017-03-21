package com.test.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.PushRequestDAO;
import com.test.model.PushRequestEntity;

@Service
@Transactional
public class PushRequestServiceImpl implements PushRequestService {

	@Autowired
	private PushRequestDAO teamDAO;

	@Override
	public String add(Integer i1, Integer i2) {
		Objects.requireNonNull(i1);
		Objects.requireNonNull(i2);

		PushRequestEntity pushRequestEntity = new PushRequestEntity();
		pushRequestEntity.setI1(i1);
		pushRequestEntity.setI2(i2);
		teamDAO.save(pushRequestEntity);
		return "ok";
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> findAll() {
		List<PushRequestEntity> list = teamDAO.findAll();
		if (list != null) {
			List<Integer> liNew = new ArrayList<>(list.size() * 2);
			list.forEach(action -> {
				liNew.add(action.getI1());
				liNew.add(action.getI2());
			});
			return liNew;
		}
		return Collections.EMPTY_LIST;
	}

}
