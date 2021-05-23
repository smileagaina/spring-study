package com.shj.config;


import com.shj.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 在Java类添加@Configuration注解，就类似于Bean XML配置或者 Bean注解。这个也会被Spring托管，因为本来就是@Component
@Configuration
@ComponentScan("com.shj.pojo")
@Import(MyConfig2.class) // 导入注解配置
public class MyConfig {

    // 注意一个bean，就相当于之前在XML写的一个Bean，方法的名字就相当于XML中Bean标签的ID
    @Bean
    public User getUser() {
        return new User();// 返回注入到bean的对象
    }
}
