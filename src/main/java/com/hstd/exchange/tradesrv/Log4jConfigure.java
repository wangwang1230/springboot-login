package com.hstd.exchange.tradesrv;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wh
 * springboot1.4以上版本使用log4j 需要加载log4j.properties
 */
@ComponentScan
@ConfigurationProperties("classpath:log4j.properties")
public class Log4jConfigure {

}
