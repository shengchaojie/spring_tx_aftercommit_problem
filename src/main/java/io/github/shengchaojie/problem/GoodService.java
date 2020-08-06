package io.github.shengchaojie.problem;

import io.github.shengchaojie.problem.jpa.GoodRepository;
import io.github.shengchaojie.problem.jpa.JPAEvent;
import io.github.shengchaojie.problem.jpa.JPAService;
import io.github.shengchaojie.problem.mybatis.GoodDO;
import io.github.shengchaojie.problem.mybatis.GoodMapper;
import io.github.shengchaojie.problem.mybatis.MybatisService;
import io.github.shengchaojie.problem.mybatis.MybatisEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author shengchaojie
 * @date 2020/8/3
 **/
@Service
public class GoodService {

    @Autowired
    private MybatisService mybatisService;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private JPAService jpaService;

    @Transactional
    public void addGood(){
        mybatisService.insert();
        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization(){
            public void afterCommit() {
                GoodDO goodDO = new GoodDO();
                goodDO.setGoodId("123");
                goodDO.setNum(1);
                goodMapper.insertSelective(goodDO);
            }
        });
    }

    @Transactional
    public void addGood2(){
        mybatisService.insert();
        applicationEventPublisher.publishEvent(new MybatisEvent());
    }

    @Transactional
    public void addGoodOfJPA(){
        jpaService.insert();
        applicationEventPublisher.publishEvent(new JPAEvent());
    }

}
