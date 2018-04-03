package com.hopu.service;

import java.util.List;

import com.hopu.bean.Feel;

public interface FeelService {
	
	//发表说说
	public void addFeel(Feel feel);
	
	//查询说说
	public List<Feel> findFeel(Feel feel);
}
