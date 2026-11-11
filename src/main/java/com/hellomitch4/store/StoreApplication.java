package com.hellomitch4.store;

import com.hellomitch4.user.User;
import com.hellomitch4.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.hellomitch4")
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(UserService.class);
        orderService.registerUser(new User(1L, "mitch@mitch.com", "123456", "Mitch"));
        orderService.registerUser(new User(1L, "mitch@mitch.com", "123456", "Mitch"));
    }

}
