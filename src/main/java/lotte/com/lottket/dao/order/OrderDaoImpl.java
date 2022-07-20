package lotte.com.lottket.dao.order;

import lotte.com.lottket.dto.OrderDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao{

    @Autowired
    SqlSession session;

    final String ns="Order.";
    @Override
    public void saveOrder(OrderDto orderDto) {
        session.insert(ns+"saveOrder",orderDto);

    }
}
