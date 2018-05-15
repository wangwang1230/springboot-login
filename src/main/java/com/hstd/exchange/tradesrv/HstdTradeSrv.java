/**
 * 
 */
package com.hstd.exchange.tradesrv;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: HstdYpjSrv
 * @author: wh
 * @date: 2018年5月14日
 * @Description: springboot启动类
 */
@SpringBootApplication
@EnableAutoConfiguration
public class HstdTradeSrv {
	/*static {
		try {
			// 初始化log4j
			String log4jPath = HstdTradeSrv.class.getClassLoader().getResource("").getPath() + "/log4j.properties";
			System.out.println("初始化log4j。。。。");
			System.out.println("path is "+log4jPath);
			PropertyConfigurator.configure(log4jPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	public static void main(String args[]) {
		SpringApplication.run(HstdTradeSrv.class, args);
	}
}
