package io.github.shengchaojie.problem.jpa;

import lombok.Data;

import javax.persistence.*;

/**
 * @author shengchaojie
 * @date 2020/8/5
 **/
@Entity
@Table(name = "goods")
@Data
public class GoodEntity {

    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String goodId;

    private Integer num;

}
