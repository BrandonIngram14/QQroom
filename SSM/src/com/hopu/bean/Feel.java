package com.hopu.bean;

public class Feel {
	
	private Integer feelid;
	private Integer userid;
	private String feeltime;
	private String feelcontent;
	private Integer type;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getFeelid() {
		return feelid;
	}
	public void setFeelid(Integer feelid) {
		this.feelid = feelid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getFeeltime() {
		return feeltime;
	}
	public void setFeeltime(String feeltime) {
		this.feeltime = feeltime;
	}
	public String getFeelcontent() {
		return feelcontent;
	}
	public void setFeelcontent(String feelcontent) {
		this.feelcontent = feelcontent;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Feel [feelid=" + feelid + ", userid=" + userid + ", feeltime=" + feeltime + ", feelcontent="
				+ feelcontent + ", type=" + type + ", user=" + user + "]";
	}
	
	

}
