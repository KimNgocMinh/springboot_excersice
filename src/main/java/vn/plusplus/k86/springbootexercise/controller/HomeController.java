package vn.plusplus.k86.springbootexercise.controller;

import org.springframework.web.bind.annotation.*;
import vn.plusplus.k86.springbootexercise.ConnectDatabase;
import vn.plusplus.k86.springbootexercise.model.User;
import vn.plusplus.k86.springbootexercise.model.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {


    @PostMapping("/register")
    public String register(@RequestBody User user) {
        UserService userService = new UserService();
        return userService.createUser(user);
    }

}
