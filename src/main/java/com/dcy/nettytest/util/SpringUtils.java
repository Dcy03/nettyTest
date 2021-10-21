package com.dcy.nettytest.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName:
 * @Descripton:
 * @author: hedd
 */
@Component
public class SpringUtils implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
    public static void set(ApplicationContext applicationContext){
        context = applicationContext;
    }

    /**
     * 通过字节码获取
     * @param beanClass
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> beanClass){
        return context.getBean(beanClass);
    }

    /**
     * 通过beanName获取
     * @param beanName
     * @param <T>
     * @return
     */
    public static <T> T getBean(String beanName){
        return (T) context.getBean(beanName);
    }
    public static <T> T getBean(String beanName,Class<T> beanClass){
        return context.getBean(beanName,beanClass);
    }
}
