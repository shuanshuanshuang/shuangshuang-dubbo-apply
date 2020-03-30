package com.atguigu.demo.service;

import com.atguigu.demo.dto.TradeOrderDTO;

public interface IOrderService {
    /**
     * 确认订单
     * @param order
     * @return Result
     */
    Result confirmOrder(TradeOrderDTO order);
}
