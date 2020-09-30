package com.artisan.model;

/**
 * @author 小工匠
 * @version 1.0
 * @description: TODO
 * @date 2020/9/29 21:32
 * @mark: show me the code , change the world
 */
import lombok.Data;

/**
 *
 * @author yangshangwei
 *
 *         lombok的注解 @Data 注解在类上 提供类所有属性的 getting 和 setting 方法，
 *         此外还提供了equals、canEqual、hashCode、toString 方法
 *
 */

public class Artisan {

    private Long id;
    private String name;
    private String sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}