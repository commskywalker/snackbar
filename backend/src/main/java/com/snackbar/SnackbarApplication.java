package com.snackbar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {
    "com.snackbar", 
    "com.snackbar.product", 
    "com.snackbar.cooking",
    "com.snackbar.order",
    "com.snackbar.checkout",
    "com.snackbar.pickup",
    "com.snackbar.productv2"
})
@EnableFeignClients
public class SnackbarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnackbarApplication.class, args);
    }

}
