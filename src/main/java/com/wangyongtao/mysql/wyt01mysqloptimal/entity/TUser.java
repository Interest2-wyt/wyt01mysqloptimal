package com.wangyongtao.mysql.wyt01mysqloptimal.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 多数据源切换表一(TUser)实体类
 *
 * @author makejava
 * @since 2020-04-10 15:44:15
 */
@Data
public class TUser implements Serializable {
    private static final long serialVersionUID = -94941024420112949L;
    
    private Integer id;
    
    private String name;

}