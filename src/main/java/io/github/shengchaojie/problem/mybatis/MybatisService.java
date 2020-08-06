package io.github.shengchaojie.problem.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author shengchaojie
 * @date 2020/8/3
 **/
@Service
public class MybatisService {

    @Autowired
    private GoodMapper goodMapper;

    @Transactional
    public void insert(){
        GoodDO goodDO = new GoodDO();
        goodDO.setGoodId("123");
        goodDO.setNum(1);
        goodMapper.insertSelective(goodDO);
    }

}
