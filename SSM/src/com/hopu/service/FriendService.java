package com.hopu.service;

import java.util.List;

import com.hopu.bean.Friend;
import com.hopu.bean.User;

public interface FriendService {
	
	//添加好友
	public void addFriend(Friend friend);
	
	//查找正常好友
	public List<User> findAllF(Friend friend);
	
	//查询好友信息
	public Friend findFriend(Friend friend);
	
	//修改好友状态
	public void updateFriend(Friend friend);
		
	//删除好友
	public void deleteFriend(Friend friend);
	
}
