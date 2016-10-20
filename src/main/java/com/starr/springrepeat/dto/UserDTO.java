package com.starr.springrepeat.dto;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.map.annotate.JsonView;

public class UserDTO {


    public interface Public {}

    public interface Root extends Public {}

    @JsonView(Public.class)
    @Getter
    @Setter
    private String username;

    @JsonView(Root.class)
    @Getter
    @Setter
    private String password;

}
