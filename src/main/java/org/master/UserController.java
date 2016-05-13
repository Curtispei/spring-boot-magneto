package org.master;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kaenr on 2016/5/13.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{name}")
    public String user(@PathVariable String name, ModelMap modelMap){
        modelMap.put("name", name);
        return "user";
    }
}
