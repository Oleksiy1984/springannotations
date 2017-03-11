package com.alex.spring.Impl;


import com.alex.spring.Interfaces.WriteToFile;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;

@Component
public class WriterToFileImpl implements WriteToFile {
    public String write(String str){
        try{
            PrintWriter writer = new PrintWriter("storage2.txt", "UTF-8");
            writer.println(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}
