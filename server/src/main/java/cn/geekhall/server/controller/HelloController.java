package cn.geekhall.server.controller;

import cn.geekhall.server.bean.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author yiny
 */
@RestController
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public Hello hello(){
        System.out.println("Hello method called.");
        Hello greeting = new Hello("1", "Hello Spring Boot2");
        return greeting;
    }
}
