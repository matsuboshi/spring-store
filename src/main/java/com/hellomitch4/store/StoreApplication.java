package com.hellomitch4.store;

import com.hellomitch4.store.entities.Address;
import com.hellomitch4.store.entities.Profile;
import com.hellomitch4.store.entities.Tag;
import com.hellomitch4.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hellomitch4")
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .name("John Doe")
                .password("123456")
                .email("john@john.com")
                .build();

        user.addTag("Java");

        var profile = Profile.builder()
                .bio("Software Engineer")
                .build();

        user.setProfile(profile);
        profile.setUser(user);

        System.out.println(user);
    }
}
