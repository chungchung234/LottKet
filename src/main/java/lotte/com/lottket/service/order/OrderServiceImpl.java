package lotte.com.lottket.service.order;

import lotte.com.lottket.dao.order.OrderDao;
import lotte.com.lottket.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderDao orderDao;
    @Override
    public void saveOrder(OrderDto orderDto) {
        orderDao.saveOrder(orderDto);
    }

}
