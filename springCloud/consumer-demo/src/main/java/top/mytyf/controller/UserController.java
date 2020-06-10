package top.mytyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.mytyf.dao.UserFeignClient;
import top.mytyf.mapper.User;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    UserService userService;
@Autowired
    UserFeignClient userFeignClient;
    @GetMapping("/{id}")
    public User showById(@PathVariable("id") Integer id){
//
//        List<Integer> idlist=new ArrayList<>();
//        for (int i = 1; i < 10; i++) {
//            idlist.add(i);
//        }
//        String serviceUrl="http://user-service/user/"+id;
//        User user = restTemplate.getForObject(serviceUrl, User.class);

//        List<User> users = userService.queryUserByIds(idlist);
//        System.out.println("用户s"+users);
//        User user=new User();
        User user = userFeignClient.queryUserById(id);
        return user;
    }
}
