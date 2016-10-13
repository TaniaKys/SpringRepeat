package com.starr.springrepeat.controllers;

import com.starr.springrepeat.dto.UserDTO;
import com.starr.springrepeat.utils.UserUtil;
import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping(value="/jsonPublic", method = RequestMethod.GET)
    @JsonView(UserDTO.Public.class)
    public UserDTO getPublic() {
        return UserUtil.createUser();
    }

    @RequestMapping(value="/jsonRoot", method = RequestMethod.GET)
    @JsonView(UserDTO.Root.class)
    public UserDTO getRoot() {
        return UserUtil.createUser();
    }


}
