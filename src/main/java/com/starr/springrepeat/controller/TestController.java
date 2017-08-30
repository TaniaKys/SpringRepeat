package com.starr.springrepeat.controller;

import com.starr.springrepeat.entity.User;
import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by tania on 30.08.17.
 */
@RestController
public class TestController {

    @RequestMapping(value="/getUser", method = RequestMethod.GET)
    @JsonView(User.Root.class)
    public User getUser(HttpServletRequest request) {
        ServletContext context = request.getServletContext();
        if (context.getAttribute("user") == null){
            User newUser = new User("tania", "123456");
            context.setAttribute("user", newUser);
        }
        return (User) context.getAttribute("user");
    }

    @RequestMapping(value="/editUser", method = RequestMethod.POST)
    public ResponseEntity<User> editUser(HttpServletRequest request, @RequestBody User user) {
        ServletContext context = request.getServletContext();
        if (context.getAttribute("user") != null){
            context.setAttribute("user", user);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
