package com.atguigu.demo.dto;

import java.io.Serializable;

public class TradeGoodsNumberLogKeyDTO implements Serializable {
    private static final long serialVersionUID = 6813073320141538433L;
    //商品id
    private Long goodsId;
    //订单id
    private Long orderId;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}