package io.github.shengchaojie.problem.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shengchaojie
 * @date 2020/8/5
 **/
@Service
public class JPAService {

    @Autowired
    private GoodRepository goodRepository;

    @Transactional
    public void insert(){
        GoodEntity goodEntity = new GoodEntity();
        goodEntity.setGoodId("123");
        goodEntity.setNum(1);
        goodRepository.save(goodEntity);
    }


}
