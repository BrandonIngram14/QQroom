package com.hopu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopu.bean.Friend;
import com.hopu.bean.User;
import com.hopu.mapper.FriendMapper;
import com.hopu.service.FriendService;
@Service
public class FriendServiceImpl implements FriendService {
	@Autowired
	private FriendMapper friendMapper;
	
	public void setFriendMapper(FriendMapper friendMapper) {
		this.friendMapper = friendMapper;
	}

	@Override
	public void addFriend(Friend friend) {
		// TODO Auto-generated method stub
		friendMapper.addFriend(friend);
	}

	@Override
	public List<User> findAllF(Friend friend) {
		// TODO Auto-generated method stub
		return friendMapper.findAllF(friend);
	}

	@Override
	public Friend findFriend(Friend friend) {
		// TODO Auto-generated method stub
		return friendMapper.findFriend(friend);
	}

	@Override
	public void updateFriend(Friend friend) {
		// TODO Auto-generated method stub
		friendMapper.updateFriend(friend);
	}

	@Override
	public void deleteFriend(Friend friend) {
		// TODO Auto-generated method stub
		friendMapper.deleteFriend(friend);
	}

}
