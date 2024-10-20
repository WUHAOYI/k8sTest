package com.why.userservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by WHY on 2024/10/19.
 * Functions:
 */
@RestController
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "User list: Alice, Bob, Charlie and why";
    }
}

