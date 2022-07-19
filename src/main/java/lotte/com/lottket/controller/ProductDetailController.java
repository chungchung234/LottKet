package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import lotte.com.lottket.service.productdetail.ProductDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductDetailController {

    @Autowired
    ProductDetailService productDetailService;
    Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "getProductById.do")
    public String getProductById(Model model){
        int id = 2;

        ProductDto productDto = productDetailService.productById(id);
        model.addAttribute("productDto",productDto);

        return "detail";
    }

        @RequestMapping(value = "getProductImageById.do")
    public String getProductImageById(Model model){
        int id = 2;

        List<ProductImageDto> productImageDto = productDetailService.productImageById(id);
        System.out.println("productImageDto2"+productImageDto);
        model.addAttribute("ProductImageDto",productImageDto);

        return "detail";
    }
}
