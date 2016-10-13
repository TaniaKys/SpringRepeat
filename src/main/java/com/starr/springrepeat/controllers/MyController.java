package com.starr.springrepeat.controllers;

import com.starr.springrepeat.dto.UserDTO;
import com.starr.springrepeat.jsonview.ProfileView;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MyController {

    @RequestMapping (method = RequestMethod.GET)
    public String getPage(){
        return "index";
    }

    @RequestMapping(value="/jsonPublic", method = RequestMethod.GET)
    @JsonView(ProfileView.Public.class)
    public UserDTO getPublic() {
        return createUser();
    }

    @RequestMapping(value="/jsonRoot", method = RequestMethod.GET)
    @JsonView(ProfileView.Root.class)
    public UserDTO getRoot() {
        return createUser();
    }

    private UserDTO createUser(){
        UserDTO user = new UserDTO();
        user.setUsername("tania");
        user.setPassword("12345");
        return user;
    }
}
