package com.atguigu.gmall.sms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.sms.entity.SmsSpuFullReductionEntity;
import com.atguigu.gmall.sms.service.SmsSpuFullReductionService;




/**
 * 商品满减信息
 *
 * @author zhoudongyang
 * @email zhoudy@atguigu.com
 * @date 2020-05-05 21:25:29
 */
@Api(tags = "商品满减信息 管理")
@RestController
@RequestMapping("sms/smsspufullreduction")
public class SmsSpuFullReductionController {
    @Autowired
    private SmsSpuFullReductionService smsSpuFullReductionService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:smsspufullreduction:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = smsSpuFullReductionService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:smsspufullreduction:info')")
    public Resp<SmsSpuFullReductionEntity> info(@PathVariable("id") Long id){
		SmsSpuFullReductionEntity smsSpuFullReduction = smsSpuFullReductionService.getById(id);

        return Resp.ok(smsSpuFullReduction);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:smsspufullreduction:save')")
    public Resp<Object> save(@RequestBody SmsSpuFullReductionEntity smsSpuFullReduction){
		smsSpuFullReductionService.save(smsSpuFullReduction);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:smsspufullreduction:update')")
    public Resp<Object> update(@RequestBody SmsSpuFullReductionEntity smsSpuFullReduction){
		smsSpuFullReductionService.updateById(smsSpuFullReduction);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:smsspufullreduction:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		smsSpuFullReductionService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
