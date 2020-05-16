package com.icebns.pojo;

public class User {
    private Integer id;
    private String userName;
    private String password;
    private String realName;
    private Integer userType;
    private Integer docTitleid;
    private String isScheduling;
    private Integer deptId;
    private Integer delMark;
    private Integer registLeid;

    public Integer getRegistLeid() {
        return registLeid;
    }

    public void setRegistLeid(Integer registLeid) {
        this.registLeid = registLeid;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
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
