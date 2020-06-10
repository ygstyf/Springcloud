package top.mytyf.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import top.mytyf.mapper.User;

//@FeignClient("user-service")
@FeignClient(value="user-service",fallback = UserFeignClientFallback.class)
public interface UserFeignClient {
    /**
     * 通过id查找数据
     * @param id 主键
     * @return 用户对象
     */
    @GetMapping("user/{id}")
    User queryUserById(@PathVariable("id") Integer id);
}