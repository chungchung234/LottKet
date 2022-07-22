package lotte.com.lottket.controller;

import com.google.gson.JsonObject;
import lotte.com.lottket.dto.OrderDto;
import lotte.com.lottket.dto.ShowcartDto;
import lotte.com.lottket.dto.ShoworderDto;
import lotte.com.lottket.service.mypage.MypageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MypageController {
    Logger logger = LoggerFactory.getLogger(MypageController.class);

    @Autowired
    MypageService service;

    /**
     * 내 주문 전부 조회
     */
//    @RequestMapping(value="mypage.do")
//    public String showAllMyOrders(@RequestBody Long userId, Model model) {
//        List<ShoworderDto> list = service.showAllMyOrders(userId);
//
//        model.addAttribute("list", list);
//        model.addAttribute("userId", userId);
//        return "mypage";
//    }

    // AJAX 용
    @RequestMapping(value="mypage.do",  method=RequestMethod.GET)
    public String showAllMyOrders(Long userId, Model model) {
        model.addAttribute("userId", userId);
        model.addAttribute("list", service.showAllMyOrders(userId));
        return "mypage";
    }

    /**
     * 배송지 변경  with Ajax Button
     */
    @RequestMapping(value="updateorderaddress.do", method = RequestMethod.POST)
    @ResponseBody
    public String changeOrderDestination(Long orderId, String newAddress, String newDetailAddress) {
        OrderDto dto = new OrderDto(orderId, newAddress, newDetailAddress);
        int count = service.changeOrderDestination(dto);

        return count>0?"YES":"NO";
    }


    /**
     * 주문 취소 Ajax Button
     * @param orderId
     * @return String
     */
    @RequestMapping(value="deleteorder.do", method = RequestMethod.GET)
    @ResponseBody
    public List<ShoworderDto> cancelOrder( long orderId, long userId) {

        service.cancelOrder(orderId);
        List<ShoworderDto> list=service.showAllMyOrders(userId);
        System.out.println(list.size());
        return list;
    }

}
