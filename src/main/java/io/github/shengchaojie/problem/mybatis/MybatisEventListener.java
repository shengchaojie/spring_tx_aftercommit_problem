package io.github.shengchaojie.problem.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author shengchaojie
 * @date 2020/8/3
 **/
@Component
public class MybatisEventListener {

    @Autowired
    private MybatisService mybatisService;

    @TransactionalEventListener
    public void handleEvent(MybatisEvent event){
        mybatisService.insert();
    }

}
