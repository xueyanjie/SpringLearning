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
         * AOP:
         * 首先，在面向切面编程的思想里面，把功能分为核心业务功能，和周边功能。
         * 所谓的核心业务，比如登陆，增加数据，删除数据都叫核心业务
         * 所谓的周边功能，比如性能统计，日志，事务管理等等
         * 周边功能在 Spring 的面向切面编程AOP思想里，即被定义为切面
         *
         * 在面向切面编程AOP的思想里面，核心业务功能和切面功能分别独立进行开发，然后把切面功能和核心业务功能 "编织" 在一起，这就叫AOP
         *
         * AOP能够将那些与业务无关，却为业务模块所共同调用的逻辑或责任（例如事务处理、日志管理、权限控制等）封装起来，
         * 便于减少系统的重复代码，降低模块间的耦合度，并有利于未来的可拓展性和可维护性。
         *
         * 【XML配置中的逻辑】
         */

    }
}
