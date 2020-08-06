package com.scj.test;

import io.github.shengchaojie.problem.Application;
import io.github.shengchaojie.problem.GoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author shengchaojie
 * @date 2020/8/3
 **/
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RegistrySynchronizationTest {

    @Autowired
    private GoodService goodService;

    @Test
    public void test(){
        goodService.addGood();
    }

    @Test
    public void test2(){
        goodService.addGood2();
    }

    @Test
    public void addGoodOfJPA(){
        goodService.addGoodOfJPA();
    }

}
