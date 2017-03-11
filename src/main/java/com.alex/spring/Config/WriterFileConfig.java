package com.alex.spring.Config;

import com.alex.spring.Impl.MessangerImpl;
import com.alex.spring.Impl.WriterToFileImpl;
import com.alex.spring.Interfaces.Messenger;
import com.alex.spring.Interfaces.WriteToFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class WriterFileConfig {

    @Bean
    public Messenger messenger() {
        return new MessangerImpl();
    }

    @Bean
    public WriteToFile writeToFile() {
        return new WriterToFileImpl();
    }

}
