package com.wangyongtao.mysql.wyt01mysqloptimal.config.datasoureswitch;

import java.lang.annotation.*;

/**
 * @ClassName: ${type_name}
 * @Description: AOP动态数据源切换：数据源注解类，后面会根据该注解选择切面
 * @author: ${user}
 * @date: ${date} ${time}
 * ${tags}
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
