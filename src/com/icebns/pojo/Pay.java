package com.icebns.pojo;

public class Pay {
    private Integer costId;
    private String caseNumber;
    private String realName;
    private String costName;
    private Integer costPay;
    private Integer costNumber;
    private String costTime;
    private String costState;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCostName() {
        return costName;
    }

    public void setCostName(String costName) {
        this.costName = costName;
    }

    public Integer getCostPay() {
        return costPay;
    }

    public void setCostPay(Integer costPay) {
        this.costPay = costPay;
    }

    public Integer getCostNumber() {
        return costNumber;
    }

    public void setCostNumber(Integer costNumber) {
        this.costNumber = costNumber;
    }
    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    public String getCostState() {
        return costState;
    }

    public void setCostState(String costState) {
        this.costState = costState;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "costId=" + costId +
                ", caseNumber='" + caseNumber + '\'' +
                ", realName='" + realName + '\'' +
                ", costName='" + costName + '\'' +
                ", costPay=" + costPay +
                ", costNumber=" + costNumber +
                ", costTime='" + costTime + '\'' +
                ", costState='" + costState + '\'' +
                '}';
    }
}
