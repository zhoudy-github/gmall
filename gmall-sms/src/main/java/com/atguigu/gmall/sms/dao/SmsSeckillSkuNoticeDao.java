package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SmsSeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * 
 * @author zhoudongyang
 * @email zhoudy@atguigu.com
 * @date 2020-05-05 21:25:30
 */
@Mapper
public interface SmsSeckillSkuNoticeDao extends BaseMapper<SmsSeckillSkuNoticeEntity> {
	
}
