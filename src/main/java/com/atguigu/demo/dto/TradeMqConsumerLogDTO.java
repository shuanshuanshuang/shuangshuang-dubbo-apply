package com.atguigu.demo.dto;

import java.util.Date;

public class TradeMqConsumerLogDTO extends TradeMqConsumerLogKeyDTO {
    private String msgId;

    private String msgBody;
    //0:正在处理;1:处理成功;2:处理失败'
    private Integer consumerStatus;

    private Integer consumerTimes;

    private Date consumerTimestamp;

    private String remark;

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getMsgBody() {
        return msgBody;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody == null ? null : msgBody.trim();
    }

    public Integer getConsumerStatus() {
        return consumerStatus;
    }

    public void setConsumerStatus(Integer consumerStatus) {
        this.consumerStatus = consumerStatus;
    }

    public Integer getConsumerTimes() {
        return consumerTimes;
    }

    public void setConsumerTimes(Integer consumerTimes) {
        this.consumerTimes = consumerTimes;
    }

    public Date getConsumerTimestamp() {
        return consumerTimestamp;
    }

    public void setConsumerTimestamp(Date consumerTimestamp) {
        this.consumerTimestamp = consumerTimestamp;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}