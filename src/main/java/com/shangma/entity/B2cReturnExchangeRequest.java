package com.shangma.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_b2c_return_exchange_request
 */
@TableName(value ="t_b2c_return_exchange_request")
public class B2cReturnExchangeRequest implements Serializable {
    /**
     * 单据编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 订单编号
     */
    private Long orderId;

    /**
     * 申诉记录名称（销售）
     */
    private String grievanceRecordsName;

    /**
     * 申诉来源
     */
    private String sourceOfComplaint;

    /**
     * 申诉记录描述
     */
    private String grievanceRecordsDescription;

    /**
     * 换货部件名称
     */
    private String partsName;

    /**
     * 退换货原因（客户）
     */
    private String exchangeCause;

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
     * 退换新商品id
     */
    private Long newGoodsId;

    /**
     * 客服答复意见
     */
    private String reply;

    /**
     * 客服答复日期
     */
    private Date replyTime;

    /**
     * 客服二次答复意见
     */
    private String secondaryReply;

    /**
     * 客服二次答复日期：
     */
    private Date secondaryReplyTime;

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
     * 审批状态:0未通过1已通过2未审批3未入库4已入库
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
     * 订单编号
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单编号
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 申诉记录名称（销售）
     */
    public String getGrievanceRecordsName() {
        return grievanceRecordsName;
    }

    /**
     * 申诉记录名称（销售）
     */
    public void setGrievanceRecordsName(String grievanceRecordsName) {
        this.grievanceRecordsName = grievanceRecordsName;
    }

    /**
     * 申诉来源
     */
    public String getSourceOfComplaint() {
        return sourceOfComplaint;
    }

    /**
     * 申诉来源
     */
    public void setSourceOfComplaint(String sourceOfComplaint) {
        this.sourceOfComplaint = sourceOfComplaint;
    }

    /**
     * 申诉记录描述
     */
    public String getGrievanceRecordsDescription() {
        return grievanceRecordsDescription;
    }

    /**
     * 申诉记录描述
     */
    public void setGrievanceRecordsDescription(String grievanceRecordsDescription) {
        this.grievanceRecordsDescription = grievanceRecordsDescription;
    }

    /**
     * 换货部件名称
     */
    public String getPartsName() {
        return partsName;
    }

    /**
     * 换货部件名称
     */
    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    /**
     * 退换货原因（客户）
     */
    public String getExchangeCause() {
        return exchangeCause;
    }

