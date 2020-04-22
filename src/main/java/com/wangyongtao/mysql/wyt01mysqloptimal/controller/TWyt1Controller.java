package com.wangyongtao.mysql.wyt01mysqloptimal.controller;

import com.wangyongtao.mysql.wyt01mysqloptimal.entity.TWyt1;
import com.wangyongtao.mysql.wyt01mysqloptimal.service.TWyt1Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TWyt1)表控制层
 *
 * @author makejava
 * @since 2020-04-11 09:25:29
 */
@RestController
@RequestMapping("/tWyt1")
public class TWyt1Controller {
    /**
     * 服务对象
     */
    @Resource
    private TWyt1Service tWyt1Service;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public TWyt1 selectOne(Integer id) {
        return this.tWyt1Service.queryById(id);
    }

    @PostMapping("/insertBillon")
    public Object insertBillion(){
        return tWyt1Service.insertBillon();
    }

    @PostMapping("/insertBySql")
    public String insertbYSql(){
        return tWyt1Service.insertbYSql();
    }

}