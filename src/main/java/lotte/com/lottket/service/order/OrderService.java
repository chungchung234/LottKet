package lotte.com.lottket.service.order;

import lotte.com.lottket.dao.order.OrderDao;
import lotte.com.lottket.dto.OrderDto;

public interface OrderService {
    void saveOrder(OrderDto orderDto);

}
