package com.atguigu.demo.dto;

import java.io.Serializable;

public class TradeMqConsumerLogKeyDTO implements Serializable {
    private static final long serialVersionUID = 7725210161167474801L;
    private String groupName;

    private String msgTag;

    private String msgKey;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getMsgTag() {
        return msgTag;
    }

    public void setMsgTag(String msgTag) {
        this.msgTag = msgTag == null ? null : msgTag.trim();
    }

    public String getMsgKey() {
        return msgKey;
    }

    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey == null ? null : msgKey.trim();
    }
}