package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import lotte.com.lottket.service.category.CategoryService;
import lotte.com.lottket.service.product.DBInitialize;
import lotte.com.lottket.service.product.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    /**
     * 도메인 productlist.do 로 가야만 db값 insert하는거 이상하니 추후 수정할게요 insert xml도 이후에
     */
    @RequestMapping(value="productlist.do", method = RequestMethod.GET)
    public String insertAllProducts(Model model){

        String ret = "";
        logger.info("ProductController insertAllProducts() ");

        Map<String, Object> paramMap = new HashMap<>();
        List<ProductDto> productList = new ArrayList<>();
        List<ProductImageDto> productImageList = new ArrayList<>();

//        if(productService.checkIfEmptyDB()) {
            try {
                paramMap = DBInitialize.run();
                productList = (List<ProductDto>) paramMap.get("productList");
                productImageList = (List<ProductImageDto>) paramMap.get("productImageList");

//                for (int i = 0; i < productList.size(); i++) {
//                    productService.insertOneProduct(productList.get(i));
//                    System.out.println(i+" : "+productList.get(i).toString());
//                }
                for (int i = 0; i < productImageList.size(); i++) {
                    productService.insertOneImage(productImageList.get(i));
                    System.out.println(i+" : "+productImageList.get(i).toString());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
//        }

        model.addAttribute("productList", productList);
        return "main";
    }



}
