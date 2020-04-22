package com.wangyongtao.mysql.wyt01mysqloptimal.config.datasoureswitch;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName DynamicDataSourceConfig
 *@Description AOP动态数据源切换：动态数据源切换配置类
 *@Author wangyongtao
 *@Date 2020/4/10 16:11
 *@Version 1.0
 */
@Configuration
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.xiaobin-master")
    public DataSource xiaobinMasterDatasource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.druid.xiaobin-master")
    public DataSource xiaobinSlaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public DynamicDataSource dataSource(DataSource xiaobinMasterDataSource, DataSource xiaobinSlaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("xiaobin-master",xiaobinMasterDataSource);
        targetDataSources.put("xiaobin-slave", xiaobinSlaveDataSource);
        return new DynamicDataSource(xiaobinMasterDataSource, targetDataSources);
    }
}
