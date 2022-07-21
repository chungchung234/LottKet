package lotte.com.lottket.service.mypage;

import lotte.com.lottket.dto.OrderDto;

import java.util.HashMap;
import java.util.List;

public interface MypageService {

    List<HashMap> showAllMyOrders(Long userId);

    int changeOrderDestination(HashMap<String, Object> map);

    int cancelOrder(Long orderId);
}
