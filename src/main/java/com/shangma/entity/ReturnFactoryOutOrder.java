package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_return_factory_out_order
 */
@TableName(value ="t_return_factory_out_order")
public class ReturnFactoryOutOrder implements Serializable {
    /**
     * 返厂出库单号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 返厂出库标志:0未出库1已出库
     */
    private Integer returnFactorySign;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 商品跟踪信息
     */
    private String orderTraceInformation;

    /**
     * 返厂配置
     */
    private String returnFactoryConfigure;

    /**
     * 返厂原因
     */
    private String returnFactoryCause;

    /**
     * 外观状态
     */
    private String appearanceState;

    /**
     * 备注
     */
    private String note;

    /**
     * 制单人
     */
    private String createBy;

    /**
     * 制单时间

     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 审批人
     */
    private String auditBy;

    /**
     * 审批时间
     */
    private Date auditTime;

    /**
     * 审批状态:0未通过1已通过2未审批
     */
    private Integer auditState;

    /**
     * 审批意见
     */
    private String auditAdvice;

    /**
     * 占位
     */
    private String others;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 返厂出库单号
     */
    public Long getId() {
        return id;
    }

    /**
     * 返厂出库单号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 返厂出库标志:0未出库1已出库
     */
    public Integer getReturnFactorySign() {
        return returnFactorySign;
    }

    /**
     * 返厂出库标志:0未出库1已出库
     */
    public void setReturnFactorySign(Integer returnFactorySign) {
        this.returnFactorySign = returnFactorySign;
    }

    /**
     * 商品id
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 商品id
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 商品跟踪信息
     */
    public String getOrderTraceInformation() {
        return orderTraceInformation;
    }

    /**
     * 商品跟踪信息
     */
    public void setOrderTraceInformation(String orderTraceInformation) {
        this.orderTraceInformation = orderTraceInformation;
    }

    /**
     * 返厂配置
     */
    public String getReturnFactoryConfigure() {
        return returnFactoryConfigure;
    }

    /**
     * 返厂配置
     */
    public void setReturnFactoryConfigure(String returnFactoryConfigure) {
        this.returnFactoryConfigure = returnFactoryConfigure;
    }

    /**
     * 返厂原因
     */
    public String getReturnFactoryCause() {
        return returnFactoryCause;
    }

    /**
     * 返厂原因
     */
    public void setReturnFactoryCause(String returnFactoryCause) {
        this.returnFactoryCause = returnFactoryCause;
    }

    /**
     * 外观状态
     */
    public String getAppearanceState() {
        return appearanceState;
    }

    /**
     * 外观状态
     */
    public void setAppearanceState(String appearanceState) {
        this.appearanceState = appearanceState;
    }

    /**
     * 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 制单人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 制单人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 制单时间

     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 制单时间

     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 更新人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 审批人
     */
    public String getAuditBy() {
        return auditBy;
    }

    /**
     * 审批人
     */
    public void setAuditBy(String auditBy) {
        this.auditBy = auditBy;
    }

    /**
     * 审批时间
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * 审批时间
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 审批状态:0未通过1已通过2未审批
     */
    public Integer getAuditState() {
        return auditState;
    }

    /**
     * 审批状态:0未通过1已通过2未审批
     */
    public void setAuditState(Integer auditState) {
        this.auditState = auditState;
    }

    /**
     * 审批意见
     */
    public String getAuditAdvice() {
        return auditAdvice;
    }

    /**
     * 审批意见
     */
    public void setAuditAdvice(String auditAdvice) {
        this.auditAdvice = auditAdvice;
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
        ReturnFactoryOutOrder other = (ReturnFactoryOutOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReturnFactorySign() == null ? other.getReturnFactorySign() == null : this.getReturnFactorySign().equals(other.getReturnFactorySign()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getOrderTraceInformation() == null ? other.getOrderTraceInformation() == null : this.getOrderTraceInformation().equals(other.getOrderTraceInformation()))
            && (this.getReturnFactoryConfigure() == null ? other.getReturnFactoryConfigure() == null : this.getReturnFactoryConfigure().equals(other.getReturnFactoryConfigure()))
            && (this.getReturnFactoryCause() == null ? other.getReturnFactoryCause() == null : this.getReturnFactoryCause().equals(other.getReturnFactoryCause()))
            && (this.getAppearanceState() == null ? other.getAppearanceState() == null : this.getAppearanceState().equals(other.getAppearanceState()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getAuditBy() == null ? other.getAuditBy() == null : this.getAuditBy().equals(other.getAuditBy()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditAdvice() == null ? other.getAuditAdvice() == null : this.getAuditAdvice().equals(other.getAuditAdvice()))
            && (this.getOthers() == null ? other.getOthers() == null : this.getOthers().equals(other.getOthers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReturnFactorySign() == null) ? 0 : getReturnFactorySign().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getOrderTraceInformation() == null) ? 0 : getOrderTraceInformation().hashCode());
        result = prime * result + ((getReturnFactoryConfigure() == null) ? 0 : getReturnFactoryConfigure().hashCode());
        result = prime * result + ((getReturnFactoryCause() == null) ? 0 : getReturnFactoryCause().hashCode());
        result = prime * result + ((getAppearanceState() == null) ? 0 : getAppearanceState().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getAuditBy() == null) ? 0 : getAuditBy().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditAdvice() == null) ? 0 : getAuditAdvice().hashCode());
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
        sb.append(", returnFactorySign=").append(returnFactorySign);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", orderTraceInformation=").append(orderTraceInformation);
        sb.append(", returnFactoryConfigure=").append(returnFactoryConfigure);
        sb.append(", returnFactoryCause=").append(returnFactoryCause);
        sb.append(", appearanceState=").append(appearanceState);
        sb.append(", note=").append(note);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", auditBy=").append(auditBy);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditState=").append(auditState);
        sb.append(", auditAdvice=").append(auditAdvice);
        sb.append(", others=").append(others);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}