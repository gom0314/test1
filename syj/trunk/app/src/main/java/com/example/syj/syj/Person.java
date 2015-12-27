package com.example.syj.syj;

import java.io.Serializable;

/**
 * Created by jin on 2015-12-18.
 */
public class Person implements Serializable {
    private String name;
    private String age;
    private String gender;

    public Person(String name,String age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

    @Override
    public String toString(){

        return  String.format("이름: %s\n"+"나이: %s\n"+"성별: %s\n",name,age,gender);
    }

}
