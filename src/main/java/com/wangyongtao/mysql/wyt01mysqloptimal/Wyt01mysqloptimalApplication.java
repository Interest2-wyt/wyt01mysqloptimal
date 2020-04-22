package com.wangyongtao.mysql.wyt01mysqloptimal;

import com.wangyongtao.mysql.wyt01mysqloptimal.config.datasoureswitch.DynamicDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.wangyongtao.mysql.wyt01mysqloptimal.dao")
@Import({DynamicDataSourceConfig.class})
public class Wyt01mysqloptimalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wyt01mysqloptimalApplication.class, args);
    }

}
