package com.atguigu.demo.service;

import com.atguigu.demo.dto.TradeGoodsDTO;

public interface IGoodsService {

    TradeGoodsDTO findOne(Long goodsId);

    void updateByPrimaryKey(TradeGoodsDTO tradeGoodsDTO);
}
