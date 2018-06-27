package com.sunhongjiang.frontiercrops.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sunhongjiang.frontiercrops.entity.Apply;

@Service("ApplyService")
public interface ApplyService {
	// 审核
	void audit(Apply apply);

	// 查看具体某一项申请的详细信息
	Apply detail(String id);

	// 关键字查找符合条件的申请
	List<Apply> search(String applier, String title);

	// 查询所有申请
	List<Apply> searchAll();
}
