package com.starr.springrepeat.controllers;

import com.starr.springrepeat.dto.UserDTO;
import com.starr.springrepeat.jsonview.ProfileView;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class MyController {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping (method = RequestMethod.GET)
    public String getPage(){
        return "index";
    }

    @RequestMapping(value="/jsonPublic", method = RequestMethod.GET)
    @ResponseBody
    public String getPublic() throws IOException {
        ObjectWriter objectWriter = objectMapper.writerWithView(ProfileView.Public.class);
        return objectWriter.writeValueAsString(createUser());
    }

    @RequestMapping(value="/jsonRoot", method = RequestMethod.GET)
    @ResponseBody
    public String getRoot() throws IOException {
        ObjectWriter objectWriter = objectMapper.writerWithView(ProfileView.Root.class);
        return objectWriter.writeValueAsString(createUser());
    }

    private UserDTO createUser(){
        UserDTO user = new UserDTO();
        user.setUsername("tania");
        user.setPassword("12345");
        return user;
    }
}
