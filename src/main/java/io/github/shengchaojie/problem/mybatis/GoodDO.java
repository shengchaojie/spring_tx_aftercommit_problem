package io.github.shengchaojie.problem.mybatis;

import lombok.Data;

import javax.persistence.*;

/**
 * @author shengchaojie
 * @date 2020/8/3
 **/
@Data
@Table(name = "goods")
public class GoodDO {

    @Id
    @Column(name = "`id`")
    private Long id;

    private String goodId;

    private Integer num;

}
