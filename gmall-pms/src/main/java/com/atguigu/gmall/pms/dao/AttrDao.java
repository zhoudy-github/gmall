package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhoudongyang
 * @email zhoudy@atguigu.com
 * @date 2020-04-28 22:22:17
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
