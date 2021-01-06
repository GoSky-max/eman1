package com.dragon.emanbonlist.pojo;

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

    @Override
    public String toString() {
        return "EmanList{" +
                "modleno=" + modleno +
                ", designer='" + designer + '\'' +
                ", leader='" + leader + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmanList emanList = (EmanList) o;

        if (modleno != null ? !modleno.equals(emanList.modleno) : emanList.modleno != null) return false;
        if (designer != null ? !designer.equals(emanList.designer) : emanList.designer != null) return false;
        if (leader != null ? !leader.equals(emanList.leader) : emanList.leader != null) return false;
        return status != null ? status.equals(emanList.status) : emanList.status == null;
    }

    @Override
    public int hashCode() {
        int result = modleno != null ? modleno.hashCode() : 0;
        result = 31 * result + (designer != null ? designer.hashCode() : 0);
        result = 31 * result + (leader != null ? leader.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}