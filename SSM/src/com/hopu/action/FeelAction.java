package com.hopu.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hopu.bean.Feel;
import com.hopu.bean.User;
import com.hopu.service.FeelService;
@Controller
@RequestMapping("/")
public class FeelAction {
	@Autowired
	private FeelService feelService;

	public void setFeelService(FeelService feelService) {
		this.feelService = feelService;
	}
	
	public ModelAndView findFeelById(Feel feel,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	//添加说说
	@RequestMapping("addFeel")
	public ModelAndView addFeel(Feel feel,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		//重定向到查询当前登录用户的说说
		mav.setViewName("redirect:findFeel");
		//0代表说说1代表留言板
		int type = 0;
		SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String last = sf.format(new Date());
		feel.setFeeltime(last);
		feel.setUserid(user.getUserid());
		feel.setType(type);
		feelService.addFeel(feel);
		mav.addObject("feel", feel);
		return mav;
	}
	
	@RequestMapping("findFeel")
	public ModelAndView findFeel(Feel feel,HttpSession session) {
		User user = (User) session.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		feel.setUserid(user.getUserid());
		
		List<Feel> list = feelService.findFeel(feel);
		
		mav.setViewName("forward:tz?name=feelindex");
		mav.addObject("feellist", list);
		System.out.println(list);
		return mav;
	}

}
