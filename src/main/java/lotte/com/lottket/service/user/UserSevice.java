package lotte.com.lottket.service.user;

import lotte.com.lottket.dto.UserDto;

public interface UserSevice {
    int signIn(UserDto dto);

    int signUp(UserDto dto);

    UserDto getUser(UserDto dto);
}
