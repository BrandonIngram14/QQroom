package com.hopu.bean;

import java.util.List;

public class Friend {
	
	private Integer fid;
	private Integer userid;
	private Integer friendid;
	private String addtime;
	private Integer state ;
	private String visittime;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getFriendid() {
		return friendid;
	}
	public void setFriendid(Integer friendid) {
		this.friendid = friendid;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getVisittime() {
		return visittime;
	}
	public void setVisittime(String visittime) {
		this.visittime = visittime;
	}
	
	@Override
	public String toString() {
		return "Friend [fid=" + fid + ", userid=" + userid + ", friendid=" + friendid + ", addtime=" + addtime
				+ ", state=" + state + ", visittime=" + visittime + "]";
	}
	
	
	
}
