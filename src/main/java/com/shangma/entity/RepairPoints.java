package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName t_repair_points
 */
@TableName(value ="t_repair_points")
public class RepairPoints implements Serializable {
    /**
     * 维修点id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 区域名
     */
    private String regional;

    /**
     * 公司名
     */
    private String companyName;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 电话
     */
    private String phone;

    /**
     * 占位
     */
    private String others;

    @TableField(exist = false)
    private static final long serialVersionUID = 1523454254524524525L;

    /**
     * 维修点id
     */
    public Long getId() {
        return id;
    }

    /**
     * 维修点id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 区域名
     */
    public String getRegional() {
        return regional;
    }

    /**
     * 区域名
     */
    public void setRegional(String regional) {
        this.regional = regional;
    }

    /**
     * 公司名
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 公司名
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 占位
     */
    public String getOthers() {
        return others;
    }

    /**
     * 占位
     */
    public void setOthers(String others) {
        this.others = others;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RepairPoints other = (RepairPoints) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegional() == null ? other.getRegional() == null : this.getRegional().equals(other.getRegional()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getOthers() == null ? other.getOthers() == null : this.getOthers().equals(other.getOthers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegional() == null) ? 0 : getRegional().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getOthers() == null) ? 0 : getOthers().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", regional=").append(regional);
        sb.append(", companyName=").append(companyName);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", others=").append(others);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}