package com.alex.spring.Config;

import com.alex.spring.Interfaces.Messenger;
import com.alex.spring.Interfaces.WriteToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.alex.spring")
public class WriterFileConfig {
    @Autowired
    private Messenger messenger;
    @Autowired
    private WriteToFile writeToFile;

    @Bean
    public String readWrite() {
        return writeToFile.write(messenger.getMessage());
    }
}
