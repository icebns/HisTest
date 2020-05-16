/**
 * 这是一个model 代表着数据库中的users表
 */
package model;

import entity.User;

public class UserBean {

	private long userId ; 
	private String username ; 
	private String passwd ;
	private String realName;
	private Integer userType;
	private Integer docTitleid;
	private String isScheduling;
	private Integer deptId;
	private Integer delMark;
	private Integer registLeid;

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getDelMark() {
		return delMark;
	}

	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}

	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public UserBean(long userId, String username, String passwd, Integer userType, Integer delMark) {
		super();
		this.userId = userId;
		this.username = username;
		this.passwd = passwd;
		this.userType = userType;
		this.delMark = delMark;

	}
//	public UserBeanShow(long userId, String username, String passwd, Integer userType, String delMark) {
//		super();
//		this.userId = userId;
//		this.username = username;
//		this.passwd = passwd;
//		this.userType = userType;
//		this.delMark = na;
//
//	}
//
//	public UserBeanNew(long userId, String username, String passwd) {
//		super();
//		this.userId = userId;
//		this.username = username;
//		this.passwd = passwd;
//	}

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User User(UserBean user) {
		// TODO Auto-generated method stub
		return null;
	}

}
