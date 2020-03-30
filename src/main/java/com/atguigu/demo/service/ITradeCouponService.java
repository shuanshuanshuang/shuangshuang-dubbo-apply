package com.atguigu.demo.service;

import com.atguigu.demo.dto.TradeCouponDTO;



public interface ITradeCouponService {

    TradeCouponDTO findOne(Long couponId);

    Result changeCouponStatus(TradeCouponDTO coupon);
}
