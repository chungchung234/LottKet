package lotte.com.lottket.service.user;

import lotte.com.lottket.dao.user.UserDao;
import lotte.com.lottket.dto.UserDto;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    @Autowired
    UserDao dao;
    UserDto dto;

    @Test
    public void signIn() {
        assertEquals(dao.signIn(dto), 1);
    }

    @Test
    public void signUp() {
    }

    @Test
    public void getUser() {
    }
}