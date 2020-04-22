package com.wangyongtao.mysql.wyt01mysqloptimal.controller;

import com.wangyongtao.mysql.wyt01mysqloptimal.entity.TUser;
import com.wangyongtao.mysql.wyt01mysqloptimal.service.TUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 多数据源切换表一(TUser)表控制层
 *
 * @author makejava
 * @since 2020-04-10 15:44:18
 */
@RestController
@RequestMapping("/tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public TUser selectOne(@RequestParam("id") Integer id) {
        return this.tUserService.queryById(id);
    }

}