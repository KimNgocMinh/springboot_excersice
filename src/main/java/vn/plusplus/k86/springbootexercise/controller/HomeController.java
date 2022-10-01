package vn.plusplus.k86.springbootexercise.controller;

import org.springframework.web.bind.annotation.*;
import vn.plusplus.k86.springbootexercise.model.Movie;
import vn.plusplus.k86.springbootexercise.model.User;
import vn.plusplus.k86.springbootexercise.service.impl.UserService;

import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {
    private final UserService userService = new UserService();

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User unknow) {
        return userService.authentication(unknow);
    }
}
