package com.sunhongjiang.frontiercrops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunhongjiang.frontiercrops.entity.Apply;
import com.sunhongjiang.frontiercrops.service.ApplyService;

@Controller
@RequestMapping("/apply")
public class ApplyController {
	@Autowired
	private ApplyService applyService;

	@RequestMapping("/manage")
	public String applyMange(Model model) {
		List<Apply> manageList = applyService.searchAll();
		model.addAttribute("manageList", manageList);
		return "ApplyManage";
	}

	@RequestMapping("/info")
	public String applyInfo(String id, Model model) {
		Apply applyInfo = applyService.detail(id);
		model.addAttribute("applyInfo", applyInfo);
		return "ApplyInfo";
	}
}
