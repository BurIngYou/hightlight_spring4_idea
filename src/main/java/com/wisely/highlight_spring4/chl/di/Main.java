package com.wisely.highlight_spring4.chl.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: TODO
 * @Author:You.Hu
 * @Create:2017-03-11 15:04
 */
public class Main {
    public static void main (String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
        context.close();

    }
}
