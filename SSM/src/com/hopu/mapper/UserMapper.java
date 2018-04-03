package com.hopu.mapper;

import java.util.List;

import com.hopu.bean.User;

public interface UserMapper {
	
	//ע��
	public void addUser(User user);
	
	//��¼
	public List<User> findUserByQQ(User user);
	
	//����id��ѯ�û���Ϣ
	public User findUserByid(User user);
	
	//�޸�
	public void update(User user);
	
	//�޸�����
	public void updatepwd(User user);
	
	//ͨ��qq�Ų���
	public List<User> selectUserByQQ(User user);
	
	//ͨ���ǳƲ�
	public List<User> selectUserByName(User user);
	
}
