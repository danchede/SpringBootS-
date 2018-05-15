package com.ifox.springbootswagger2.com.ifox.zc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in20:26 2018/5/15
 * @Modified By:
 */
@RestController
public class HelloController {

    @ApiIgnore
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        return "Hello World";
    }
}
