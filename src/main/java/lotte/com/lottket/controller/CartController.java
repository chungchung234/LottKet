//package lotte.com.lottket.controller;
//
//import lotte.com.lottket.dto.CartDto;
//import lotte.com.lottket.dto.ProductDto;
//import lotte.com.lottket.dto.UserDto;
//import lotte.com.lottket.service.cart.CartService;
//import lotte.com.lottket.service.main.MainService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//
//@Controller
//public class CartController {
//    /**
//     * 장바구니 페이지 내에서는 완전히 새로운 상품을 추가 불가능하다
//     * 제품 상세페이지 -> ' 장바구니에 추가 ' 로만 새 상품 추가 가능
//     *
//     * 따라서 장바구니 페이지 내에서는 이미 담긴 물품들 수량 up, down, delete만 가능
//     */
//    @Autowired
//    CartService cartService;
//    Logger logger = LoggerFactory.getLogger(CartController.class);
//
//    /**
//     * 내 장바구니 모든 물품 조회
//     * @param model
//     * @param userId
//     * @return
//     */
//    @RequestMapping(value = "mycart.do", method = RequestMethod.POST)
//    public String findAll(Model model, String userId) {
//
//        List<CartDto> mycartList = cartService.findAll(userId);
//        model.addAttribute("myCartList", mycartList);
//        return "mycart";
//    }
//
//    /**
//     * 장바구니에 기존에 안담겨있던 새 물품 추가 ( 제품 상세에서 버튼으로 Ajax )
//     * @param model
//     * @return
//     */
//    @RequestMapping(value = "mycart.do", method = RequestMethod.POST)
//    @ResponseBody
//    public String addNewProductToCart(Model model,
//                          String userId, String pid, int amount) {
//        int count = cartService.addNewProductToCart(userId, pid, amount);
//        return count>0?"YES":"NO";
//    }
//
//    @RequestMapping(value = "deleteOneCart.do")
//    public String mycart(Model model) {
//        ProductDto dto = cartService.selectAll();
//        model.addAttribute("dto", dto);
//        return "main";
//    }
//
//    @RequestMapping(value = "deleteAllCart.do")
//    public String deleteAllCart(Model model) {
//        ProductDto dto = cartService.selectAll();
//        model.addAttribute("dto", dto);
//        return "main";
//    }
//}
