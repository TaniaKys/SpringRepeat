package com.starr.springrepeat.dto;

import com.starr.springrepeat.jsonview.ProfileView;
import org.codehaus.jackson.map.annotate.JsonView;

public class UserDTO {

    @JsonView(ProfileView.Public.class)
    private String username;

    @JsonView(ProfileView.Root.class)
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
