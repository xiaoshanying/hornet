package com.wmz.open.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wmz on 2018/4/28.
 *
 * @author wmz
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "hello world";
    }

}
