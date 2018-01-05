package com.qianfeng.po;

import java.util.Date;

public class Policy {
    private Integer poId;

    private Integer poUser;

    private String poBene;

    private Integer poIns;

    private Date poDate;

    private Integer poExpire;

    private Integer poCharge;

    private Integer poAmends;

    private Byte poEfficacy;

    public Integer getPoId() {
        return poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public Integer getPoUser() {
        return poUser;
    }

    public void setPoUser(Integer poUser) {
        this.poUser = poUser;
    }

    public String getPoBene() {
        return poBene;
    }

    public void setPoBene(String poBene) {
        this.poBene = poBene == null ? null : poBene.trim();
    }

    public Integer getPoIns() {
        return poIns;
    }

    public void setPoIns(Integer poIns) {
        this.poIns = poIns;
    }

    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    public Integer getPoExpire() {
        return poExpire;
    }

    public void setPoExpire(Integer poExpire) {
        this.poExpire = poExpire;
    }

    public Integer getPoCharge() {
        return poCharge;
    }

    public void setPoCharge(Integer poCharge) {
        this.poCharge = poCharge;
    }

    public Integer getPoAmends() {
        return poAmends;
    }

    public void setPoAmends(Integer poAmends) {
        this.poAmends = poAmends;
    }

    public Byte getPoEfficacy() {
        return poEfficacy;
    }

    public void setPoEfficacy(Byte poEfficacy) {
        this.poEfficacy = poEfficacy;
    }
}