package lotte.com.lottket.dao.cart;

import lotte.com.lottket.dto.CartDto;
import lotte.com.lottket.dto.ProductDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartDaoImpl implements CartDao{
    @Autowired
    SqlSession session;

    String ns = "Cart.";

    @Override
    public int insertCart(CartDto dto) {
        return session.insert(ns + "insertCart");
    }
    @Override
    public int updateCart(CartDto dto) {
        return session.update(ns + "updateCart");
    }

    @Override
    public int deleteCart(CartDto dto) {
        return session.delete(ns + "deleteCart");
    }

    @Override
    public CartDto selectCart() {
        return (CartDto)session.selectOne(ns + "selectOne");
    }
    @Override
    public List<CartDto> selectCartAll(String userId) {
        return session.selectList(ns + "selectCartAll");
    }

}
