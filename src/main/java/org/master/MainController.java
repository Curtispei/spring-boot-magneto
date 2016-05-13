package org.master;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kaenr on 2016/5/13.
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
