//package top.mytyf.controller;
//
//import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
//import javafx.beans.DefaultProperty;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.client.RestTemplate;
//import top.mytyf.mapper.User;
//
//@Controller
////设置默认的事务失败回滚函数
//@DefaultProperties(defaultFallback = "queryUserByIdFallback")
//public class UserDao {
////@HystrixCommand(commandProperties = {
////        @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),
////        @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "5000"),
////        @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60")
////})
////    public void te (){
////
////}
////
////    @Autowired
////    private RestTemplate restTemplate;
////
//////    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
//////声明一个失败回滚处理函数
////
////    /**
////     *
////     * @param id
////     * @return
////     */
////    @HystrixCommand(fallbackMethod = "queryUserByIdFallback")
////    public User queryUserById(Integer id){
////        long begin = System.currentTimeMillis();
////        String url = "http://user-service/user/"+id;
////        User user = this.restTemplate.getForObject(url, User.class);
////        long end = System.currentTimeMillis();
////        // 记录访问用时：
////        System.out.println(id+"访问用时：{}"+ (end - begin));
////        return user;
////    }
////
////    /**
////     *
////     * @param id
////     * @return
////     */
////
////    public User queryUserByIdFallback(Integer id){
////        User user = new User();
////        user.setId(id);
////        user.setName("用户信息查询出现异常！");
////        return user;
////    }
//}
