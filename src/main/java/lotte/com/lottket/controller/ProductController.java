package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDto;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    /***
     * insert all products ( Create Database )
     * GET main.do
     * @param model
     * @return "product"
     * 
     * 도메인 productlist.do 로 가야만 db값 insert하는거 이상하니 추후 수정할게요 insert xml도 이후에
     */
    @RequestMapping(value="productlist.do", method = RequestMethod.GET)
    public String createDB(Model model){

        String ret = "";
        logger.info("ProductController createDB() ");

        Map<String, Object> paramMap = new HashMap<>();
        // if(db is empty) run();
        try {
            paramMap = DBInitialize.run();
            ret = "YES";
            productService.createDB(paramMap);
        } catch (IOException e) {
            e.printStackTrace();
            ret = "NO";
        }

        paramMap.get("productList")
        model.addAttribute("productList", paramMap.get("productList"));
        return "productlist";
    }

}
