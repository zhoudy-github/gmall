package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SmsSpuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author zhoudongyang
 * @email zhoudy@atguigu.com
 * @date 2020-05-05 21:25:29
 */
public interface SmsSpuFullReductionService extends IService<SmsSpuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

