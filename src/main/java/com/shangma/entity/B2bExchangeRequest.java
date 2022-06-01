package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_b2b_exchange_request
 */
@TableName(value ="t_b2b_exchange_request")
public class B2bExchangeRequest implements Serializable {
    /**
     * 单据编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * B2b渠道名称
     */
    private String channelName;

    /**
     * 商品id
     */
    private Long goodsId;

    /**
     * 检修单号
     */
    private Long repairOrdersId;

    /**
     * 检修点id
     */
    private Long repairId;

    /**
     * 客户申请时间
     */
    private Date applicationTime;

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
     * 故障描述
     */
    private String failureDescription;

    /**
     * 备注
     */
    private String note;

    /**
     * 占位
     */
    private String others;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 单据编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 单据编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * B2b渠道名称
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * B2b渠道名称
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
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
     * 检修单号
     */
    public Long getRepairOrdersId() {
        return repairOrdersId;
    }

    /**
     * 检修单号
     */
    public void setRepairOrdersId(Long repairOrdersId) {
        this.repairOrdersId = repairOrdersId;
    }

    /**
     * 检修点id
     */
    public Long getRepairId() {
        return repairId;
    }

    /**
     * 检修点id
     */
    public void setRepairId(Long repairId) {
        this.repairId = repairId;
    }

    /**
     * 客户申请时间
     */
    public Date getApplicationTime() {
        return applicationTime;
    }

    /**
     * 客户申请时间
     */
    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
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
     * 故障描述
     */
    public String getFailureDescription() {
        return failureDescription;
    }

    /**
     * 故障描述
     */
    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
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
        B2bExchangeRequest other = (B2bExchangeRequest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChannelName() == null ? other.getChannelName() == null : this.getChannelName().equals(other.getChannelName()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getRepairOrdersId() == null ? other.getRepairOrdersId() == null : this.getRepairOrdersId().equals(other.getRepairOrdersId()))
            && (this.getRepairId() == null ? other.getRepairId() == null : this.getRepairId().equals(other.getRepairId()))
            && (this.getApplicationTime() == null ? other.getApplicationTime() == null : this.getApplicationTime().equals(other.getApplicationTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getAuditBy() == null ? other.getAuditBy() == null : this.getAuditBy().equals(other.getAuditBy()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditAdvice() == null ? other.getAuditAdvice() == null : this.getAuditAdvice().equals(other.getAuditAdvice()))
            && (this.getFailureDescription() == null ? other.getFailureDescription() == null : this.getFailureDescription().equals(other.getFailureDescription()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getOthers() == null ? other.getOthers() == null : this.getOthers().equals(other.getOthers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getRepairOrdersId() == null) ? 0 : getRepairOrdersId().hashCode());
        result = prime * result + ((getRepairId() == null) ? 0 : getRepairId().hashCode());
        result = prime * result + ((getApplicationTime() == null) ? 0 : getApplicationTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getAuditBy() == null) ? 0 : getAuditBy().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditAdvice() == null) ? 0 : getAuditAdvice().hashCode());
        result = prime * result + ((getFailureDescription() == null) ? 0 : getFailureDescription().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
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
        sb.append(", channelName=").append(channelName);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", repairOrdersId=").append(repairOrdersId);
        sb.append(", repairId=").append(repairId);
        sb.append(", applicationTime=").append(applicationTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", auditBy=").append(auditBy);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", auditState=").append(auditState);
        sb.append(", auditAdvice=").append(auditAdvice);
        sb.append(", failureDescription=").append(failureDescription);
        sb.append(", note=").append(note);
        sb.append(", others=").append(others);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}