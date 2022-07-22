package lotte.com.lottket.dao.cart;

import lotte.com.lottket.dto.CartDto;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ShowcartDto;

import java.util.List;

public interface CartDao {

     List<ShowcartDto> selectCartAll(Long userId);

     int insertCart(CartDto dto);

     int deleteOneCart(Long cartId);

     int deleteAllCart(Long userId);
}
