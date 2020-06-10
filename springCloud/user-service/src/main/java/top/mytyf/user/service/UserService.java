package top.mytyf.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.mytyf.user.mapper.User;
import top.mytyf.user.mapper.UserMapper;

import java.util.Random;

@Service
public class UserService {
@Autowired
    private UserMapper userMapper;
    public User queryById(Integer id) throws InterruptedException {
        // 为了演示超时现象，我们在这里然线程休眠,时间随机 0~2000毫秒
//        Thread.sleep(new Random().nextInt(2000));
//        使用接口通过主键查询
        return userMapper.selectByPrimaryKey(id);
    }



}
