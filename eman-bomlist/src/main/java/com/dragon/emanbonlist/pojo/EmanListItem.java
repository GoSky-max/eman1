package com.dragon.emanbonlist.pojo;

public class EmanListItem {
    private Integer modleno;

    private String no;

    private String description;

    private Integer num;

    private String materail;

    private String remark;

    private Double price;

    private Double totelprice;

    public Integer getModleno() {
        return modleno;
    }

    public void setModleno(Integer modleno) {
        this.modleno = modleno;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getMaterail() {
        return materail;
    }

    public void setMaterail(String materail) {
        this.materail = materail == null ? null : materail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotelprice() {
        return totelprice;
    }

    public void setTotelprice(Double totelprice) {
        this.totelprice = totelprice;
    }
}