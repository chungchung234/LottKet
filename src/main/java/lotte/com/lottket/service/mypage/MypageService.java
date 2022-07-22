package lotte.com.lottket.service.mypage;

import lotte.com.lottket.dto.OrderDto;
import lotte.com.lottket.dto.OrdersDto;
import lotte.com.lottket.dto.ShoworderDto;

import java.util.HashMap;
import java.util.List;

public interface MypageService {

    List<ShoworderDto> showAllMyOrders(Long userId);

    int changeOrderDestination(OrderDto dto);

    int cancelOrder(Long orderId);
}
