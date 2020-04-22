package com.wangyongtao.mysql.wyt01mysqloptimal.service.impl;

import com.wangyongtao.mysql.wyt01mysqloptimal.entity.TWyt1;
import com.wangyongtao.mysql.wyt01mysqloptimal.dao.TWyt1Dao;
import com.wangyongtao.mysql.wyt01mysqloptimal.service.TWyt1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * (TWyt1)表服务实现类
 *
 * @author makejava
 * @since 2020-04-11 09:25:28
 */
@Service("tWyt1Service")
public class TWyt1ServiceImpl implements TWyt1Service {
    @Resource
    private TWyt1Dao tWyt1Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TWyt1 queryById(Integer id) {
        return this.tWyt1Dao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TWyt1> queryAllByLimit(int offset, int limit) {
        return this.tWyt1Dao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tWyt1 实例对象
     * @return 实例对象
     */
    @Override
    public TWyt1 insert(TWyt1 tWyt1) {
        this.tWyt1Dao.insert(tWyt1);
        return tWyt1;
    }

    @Override
    public boolean insertBillon() {
        TWyt1 tWyt1 = null;
        List<TWyt1> list = new ArrayList();
        long start = System.currentTimeMillis();
        for (int k=0;k<1000;k++){
            for (int i=1;i<100000;i++){
                tWyt1 = new TWyt1();
                tWyt1.setAddress("双流大道"+i+"号");
                tWyt1.setAge(i%100);
                tWyt1.setMale(i%2==0?"男":"女");
                tWyt1.setName("复制体"+i);
                tWyt1.setProfession("搬砖工人"+i%1000+"号");
                tWyt1.setCreateTime(new Date());
                tWyt1.setUpdateTime(new Date());
                list.add(tWyt1);
            }
            tWyt1Dao.insertAll(list);
            list.clear();
        }
        long end = System.currentTimeMillis();
        System.out.println("插入1亿条数据需要的时间为："+(end-start)/1000);
        return true;
    }

    @Override
    public int insertAll() {
        return 0;
    }

    /**
     * 修改数据
     *
     * @param tWyt1 实例对象
     * @return 实例对象
     */
    @Override
    public TWyt1 update(TWyt1 tWyt1) {
        this.tWyt1Dao.update(tWyt1);
        return this.queryById(tWyt1.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tWyt1Dao.deleteById(id) > 0;
    }

    @Override
    public String insertbYSql() {


        return null;
    }
}