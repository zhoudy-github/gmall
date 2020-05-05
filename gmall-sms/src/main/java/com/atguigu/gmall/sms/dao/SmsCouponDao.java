package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SmsCouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhoudongyang
 * @email zhoudy@atguigu.com
 * @date 2020-05-05 21:25:30
 */
@Mapper
public interface SmsCouponDao extends BaseMapper<SmsCouponEntity> {
	
}
