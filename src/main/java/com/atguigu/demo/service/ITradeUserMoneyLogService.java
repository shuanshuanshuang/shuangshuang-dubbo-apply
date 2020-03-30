package com.atguigu.demo.service;

import com.atguigu.demo.dto.TradeUserMoneyLogDTO;

public interface ITradeUserMoneyLogService {
    Result updateMoneyPaid(TradeUserMoneyLogDTO userMoneyLog);

    long selectOne(Long orderId, Long userId);

    int selectPaid(TradeUserMoneyLogDTO userMoneyLog);

    void insert(TradeUserMoneyLogDTO userMoneyLog);
}
