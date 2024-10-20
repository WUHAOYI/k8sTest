package com.why.orderservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WHY on 2024/10/19.
 * Functions:
 */

@RestController
public class OrderController {

    @GetMapping("/orders")
    public String getOrders() {
        return "Order list for users: 1,2,3,4,5";
    }
}

