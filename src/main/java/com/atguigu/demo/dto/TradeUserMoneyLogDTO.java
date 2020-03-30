package com.atguigu.demo.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeUserMoneyLogDTO extends TradeUserMoneyLogKeyDTO implements Serializable {
    private static final long serialVersionUID = -1815267746629555871L;
    private BigDecimal useMoney;
    //日志时间
    private Date createTime;

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}