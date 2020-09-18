package cn.codingjc.vhr2020.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author coding_jc
 * @date 2020/9/14
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
