package lotte.com.lottket.dao.user;

import lotte.com.lottket.dto.UserDto;

public interface UserDao {
    int signIn(UserDto dto);

    int signUp(UserDto dto);

    UserDto getUser(UserDto dto);
}
