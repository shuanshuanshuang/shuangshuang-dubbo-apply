package com.atguigu.demo.service;

import com.atguigu.demo.dto.TradeUserDTO;
import com.atguigu.demo.dto.TradeUserMoneyLogDTO;

import java.math.BigDecimal;

public interface ITradeUserService {
    TradeUserDTO findOne(Long userId);

    Result updateMoneyPaid(TradeUserMoneyLogDTO userMoneyLog);
}
