//package top.mytyf.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import top.mytyf.controller.UserDao;
//import top.mytyf.dao.UserFeignClient;
//import top.mytyf.mapper.User;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class UserService {
//
////    @Autowired
////    private UserDao userDao=new UserDao();
//    @Autowired
//    private UserFeignClient userFeignClient;
//
//    public List<User> queryUserByIds(List<Integer> ids) {
//        List<User> users = new ArrayList<>();
////        ids.forEach(id ->{
////            // 我们测试多次查询，
////            users.add(this.userDao.queryUserById(id));
////        });
//        for (Integer id:ids
//             ) {
//            users.add(this.userFeignClient.queryUserById(id));
//        }
//        return users;
//    }
//
//
//
//}