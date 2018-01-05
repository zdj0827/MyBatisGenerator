package com.qianfeng.po;

import java.util.Date;

public class Customer {
    private Integer cusId;

    private String cusName;

    private String cusPassword;

    private Date cusBirthday;

    private Integer cusAge;

    private Long cusPhone;

    private String cusAddress;

    private Byte cusEfficacy;

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusPassword() {
        return cusPassword;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword == null ? null : cusPassword.trim();
    }

    public Date getCusBirthday() {
        return cusBirthday;
    }

    public void setCusBirthday(Date cusBirthday) {
        this.cusBirthday = cusBirthday;
    }

    public Integer getCusAge() {
        return cusAge;
    }

    public void setCusAge(Integer cusAge) {
        this.cusAge = cusAge;
    }

    public Long getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(Long cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress == null ? null : cusAddress.trim();
    }

    public Byte getCusEfficacy() {
        return cusEfficacy;
    }

    public void setCusEfficacy(Byte cusEfficacy) {
        this.cusEfficacy = cusEfficacy;
    }
}