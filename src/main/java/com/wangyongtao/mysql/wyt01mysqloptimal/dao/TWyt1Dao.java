package com.wangyongtao.mysql.wyt01mysqloptimal.dao;

import com.wangyongtao.mysql.wyt01mysqloptimal.entity.TWyt1;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TWyt1)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-11 09:25:27
 */
public interface TWyt1Dao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TWyt1 queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TWyt1> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tWyt1 实例对象
     * @return 对象列表
     */
    List<TWyt1> queryAll(TWyt1 tWyt1);

    /**
     * 新增数据
     *
     * @param tWyt1 实例对象
     * @return 影响行数
     */
    int insert(TWyt1 tWyt1);

    /**
     * 以列表形式新增数据
     * @param list
     * @return
     */
    int insertAll(List<TWyt1> list);

    /**
     * 修改数据
     *
     * @param tWyt1 实例对象
     * @return 影响行数
     */
    int update(TWyt1 tWyt1);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}