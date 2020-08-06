package io.github.shengchaojie.problem;

import io.github.shengchaojie.problem.mybatis.GoodDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shengchaojie
 * @date 2020/8/4
 **/
@RestController
public class TestController {


    @Autowired
    private GoodService goodService;

    @GetMapping("/test")
    public String test(){
        goodService.addGood();
        return "success";
    }

}
