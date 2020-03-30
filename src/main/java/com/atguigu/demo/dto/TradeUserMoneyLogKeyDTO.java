package com.atguigu.demo.dto;

import java.io.Serializable;

public class TradeUserMoneyLogKeyDTO implements Serializable {
    private static final long serialVersionUID = 4852134739414203833L;
    //用户id
    private Long userId;
    //订单id
    private Long orderId;
    //日志类型   1订单付款   2订单退款
    private Integer moneyLogType;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getMoneyLogType() {
        return moneyLogType;
    }

    public void setMoneyLogType(Integer moneyLogType) {
        this.moneyLogType = moneyLogType;
    }
}