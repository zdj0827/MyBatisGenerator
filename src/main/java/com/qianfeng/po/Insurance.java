package com.qianfeng.po;

public class Insurance {
    private Integer insId;

    private String insName;

    private String insDesc;

    private Byte insEfficacy;

    private Integer insCategory;

    private String insContent;

    private String insAge;

    private String insCharacter;

    private String insTime;

    private Integer insAmount;

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName == null ? null : insName.trim();
    }

    public String getInsDesc() {
        return insDesc;
    }

    public void setInsDesc(String insDesc) {
        this.insDesc = insDesc == null ? null : insDesc.trim();
    }

    public Byte getInsEfficacy() {
        return insEfficacy;
    }

    public void setInsEfficacy(Byte insEfficacy) {
        this.insEfficacy = insEfficacy;
    }

    public Integer getInsCategory() {
        return insCategory;
    }

    public void setInsCategory(Integer insCategory) {
        this.insCategory = insCategory;
    }

    public String getInsContent() {
        return insContent;
    }

    public void setInsContent(String insContent) {
        this.insContent = insContent == null ? null : insContent.trim();
    }

    public String getInsAge() {
        return insAge;
    }

    public void setInsAge(String insAge) {
        this.insAge = insAge == null ? null : insAge.trim();
    }

    public String getInsCharacter() {
        return insCharacter;
    }

    public void setInsCharacter(String insCharacter) {
        this.insCharacter = insCharacter == null ? null : insCharacter.trim();
    }

    public String getInsTime() {
        return insTime;
    }

    public void setInsTime(String insTime) {
        this.insTime = insTime == null ? null : insTime.trim();
    }

    public Integer getInsAmount() {
        return insAmount;
    }

    public void setInsAmount(Integer insAmount) {
        this.insAmount = insAmount;
    }
}