package entity;

public class User { 
	
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

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Integer getDocTitleid() {
		return docTitleid;
	}

	public void setDocTitleid(Integer docTitleid) {
		this.docTitleid = docTitleid;
	}

	public String getIsScheduling() {
		return isScheduling;
	}

	public void setIsScheduling(String isScheduling) {
		this.isScheduling = isScheduling;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getDelMark() {
		return delMark;
	}

	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}

	public Integer getRegistLeid() {
		return registLeid;
	}

	public void setRegistLeid(Integer registLeid) {
		this.registLeid = registLeid;
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

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", username='" + username + '\'' +
				", passwd='" + passwd + '\'' +
				", realName='" + realName + '\'' +
				", userType=" + userType +
				", docTitleid=" + docTitleid +
				", isScheduling='" + isScheduling + '\'' +
				", deptId=" + deptId +
				", delMark=" + delMark +
				", registLeid=" + registLeid +
				'}';
	}
}
