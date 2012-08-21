package com.comdev.test;


import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.comdev.domain.VOPerson;


public class Test01
{

    public static void main(String[] args)
    {

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        VOPerson vo = new VOPerson();
        
//      @NotNull(message="姓名不能为null")
//      @NotEmpty(message="姓名不能为empty")
//      @NotBlank(message="姓名不能为空白字符")

        vo.setUserName(null);//NotNull ,NotEmpty,NotBlank
        vo.setUserName("");// /NotBlank,NotEmpty
        vo.setUserName(" ");//NotBlank
        
        
        
        Set<ConstraintViolation<VOPerson>> result = validator.validate(vo);
        Iterator<ConstraintViolation<VOPerson>> it = result.iterator();
        
        while (it.hasNext())
        {
             ConstraintViolation<VOPerson> item = it.next();
             System.out.println(item.getMessage()); 
        }
    }
}
