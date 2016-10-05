package com.starr.springrepeat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping (method = RequestMethod.GET)
    public String getPage(){
        return "index";
    }
}
