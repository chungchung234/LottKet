package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDetailDto;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import lotte.com.lottket.service.product.DBInitialize;
import lotte.com.lottket.service.product.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DbController {
    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService service;

    /**
     * 도메인 productlist.do 로 가야만 db값 insert하는거 이상하니 추후 수정할게요 insert xml도 이후에
     */
    @RequestMapping(value="db.do", method = RequestMethod.GET)
    public String insertAllProducts(){
//        String ret = "";
        logger.info("ProductController insertAllProducts() ");

        Map<String, Object> paramMap = new HashMap<>();
        List<ProductDto> productList = new ArrayList<>();
        List<ProductImageDto> productImageList = new ArrayList<>();
        List<ProductDetailDto> productDetailList = new ArrayList<>();


        // DB 비어야지만 불러오기
        if(service.checkIfEmptyDB()) {
    
            try {
                paramMap = DBInitialize.run();
                productList = (List<ProductDto>) paramMap.get("productList");
                productImageList = (List<ProductImageDto>) paramMap.get("productImageList");
                productDetailList = (List<ProductDetailDto>) paramMap.get("productDetailList");
    
    
                System.out.println(" =============== HEREHERE ================");
                System.out.println("PRODUCT TABLE IS NULL");
    
                System.out.println(productList.size());
                System.out.println(productImageList.size());
                System.out.println(productDetailList.size());
    
                /** product table insert data */
                for (int i = 0; i < productList.size(); i++) {
                        service.insertOneProduct(productList.get(i));
                    System.out.println(i+" : "+productList.get(i).toString());
                }
                /** productImage table insert data */
                for (int i = 0; i < productImageList.size(); i++) {
                        service.insertOneImage(productImageList.get(i));
                    System.out.println(i+" : "+productImageList.get(i).toString());
                }
                /** productDetail table insert data */
                for (int i = 0; i < productDetailList.size(); i++) {
                        service.insertOneDetailImage(productDetailList.get(i));
                    System.out.println(i+" : "+productDetailList.get(i).toString());
                }
    
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        model.addAttribute("productList", productList);
//            return "main";
        
        return "category";

    }
}
