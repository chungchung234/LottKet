package lotte.com.lottket.dao.user;

import lotte.com.lottket.dto.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    UserDao dao;
    UserDto dto;
    SqlSession session;
    @Before
    public void init() {
        dao = new UserDaoImpl();

    }
    @Test
    public void signIn() {
        dto = new UserDto((long) 1);
        assertEquals(1, dao.signIn(dto));
    }

    @Test
    public void signUp() {
    }

    @Test
    public void getUser() {
    }
}