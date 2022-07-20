package lotte.com.lottket.service.cart;

import lotte.com.lottket.dao.cart.CartDao;
import lotte.com.lottket.dto.CartDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartDao dao;

    public int insertCart(CartDto dto) {
        return dao.insertCart(dto);
    }

    @Override
    public List<CartDto> selectAllByUid(String userId) {
        return dao.selectCartAll(userId);
    }
}
