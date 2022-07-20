package lotte.com.lottket.controller;

import lotte.com.lottket.dto.*;
import lotte.com.lottket.service.productdetail.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class ProductDetailController {

    @Autowired
    ProductDetailService productDetailService;
    //Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "detail.do")
    public String detail(Model model){
        int id=2;

        ProductDto productDto = productDetailService.productById(id);
        List<ProductImageDto> productImageDto = productDetailService.productImageById(id);
        List<ProductDetailDto> productDetailDto = productDetailService.productDetailById(id);
        List<ReviewJoinUser> reviewJoinUserDto = productDetailService.reviewById(id);
        List<ReviewJoinReply> reviewJoinReplyDto = productDetailService.replyById(id);

        model.addAttribute("productDto",productDto);
        model.addAttribute("productImageDto",productImageDto);
        model.addAttribute("productDetailDto", productDetailDto);
        model.addAttribute("reviewJoinUserDto", reviewJoinUserDto);
        model.addAttribute("reviewJoinReplyDto", reviewJoinReplyDto);

        return "detail";
    }

    @RequestMapping(value = "getProductById.do")
    public String getProductById(Model model){
        int id = 2;

        ProductDto productDto = productDetailService.productById(id);
        model.addAttribute("productDto",productDto);

        return "/detail.jsp";
    }

    @RequestMapping(value = "getProductImageById.do")
    public String getProductImageById(Model model){
        int id = 2;

        List<ProductImageDto> productImageDto = productDetailService.productImageById(id);
        model.addAttribute("productImageDto",productImageDto);

        return "/detail.jsp";
    }

    @RequestMapping(value = "getProductDetailById.do")
    public String getProductDetailById(Model model) {
        int id = 2;

        List<ProductDetailDto> productDetailDto = productDetailService.productDetailById(id);
        model.addAttribute("productDetailDto", productDetailDto);

        return "detail";
    }

    @RequestMapping(value = "getReviewById.do")
    public String getReviewById(Model model){
        int id = 2;

        List<ReviewJoinUser> reviewJoinUserDto = productDetailService.reviewById(id);
        model.addAttribute("reviewJoinUserDto", reviewJoinUserDto);

        return "detail";
    }

    @RequestMapping(value = "getReplyById.do")
    public String getReplyById(Model model){
        int id = 2;

        List<ReviewJoinReply> reviewJoinReplyDto = productDetailService.replyById(id);
        model.addAttribute("reviewJoinReplyDto", reviewJoinReplyDto);

        return "detail";
    }

    @RequestMapping(value = "insertReview.do")
    @ResponseBody
    public String insertReview(Model model) {
        int userId = 1;
        int productId = 2;
        String content = "또 먹고 싶어요";
        double rating = 5;

        HashMap<String, Object> review = new HashMap<String, Object>();
        review.put("userId", userId);
        review.put("productId", productId);
        review.put("content", content);
        review.put("rating", rating);

        int count = productDetailService.insertReview(review);

        return "hihi";
    }

    @RequestMapping(value = "insertReply.do")
    @ResponseBody
    public String insertReply(Model model){
        int replyId = 1;
        String content = "고맙습니다";

        HashMap<String, Object> reply = new HashMap<String, Object>();
        reply.put("replyId",replyId);
        reply.put("content",content);

        int count = productDetailService.insertReply(reply);

        return "hellohello";
    }
}
