package com.alex.spring;

import com.alex.spring.Config.WriterFileConfig;
import com.alex.spring.Interfaces.Messenger;
import com.alex.spring.Interfaces.WriteToFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws IOException {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(WriterFileConfig.class);

        Messenger messenger=context.getBean(Messenger.class);
        WriteToFile writeToFile=context.getBean(WriteToFile.class);

        writeToFile.write(new Date() + messenger.getMessage());
    }

}
