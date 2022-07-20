package lotte.com.lottket.dao.cart;

import lotte.com.lottket.dto.CartDto;
import lotte.com.lottket.dto.ProductDto;

import java.util.List;

public interface CartDao {
     int insertCart(CartDto dto);
     int updateCart(CartDto dto);
     int deleteCart(CartDto dto);
     CartDto selectCart();
     List<CartDto> selectCartAll(String userId);
}
