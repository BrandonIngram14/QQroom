package com.hopu.bean;

public class User {
	
	private Integer userid; //id
	private String qq;  //qq 
	private String username;//昵称
	private String password;//密码
	private String headpic; //头像
	private Integer sex; //性别
	private Integer ismarry; //婚姻状况
	private String birthday; //生日
	private String hometown; //家乡
	private String nowaddress; //现住地
	private String lasttime;
	
	public String getLasttime() {
		return lasttime;
	}
	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHeadpic() {
		return headpic;
	}
	public void setHeadpic(String headpic) {
		this.headpic = headpic;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getIsmarry() {
		return ismarry;
	}
	public void setIsmarry(Integer ismarry) {
		this.ismarry = ismarry;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public String getNowaddress() {
		return nowaddress;
	}
	public void setNowaddress(String nowaddress) {
		this.nowaddress = nowaddress;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", qq=" + qq + ", username=" + username + ", password=" + password
				+ ", headpic=" + headpic + ", sex=" + sex + ", ismarry=" + ismarry + ", birthday=" + birthday
				+ ", hometown=" + hometown + ", nowaddress=" + nowaddress + ", lasttime=" + lasttime + "]";
	}
	
}
