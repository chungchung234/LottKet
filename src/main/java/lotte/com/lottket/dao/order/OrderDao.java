package lotte.com.lottket.dao.order;

import lotte.com.lottket.dto.OrderDto;

public interface OrderDao {
    void saveOrder(OrderDto orderDto);
}
