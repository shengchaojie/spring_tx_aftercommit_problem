package io.github.shengchaojie.problem.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author shengchaojie
 * @date 2020/8/5
 **/
@Service
public class JPAEventListener {

    @Autowired
    private JPAService jpaService;

    @TransactionalEventListener
    public void consume(JPAEvent jpaEvent){
        jpaService.insert();
    }

}
