package vn.plusplus.k86.springbootexercise.controller;

import org.springframework.web.bind.annotation.*;
import vn.plusplus.k86.springbootexercise.ConnectDatabase;
import vn.plusplus.k86.springbootexercise.model.User;
import vn.plusplus.k86.springbootexercise.model.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
    private final UserService userService = new UserService();

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.authentication(user);
    }
}
