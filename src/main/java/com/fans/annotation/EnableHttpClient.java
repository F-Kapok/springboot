package com.fans.annotation;

import com.fans.config.HttpClientAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * interfaceName: EnableHttpClient
 *
 * @author k
 * @version 1.0
 * @description HttpClient自定义配置注解
 * @date 2019-03-05 22:16
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(HttpClientAutoConfiguration.class)
public @interface EnableHttpClient {
}
