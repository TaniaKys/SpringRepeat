package com.starr.springrepeat.controller;

import com.starr.springrepeat.entity.User;
import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value="/jsonPublic", method = RequestMethod.GET)
    @JsonView(User.Public.class)
    public User getPublic() {
        return new User();
    }

    @RequestMapping(value="/jsonRoot", method = RequestMethod.GET)
    @JsonView(User.Root.class)
    public User getRoot() {
        return new User();
    }


}
