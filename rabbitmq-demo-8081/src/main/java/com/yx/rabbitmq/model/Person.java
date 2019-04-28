package com.yx.rabbitmq.model;

import java.io.Serializable;

/**
 * @author yx start  需要实现序列化
 * @create 2019/4/28,14:58
 */
public class Person implements Serializable {

    private String namme ;
    private int age ;

    public String getNamme() {
        return namme;
    }

    public void setNamme(String namme) {
        this.namme = namme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namme='" + namme + '\'' +
                ", age=" + age +
                '}';
    }
}
