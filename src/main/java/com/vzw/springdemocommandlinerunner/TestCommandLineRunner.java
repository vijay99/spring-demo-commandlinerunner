package com.vzw.springdemocommandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCommandLineRunner implements CommandLineRunner {

    // You can include any initialization logic or tasks that need to be performed on startup.
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world from run method of TestCommandLineRunner ");
    }
}
