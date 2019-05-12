package com.star.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RestContorller 注解是 @Controller和 @ResponseBody注解的合体版
public class HellorWorldController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "helloWorld!!!";
    }



}
