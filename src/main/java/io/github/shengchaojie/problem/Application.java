package io.github.shengchaojie.problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author shengchaojie
 * @date 2020/8/3
 **/
@SpringBootApplication
@EnableWebMvc
@MapperScan("io.github.shengchaojie.problem.mybatis")
@EnableJpaRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
