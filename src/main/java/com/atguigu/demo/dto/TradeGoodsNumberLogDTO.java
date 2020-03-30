package com.atguigu.demo.dto;

import java.io.Serializable;
import java.util.Date;

public class TradeGoodsNumberLogDTO extends TradeGoodsNumberLogKeyDTO implements Serializable {
    private static final long serialVersionUID = 8210538884820068485L;
    //库存数量
    private Integer goodsNumber;

    private Date logTime;

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}