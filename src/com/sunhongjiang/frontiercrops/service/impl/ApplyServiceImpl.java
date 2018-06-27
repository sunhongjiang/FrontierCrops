package com.sunhongjiang.frontiercrops.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunhongjiang.frontiercrops.dao.ApplyDao;
import com.sunhongjiang.frontiercrops.entity.Apply;
import com.sunhongjiang.frontiercrops.service.ApplyService;

@Transactional
@Service("ApplyService")
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private ApplyDao applyDao;

	@Override
	public void audit(Apply apply) {
		this.applyDao.audit(apply);
	}

	@Override
	public Apply detail(String id) {
		return this.applyDao.detail(id);
	}

	@Override
	public List<Apply> search(String applier, String title) {
		return this.applyDao.search(applier, title);
	}

	@Override
	public List<Apply> searchAll() {
		return this.applyDao.searchAll();
	}

}
