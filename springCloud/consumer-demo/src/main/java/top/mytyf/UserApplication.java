package top.mytyf;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableCircuitBreaker 启动熔断机制
//@EnableDiscoveryClient 开启Eureka客户端
//@SpringBootApplication 声明是启动类
@EnableFeignClients //Feign的客户端
//一下注解集中了注释中的3个注解
@SpringCloudApplication
public class UserApplication {
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){return  new RestTemplate();}
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
