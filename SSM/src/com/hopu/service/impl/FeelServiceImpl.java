package com.hopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopu.bean.Feel;
import com.hopu.bean.User;
import com.hopu.mapper.FeelMapper;
import com.hopu.service.FeelService;

@Service
public class FeelServiceImpl implements FeelService {
	@Autowired
	private FeelMapper feelMapper; 
	
	public void setFeelMapper(FeelMapper feelMapper) {
		this.feelMapper = feelMapper;
	}

	//发表说说
	@Override
	public void addFeel(Feel feel) {
		// TODO Auto-generated method stub
		feelMapper.addFeel(feel);
	}

	@Override
	public List<Feel> findFeel(Feel feel) {
		// TODO Auto-generated method stub
		return feelMapper.findFeel(feel);
	}

}
