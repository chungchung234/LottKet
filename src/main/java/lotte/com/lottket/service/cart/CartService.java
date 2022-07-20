package lotte.com.lottket.service.cart;

import lotte.com.lottket.dto.CartDto;

import java.util.List;

public interface CartService {
    int insertCart(CartDto dto);

    List<CartDto> selectAllByUid(String userId);
}
