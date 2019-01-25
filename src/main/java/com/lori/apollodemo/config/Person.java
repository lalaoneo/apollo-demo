package com.lori.apollodemo.config;


import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Value;

public class Person {

    @Value("${name:laoma}")
    private String name;

    @Value("${age:32}")
    private Integer age;

    @Value("${address:金称市}")
    private String address;

    @ApolloConfigChangeListener("application")
    private void someChangeHandler(ConfigChangeEvent event){
        System.out.println("name space : "+event.getNamespace());
        if (event.isChanged("name")){
            System.out.println("name is change : "+event.getChange("name"));
        }
        if (event.isChanged("age")){
            System.out.println("age is change : "+event.getChange("age"));
        }
        if (event.isChanged("address")){
            System.out.println("address is change : "+event.getChange("address"));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}