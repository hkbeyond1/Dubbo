package com;

import com.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: HKZ
 * @Date: 2019/7/31 7:57
 * @Description:
 */
public class ConsumerTest {

    public static void main(String[] args) throws Exception {
        //容器启动配置文件，要用“ClassPathXmlApplicationContext”这个类
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("World");
        System.out.println(hello);
        System.in.read();//在控制台按任意键退出
    }
}
