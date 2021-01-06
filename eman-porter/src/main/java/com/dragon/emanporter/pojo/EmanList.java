package com.dragon.emanporter.pojo;

public class EmanList {
    private Integer modleno;

    private String designer;

    private String leader;

    private Integer status;

    public Integer getModleno() {
        return modleno;
    }

    public void setModleno(Integer modleno) {
        this.modleno = modleno;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer == null ? null : designer.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}