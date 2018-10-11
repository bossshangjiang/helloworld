package com.imooc.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="girl")
public class GirlProperties {
    private String cupsize;

    private Integer age;

    public String getCupsize() {
        return cupsize;
    }

    public Integer getAge() {
        return age;
    }

    public void setCupsize(String cupsize) {
        this.cupsize = cupsize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
