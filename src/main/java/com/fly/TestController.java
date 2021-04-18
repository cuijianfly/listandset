package com.fly;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private int var = 0;

    ThreadLocal<Integer>  l = new ThreadLocal();
    @GetMapping(value = "/test_var")
    public String test() {
        System.out.println(l.get());
        l.set(1);
        System.out.println(l.get());
        System.out.println("普通变量var:" + (++var));
        return "普通变量var:" + var ;
    }
}