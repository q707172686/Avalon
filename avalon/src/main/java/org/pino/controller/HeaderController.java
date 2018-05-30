package org.pino.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

import javax.servlet.http.Part;

/**
 * @Author: Pino
 * @Description:
 * @Date: 下午4:57 18-5-30
 * @Modified:
 */
@Controller
public class HeaderController {

    @RequestMapping(value = "/header", method = RequestMethod.POST)
    public String header(@RequestPart("header") Part header) {
        System.out.println("到了Header");
        System.out.println(header.getSubmittedFileName());
        return "Hello";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        System.out.println("哈哈");
        return "../index";
    }
}
