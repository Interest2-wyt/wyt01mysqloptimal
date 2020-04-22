package com.wangyongtao.mysql.wyt01mysqloptimal.config.datasoureswitch;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 *@ClassName DataSourceAspect
 *@Description AOP动态数据源切换：切面类，配置拦截数据源并根据情况进行切换
 *@Author wangyongtao
 *@Date 2020/4/10 16:51
 *@Version 1.0
 */
@Aspect
@Component
public class DataSourceAspect {

    @Pointcut("@annotation(com.wangyongtao.mysql.wyt01mysqloptimal.config.datasoureswitch.DataSource)")
    public void dataSourcePointCut(){

    }
    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature)point.getSignature();
        Method method = signature.getMethod();

        DataSource dataSource = method.getAnnotation(DataSource.class);
        if (dataSource==null){
            DynamicDataSource.setDataSource("xiaobin-master");
        }else {
            DynamicDataSource.setDataSource(dataSource.name());
        }

        try {
            return point.proceed();
        } finally {
            DynamicDataSource.clearDataSource();
        }

    }

}
