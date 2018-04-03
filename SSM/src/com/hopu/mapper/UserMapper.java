package com.hopu.mapper;

import java.util.List;

import com.hopu.bean.User;

public interface UserMapper {
	
	//注册
	public void addUser(User user);
	
	//登录
	public List<User> findUserByQQ(User user);
	
	//根据id查询用户信息
	public User findUserByid(User user);
	
	//修改
	public void update(User user);
	
	//修改密码
	public void updatepwd(User user);
	
	//通过qq号查找
	public List<User> selectUserByQQ(User user);
	
	//通过昵称查
	public List<User> selectUserByName(User user);
	
}
