package com.hopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopu.bean.User;
import com.hopu.mapper.UserMapper;
import com.hopu.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	//зЂВс
	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
		
	}

	@Override
	public List<User> findUserByQQ(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUserByQQ(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

	@Override
	public User findUserByid(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUserByid(user);
	}

	@Override
	public void updatepwd(User user) {
		// TODO Auto-generated method stub
		userMapper.updatepwd(user);
	}

	@Override
	public List<User> selectUserByQQ(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByQQ(user);
	}

	@Override
	public List<User> selectUserByName(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByName(user);
	}
	

}
