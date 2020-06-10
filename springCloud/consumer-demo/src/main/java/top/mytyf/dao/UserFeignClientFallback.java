package top.mytyf.dao;

import org.springframework.stereotype.Component;
import top.mytyf.mapper.User;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("用户查询出现异常！");
        return user;
    }
}