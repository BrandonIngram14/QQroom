package com.hopu.service;

import java.util.List;

import com.hopu.bean.User;

public interface UserService {
	
	//ע��
	public void addUser(User user);
	
	//��¼
	public List<User> findUserByQQ(User user);
	
	//�޸�
	public void update(User user);
	
	//����id��ѯ�û���Ϣ
	public User findUserByid(User user);
	
	//�޸�����
	public void updatepwd(User user);
	
	//ͨ��qq�Ų���
	public List<User> selectUserByQQ(User user);
		
	//ͨ���ǳƲ�
	public List<User> selectUserByName(User user);
}
