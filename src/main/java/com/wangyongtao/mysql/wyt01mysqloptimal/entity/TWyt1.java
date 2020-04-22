package com.wangyongtao.mysql.wyt01mysqloptimal.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (TWyt1)实体类
 *
 * @author makejava
 * @since 2020-04-11 09:25:23
 */
@Data
public class TWyt1 implements Serializable {
    private static final long serialVersionUID = 343160331998215303L;
    
    private Integer id;
    
    private String name;
    
    private String address;
    
    private String male;
    
    private Integer age;
    
    private String profession;
    
    private Date createTime;
    
    private Date updateTime;

}