package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.service.category.CategoryService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryController {

    Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    CategoryService categoryService;

    /***
     * 낮은 가격 순 조회
     * GET category/productPrice.do
     * @param model
     * @param productCategory
     * @param search
     * @return "category"
     */
    @RequestMapping(value="category/productPrice.do", method = RequestMethod.GET)
    public String findByCategoryOrderByProductPrice(Model model,String productCategory, String search){
        logger.info("CategoryController findByCategoryOrderByProductPrice() ");

        if(search==null) search="";
        search="%"+search+"%";

        Map<String, Object> param=new HashMap<>();
        param.put("productCategory",productCategory);
        param.put("search",search);

        List<ProductDto> productList=categoryService.findByCategoryOrderByProductPrice(param);
        model.addAttribute("productList",productList);

        return "category";
    }

    /***
     * Product 등록 최신순으로 조회
     * GET category/regDate.do
     * @param model
     * @param productCategory
     * @param search
     * @return "category"
     */
    @RequestMapping(value="category/regDate.do", method = RequestMethod.GET)
    public String findByCategoryOrderByProductRegDate(Model model,String productCategory, String search){
        logger.info("CategoryController findByCategoryOrderByProductRegDate() ");

        if(search==null) search="";
        search="%"+search+"%";

        Map<String, Object> param=new HashMap<>();
        param.put("productCategory",productCategory);
        param.put("search",search);

        List<ProductDto> productList=categoryService.findByCategoryOrderByProductRegDate(param);
        model.addAttribute("productList",productList);

        return "category";
    }

    /***
     * 높은 평점 순으로 조회
     * GET category/totalRate.do
     * @param model
     * @param productCategory
     * @param search
     * @return
     */
    @RequestMapping(value="category/totalRate.do", method = RequestMethod.GET)
    public String findByCategoryOrderByProductTotalRate(Model model,String productCategory, String search){
        logger.info("CategoryController findByCategoryOrderByProductRegDate() ");

        if(search==null) search="";
        search="%"+search+"%";

        Map<String, Object> param=new HashMap<>();
        param.put("productCategory",productCategory);
        param.put("search",search);

        List<ProductDto> productList=categoryService.findByCategoryOrderByProductTotalRate(param);
        model.addAttribute("productList",productList);

        return "category";
    }
}
