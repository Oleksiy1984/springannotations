package com.alex.spring.Impl;

import com.alex.spring.Interfaces.Messenger;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class MessangerImpl implements Messenger {
    public String getMessage(){
        System.out.println("Input your message");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
