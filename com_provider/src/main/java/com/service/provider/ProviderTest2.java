package com.service.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: HKZ
 * @Date: 2019/7/30 8:06
 * @Description:
 */
public class ProviderTest2 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
        context.start();
        System.out.println("服务已经启动！");
        System.in.read();//在控制台按任意键退出
    }
}
