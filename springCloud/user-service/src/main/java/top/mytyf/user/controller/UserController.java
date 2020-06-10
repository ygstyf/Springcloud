package top.mytyf.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.mytyf.user.mapper.User;
import top.mytyf.user.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Integer id) throws InterruptedException {
        System.out.println("user"+userService.queryById(id));
        return this.userService.queryById(id);

    }
}