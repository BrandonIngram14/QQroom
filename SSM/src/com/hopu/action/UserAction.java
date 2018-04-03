package com.hopu.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hopu.bean.User;
import com.hopu.service.UserService;

@Controller
@RequestMapping("/")
public class UserAction {
	
	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//登录
	@RequestMapping("login")
	public ModelAndView login(User user,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		List list = userService.findUserByQQ(user);
		if(list.size() != 0) {
			session.setAttribute("user", list.get(0));
			/*User user1 = new User();*/
			SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String last = sf.format(new Date());
			user.setLasttime(last);
			userService.update(user);
			mav.setViewName("redirect:tz?name=index");
		}else {
			mav.addObject("login_error", "用户名或密码错误");
		}
		return mav;
	}
	
	//注册用户
	@RequestMapping("regist")
	public ModelAndView addUser(User user) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("register_suc");
		
		String qq = (System.currentTimeMillis()+"").substring(3,13); 
		user.setQq(qq);
		user.setHeadpic("../headpic/defaultheadpic.jpg");
		userService.addUser(user);
		
		mav.addObject("user", user);
		return mav;
	}
	//查找个人信息
	@RequestMapping("findUserById")
	public ModelAndView findUserById(User user) {
		ModelAndView mav = new ModelAndView();
		user = userService.findUserByid(user);
		mav.setViewName("redirect:tz?name=hostinfor");
		mav.addObject("user", user);
		
		return mav;
	}
	//修改用户信息
	@RequestMapping("updateUser")
	public ModelAndView updateUser(User user,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		User user1 = (User) session.getAttribute("user");
		user.setQq(user1.getQq());
		user.setHeadpic(user1.getHeadpic());
		user.setLasttime(user1.getLasttime());
		userService.update(user);
		mav.addObject("user", user);
		session.setAttribute("user", user);
		mav.setViewName("redirect:findUserById?userid="+user1.getUserid());
		return mav;
	}
	//修改密码
	@RequestMapping("updatepwd")
	public ModelAndView updatePwd(User user,HttpSession session,HttpServletRequest request) {
		ModelAndView mav= new ModelAndView();
		User user1 =(User) session.getAttribute("user");
		user.setQq(user1.getQq());
		userService.updatepwd(user);
		mav.setViewName("redirect:tz?name=login");
		return mav;
	}
	
	
	@RequestMapping("selectUser")
	public ModelAndView selectUser(String selectcontent,String selectmethod, User user) {
		ModelAndView mav= new ModelAndView();
		if(selectcontent!=null && selectmethod!=null) {
			if(selectmethod.equals("qq")) {
				mav.setViewName("forward:tz?name=askforfriend");
				user.setQq(selectcontent);
				List list = userService.selectUserByQQ(user);
				mav.addObject("userss", list);
				System.out.println(list);
			}else {
				mav.setViewName("forward:tz?name=askforfriend");
				user.setUsername("%"+selectcontent+"%");
				List list = userService.selectUserByName(user);
				mav.addObject("userss", list);
				System.out.println(list);
			}
		}
		
		return mav;
	}
	
	@RequestMapping("tz")
	public ModelAndView index(String name) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(name);
		return mav;
	}
	
}
