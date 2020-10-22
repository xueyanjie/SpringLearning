package com.xyj;


import com.xyj.beans.AppBean;
import com.xyj.service.AppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.Provider;

public class SLApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        /**
         * 控制反转：
         * new的控制由用户交给了容器，即为 “控制反转”
         */
        AppBean bean = (AppBean) context.getBean("appBean");
        System.out.println(bean.getMessage());
        /**
         * 依赖注入：
         * 指 Spring 创建对象的过程中，将对象依赖属性（简单值，集合，对象）通过配置设值给该对象
         */
        AppService service = (AppService) context.getBean("appService");
        System.out.println(service.showMessage());
        /**
         * AOP
         */
    }
}
