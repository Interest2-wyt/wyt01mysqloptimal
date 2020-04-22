package com.wangyongtao.mysql.wyt01mysqloptimal.service;

import com.wangyongtao.mysql.wyt01mysqloptimal.entity.TWyt1;
import java.util.List;

/**
 * (TWyt1)表服务接口
 *
 * @author makejava
 * @since 2020-04-11 09:25:28
 */
public interface TWyt1Service {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TWyt1 queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TWyt1> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tWyt1 实例对象
     * @return 实例对象
     */
    TWyt1 insert(TWyt1 tWyt1);

    /**
     * 新增上亿条数据，用以测试mysql性能
     * @return
     */
    boolean insertBillon();

    int insertAll();

    /**
     * 新增上千万数据，测试是88秒
     * @return
     */
    String insertbYSql();

    /**
     * 修改数据
     *
     * @param tWyt1 实例对象
     * @return 实例对象
     */
    TWyt1 update(TWyt1 tWyt1);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}