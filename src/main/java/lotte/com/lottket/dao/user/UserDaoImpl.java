package lotte.com.lottket.dao.user;

import lotte.com.lottket.dto.UserDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    SqlSession session;

    String ns = "User.";

    /***
     *
     * @param dto
     * @return
     */
    @Override
    public int signIn(UserDto dto) {
        return session.selectOne(ns + "signIn");
    }

    /***
     *
     * @param dto
     * @return
     */
    @Override
    public int signUp(UserDto dto) {
        return session.insert(ns + "signUp");
    }

    /***
     *
     * @param dto
     * @return
     */
    @Override
    public UserDto getUser(UserDto dto) {
        return session.selectOne(ns + "getUser");
    }

    @Override
    public UserDto findByUserId(long userId) {
        return session.selectOne(ns+"findByUserId",userId);
    }

}