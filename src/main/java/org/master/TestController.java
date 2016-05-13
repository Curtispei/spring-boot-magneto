package org.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by kaenr on 2016/5/13.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String get(){
        return "get";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String post(@RequestBody String body){
        System.out.println(body);
        return "post";
    }
}
