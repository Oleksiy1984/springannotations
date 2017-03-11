package com.alex.spring;

import com.alex.spring.Config.WriterFileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(WriterFileConfig.class);
        System.out.println((String) context.getBean("readWrite"));

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        context.close();
    }

}