    /**
     * 退换货原因（客户）
     */
    public void setExchangeCause(String exchangeCause) {
        this.exchangeCause = exchangeCause;
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
     * 退换新商品id
     */
    public Long getNewGoodsId() {
        return newGoodsId;
    }

    /**
     * 退换新商品id
     */
    public void setNewGoodsId(Long newGoodsId) {
        this.newGoodsId = newGoodsId;
    }

    /**
     * 客服答复意见
     */
    public String getReply() {
        return reply;
    }

    /**
     * 客服答复意见
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * 客服答复日期
     */
    public Date getReplyTime() {
        return replyTime;
    }

    /**
     * 客服答复日期
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * 客服二次答复意见
     */
    public String getSecondaryReply() {
        return secondaryReply;
    }

    /**
     * 客服二次答复意见
     */
    public void setSecondaryReply(String secondaryReply) {
        this.secondaryReply = secondaryReply;
    }

    /**
     * 客服二次答复日期：
     */
    public Date getSecondaryReplyTime() {
        return secondaryReplyTime;
    }

    /**
     * 客服二次答复日期：
     */
    public void setSecondaryReplyTime(Date secondaryReplyTime) {
        this.secondaryReplyTime = secondaryReplyTime;
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
     * 审批状态:0未通过1已通过2未审批3未入库4已入库
     */
    public Integer getAuditState() {
        return auditState;
    }

    /**
     * 审批状态:0未通过1已通过2未审批3未入库4已入库
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
        B2cReturnExchangeRequest other = (B2cReturnExchangeRequest) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getGrievanceRecordsName() == null ? other.getGrievanceRecordsName() == null : this.getGrievanceRecordsName().equals(other.getGrievanceRecordsName()))
            && (this.getSourceOfComplaint() == null ? other.getSourceOfComplaint() == null : this.getSourceOfComplaint().equals(other.getSourceOfComplaint()))
            && (this.getGrievanceRecordsDescription() == null ? other.getGrievanceRecordsDescription() == null : this.getGrievanceRecordsDescription().equals(other.getGrievanceRecordsDescription()))
            && (this.getPartsName() == null ? other.getPartsName() == null : this.getPartsName().equals(other.getPartsName()))
            && (this.getExchangeCause() == null ? other.getExchangeCause() == null : this.getExchangeCause().equals(other.getExchangeCause()))
            && (this.getRepairOrdersId() == null ? other.getRepairOrdersId() == null : this.getRepairOrdersId().equals(other.getRepairOrdersId()))
            && (this.getRepairId() == null ? other.getRepairId() == null : this.getRepairId().equals(other.getRepairId()))
            && (this.getApplicationTime() == null ? other.getApplicationTime() == null : this.getApplicationTime().equals(other.getApplicationTime()))
            && (this.getNewGoodsId() == null ? other.getNewGoodsId() == null : this.getNewGoodsId().equals(other.getNewGoodsId()))
            && (this.getReply() == null ? other.getReply() == null : this.getReply().equals(other.getReply()))
            && (this.getReplyTime() == null ? other.getReplyTime() == null : this.getReplyTime().equals(other.getReplyTime()))
            && (this.getSecondaryReply() == null ? other.getSecondaryReply() == null : this.getSecondaryReply().equals(other.getSecondaryReply()))
            && (this.getSecondaryReplyTime() == null ? other.getSecondaryReplyTime() == null : this.getSecondaryReplyTime().equals(other.getSecondaryReplyTime()))
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
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getGrievanceRecordsName() == null) ? 0 : getGrievanceRecordsName().hashCode());
        result = prime * result + ((getSourceOfComplaint() == null) ? 0 : getSourceOfComplaint().hashCode());
        result = prime * result + ((getGrievanceRecordsDescription() == null) ? 0 : getGrievanceRecordsDescription().hashCode());
        result = prime * result + ((getPartsName() == null) ? 0 : getPartsName().hashCode());
        result = prime * result + ((getExchangeCause() == null) ? 0 : getExchangeCause().hashCode());
        result = prime * result + ((getRepairOrdersId() == null) ? 0 : getRepairOrdersId().hashCode());
        result = prime * result + ((getRepairId() == null) ? 0 : getRepairId().hashCode());
        result = prime * result + ((getApplicationTime() == null) ? 0 : getApplicationTime().hashCode());
        result = prime * result + ((getNewGoodsId() == null) ? 0 : getNewGoodsId().hashCode());
        result = prime * result + ((getReply() == null) ? 0 : getReply().hashCode());
        result = prime * result + ((getReplyTime() == null) ? 0 : getReplyTime().hashCode());
        result = prime * result + ((getSecondaryReply() == null) ? 0 : getSecondaryReply().hashCode());
        result = prime * result + ((getSecondaryReplyTime() == null) ? 0 : getSecondaryReplyTime().hashCode());
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
        sb.append(", orderId=").append(orderId);
        sb.append(", grievanceRecordsName=").append(grievanceRecordsName);
        sb.append(", sourceOfComplaint=").append(sourceOfComplaint);
        sb.append(", grievanceRecordsDescription=").append(grievanceRecordsDescription);
        sb.append(", partsName=").append(partsName);
        sb.append(", exchangeCause=").append(exchangeCause);
        sb.append(", repairOrdersId=").append(repairOrdersId);
        sb.append(", repairId=").append(repairId);
        sb.append(", applicationTime=").append(applicationTime);
        sb.append(", newGoodsId=").append(newGoodsId);
        sb.append(", reply=").append(reply);
        sb.append(", replyTime=").append(replyTime);
        sb.append(", secondaryReply=").append(secondaryReply);
        sb.append(", secondaryReplyTime=").append(secondaryReplyTime);
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