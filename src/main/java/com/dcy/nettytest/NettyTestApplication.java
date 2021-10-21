package com.dcy.nettytest;

import com.dcy.nettytest.util.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author Dcy
 */
@SpringBootApplication
public class NettyTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(NettyTestApplication.class, args);
        SpringUtils.set(run);
    }

}
