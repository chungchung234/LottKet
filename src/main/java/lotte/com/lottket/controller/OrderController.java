package lotte.com.lottket.controller;

import lotte.com.lottket.dto.OrderDto;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.UserDto;
import lotte.com.lottket.service.product.ProductService;
import lotte.com.lottket.service.user.UserService;
import lotte.com.lottket.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    /**
     * Order 전 Order 정보를 보여주는 orderSheet
     * POST order/orderSheet.do
     * @param model
     * @param productId
     * @param userId
     * @param orderAmount
     * @return "orderSheet"
     */
    @RequestMapping(value = "order/orderSheet.do" , method = RequestMethod.POST)
    public String orderSheet(Model model,long productId, long userId, int orderAmount){

        UserDto user= userService.findByUserId(userId);
        ProductDto product = productService.findByProductId(productId);

        OrderDto order= new OrderDto(orderAmount, user.getUserAddress(), user.getUserDetailAddress(),
                product.getProductPrice()*orderAmount,user.getUserId(), user.getUserName(), user.getUserPhoneNumber(), product.getProductId(),product.getProductTitle(),product.getProductPrice());

        model.addAttribute("order",order);

        return "orderSheet";

    }
}
