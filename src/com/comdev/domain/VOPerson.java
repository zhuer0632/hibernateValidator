package com.comdev.domain;


import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


public class VOPerson
{
    //@Min(value=10,message="年龄太小了")
    private int age;

    
    @NotEmpty(message="姓名不能为empty")
    @NotNull(message="姓名不能为null")
    @NotBlank(message="姓名不能为空白字符")
    private String userName;
    
    //@NotNull(message="生日不能为空")
    private Date birth;
    
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
}
