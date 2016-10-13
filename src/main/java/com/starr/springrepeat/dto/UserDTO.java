package com.starr.springrepeat.dto;

import org.codehaus.jackson.map.annotate.JsonView;

public class UserDTO {


    public interface Public {}

    public interface Root extends Public {}

    @JsonView(Public.class)
    private String username;

    @JsonView(Root.class)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
