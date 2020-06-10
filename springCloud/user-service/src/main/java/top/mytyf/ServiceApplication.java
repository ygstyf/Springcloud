package top.mytyf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//兼容多种注册中心
@EnableDiscoveryClient
//数据查询对象所在的包
@MapperScan("top.mytyf.user.mapper.UserMapper")
public class ServiceApplication {
    public static void main(String[] args) {
        System.out.println(123);
        SpringApplication.run(ServiceApplication.class);
    }
}
