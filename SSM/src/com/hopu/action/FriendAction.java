package com.hopu.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hopu.bean.Friend;
import com.hopu.bean.User;
import com.hopu.service.FriendService;

@Controller
@RequestMapping("/")
public class FriendAction {

	@Autowired
	private FriendService friendService;

	public void setFriendService(FriendService friendService) {
		this.friendService = friendService;
	}
	//��Ӻ���
	@RequestMapping("addFriend")
	public ModelAndView addFriend(Friend friend, HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav= new ModelAndView();
		SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String add = sf.format(new Date());

		friend.setUserid(friend.getFriendid());
		friend.setFriendid(user.getUserid());
		friend.setAddtime(add);
		friend.setState(0); //0�����ͬ�����
		friendService.addFriend(friend);
		
		mav.setViewName("redirect:findF");
		return mav;
	}

	//���Һ���
	@RequestMapping("findF")
	public ModelAndView findF(Friend friend,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("forward:tz?name=showfriends");
		friend.setUserid(user.getUserid());

		friend.setState(1);//1������������

		List<User> list =friendService.findAllF(friend);
		System.out.println(list);
		mav.addObject("friends", list);
		
		friend.setState(2);//2�������ں���

		List<User> lahei =friendService.findAllF(friend);
		System.out.println(lahei);
		mav.addObject("lahei", lahei);
		
		friend.setState(0);//0�������Ӻ���
		
		friend.setUserid(user.getUserid());
		List<User> qingqiu =friendService.findAllF(friend);
		System.out.println(qingqiu);
		mav.addObject("qingqiu", qingqiu);
		return mav;
	}
	
	//��ѯ������Ϣ
	@RequestMapping("findFriend")
	public ModelAndView findFriend(Friend friend,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav= new ModelAndView();
		friend.setUserid(user.getUserid());
		friend = friendService.findFriend(friend);
		mav.setViewName("forward:tz?name=friendinfo");
		mav.addObject("friend", friend);
		return mav;
	}
	
	//ɾ������
	@RequestMapping("deleteFriend")
	public ModelAndView deleteFriend(Friend friend,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		friend.setUserid(user.getUserid());
		friendService.deleteFriend(friend);
		mav.setViewName("redirect:findF");
		return mav;
	}
	
	//���ں���
	@RequestMapping("blackFriend")
	public ModelAndView blackFriend(Friend friend,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		friend.setUserid(user.getUserid());
		friend.setState(2);
		friendService.updateFriend(friend);
		mav.setViewName("redirect:findF");
		return mav;
	}
	
	//�ָ�����
	@RequestMapping("backFriend")
	public ModelAndView backFriend(Friend friend,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		friend.setUserid(user.getUserid());
		friend.setState(1);
		friendService.updateFriend(friend);
		mav.setViewName("redirect:findF");
		return mav;
	}
	
	//ͬ���������
	@RequestMapping("okFriend")
	public ModelAndView okFriend(Friend friend,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		friend.setUserid(user.getUserid());
		int userid = friend.getFriendid();
		/*friend.setUserid(friendid);
		int userid = friend.getFriendid();
		friend.setFriendid(userid);
		System.out.println("---------"+userid);*/
		friend.setState(1);
		friendService.updateFriend(friend);
		
		SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String add = sf.format(new Date());
	
		/*friend.setFriendid(friendid);
		System.out.println(user.getUserid());*/
		Friend friend2 = new Friend();
		friend2.setFriendid(user.getUserid());
		friend2.setUserid(userid);
		friend2.setState(1);
		friend2.setAddtime(add);
		friendService.addFriend(friend2);
		
		
		
		mav.setViewName("redirect:findF");
		return mav;
	}
	//�ܾ���������
	@RequestMapping("noFriend")
	public ModelAndView noFriend(Friend friend,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		
		friend.setFriendid(user.getUserid());
		friendService.deleteFriend(friend);
		mav.setViewName("redirect:findF");
		
		return mav;
	}
	
}
