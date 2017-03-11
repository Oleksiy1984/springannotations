package com.alex.spring;

import com.alex.spring.Config.WriterFileConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(WriterFileConfig.class);

        for (String name :context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        System.out.printf("There are %d beans%n",
                context.getBeanDefinitionCount());
        System.out.println(context.getBean("action"));
    }

}
