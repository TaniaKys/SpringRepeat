package com.starr.springrepeat.util;

import com.starr.springrepeat.dto.UserDTO;

final public class UserUtil {

    private UserUtil() {
    }

    public static UserDTO createUser() {
        UserDTO user = new UserDTO();
        user.setUsername("tania");
        user.setPassword("12345");
        return user;
    }

}
