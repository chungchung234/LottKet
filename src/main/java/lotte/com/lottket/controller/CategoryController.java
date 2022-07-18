package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.service.category.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CategoryController {

    Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value="category.do", method = RequestMethod.GET)
    public String findByCategoryOrderByProductPrice(Model model, String productCategory){
        logger.info("CategoryController findByCategoryOrderByProductPrice()"+productCategory);

        List<ProductDto> list=categoryService.findByCategoryOrderByProductPrice(productCategory);
        model.addAttribute("productList",list);

        return "main";
    }
}
