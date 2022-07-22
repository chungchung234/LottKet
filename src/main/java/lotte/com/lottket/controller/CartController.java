package lotte.com.lottket.controller;

import lotte.com.lottket.dto.CartDto;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ShowcartDto;
import lotte.com.lottket.dto.UserDto;
import lotte.com.lottket.service.cart.CartService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CartController {
    Logger logger = LoggerFactory.getLogger(CartController.class);

    /**
     * 장바구니 페이지 내에서는 완전히 새로운 상품을 추가 불가능하다
     * 제품 상세페이지 -> ' 장바구니에 추가 ' 로만 새 상품 추가 가능
     *
     * 따라서 장바구니 페이지 내에서는 이미 담긴 물품들 수량 up, down, delete만 가능
     */
    @Autowired
    CartService cartService;

    /**
     * 내 장바구니 모든 물품 조회
     * @param model
     * @param userId
     * @return
     */
    @RequestMapping(value = "cart.do", method = RequestMethod.GET)
    public String findAllCart(Long userId, Model model) {
        model.addAttribute("cartList", cartService.findAllCart(userId));
        model.addAttribute("userId", userId);
        return "cart";
    }

    /**
     * 장바구니에 기존에 안담겨있던 새 물품 추가 ( 제품 상세에서 버튼으로 Ajax )
     * @param, Long userId, Long productId, int amount
     * @return String
     */
    @RequestMapping(value = "newcart.do", method = RequestMethod.GET)
    public String addNewCart(Model model, long productId,
                             long userId,
                             int amount) {
        CartDto cartDto = new CartDto(userId, productId, amount);
        cartService.addNewCart(cartDto);
        model.addAttribute("cartList", cartService.findAllCart(userId));
        model.addAttribute("userId", userId);
        System.out.println(cartDto.toString());
        return "cart";
    }

    /**
     * 카트 한개 삭제 Ajax 버튼으로 처리
     * Long cartId
     * @return
     */
    @RequestMapping(value = "deletecart.do", method= RequestMethod.GET)
    @ResponseBody
    public List<ShowcartDto> deleteOneCart(Long cartId, long userId) {
        System.out.println(cartId);
        cartService.deleteOneCart(cartId);

        return cartService.findAllCart(userId);
    }

    /**
     * 카트 전부 삭제 Ajax 버튼으로 처리
     * @param model, Long userId
     * @return String
     */
    @RequestMapping(value = "deleteallcart.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteAllCart(Model model, @RequestBody Long userId) {
        int count = cartService.deleteAllCart(userId);
//        model.addAttribute("userId", userId);
        return count>0?"YES":"NO";
    }
}
