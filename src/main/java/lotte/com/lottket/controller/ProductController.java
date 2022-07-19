package lotte.com.lottket.controller;

import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.service.product.ProductService;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    ProductService service;

    @RequestMapping(value="insertProduct.do", method = RequestMethod.GET)
    @ResponseBody
    public String insertProduct(ProductDto dto) {
        int count = service.insertProduct(dto);
        return count>0?"YES":"NO";
    }

    @RequestMapping(value="updateProduct.do", method = RequestMethod.GET)
    @ResponseBody
    public String updateProduct(ProductDto dto) {
        int count = service.updateProduct(dto);
        return count>0?"YES":"NO";
    }

    @RequestMapping(value="deleteProduct.do", method = RequestMethod.GET)
    @ResponseBody
    public String deleteProduct(ProductDto dto) {
        int count = service.deleteProduct(dto);
        return count>0?"YES":"NO";
    }

    /***
     *
     * @param dto
     * @return
     */
    @RequestMapping(value="selectProduct.do", method = RequestMethod.GET)
    @ResponseBody
    //json
    public String selectProduct(ProductDto dto) throws IOException {
        Long id = (Long)service.getId(dto);
        dto.setProductId(id);

        JSONObject obj = new JSONObject();
        ObjectMapper mapper = new ObjectMapper();

        ProductDto result = service.selectProduct(dto);
        String resultJson = mapper.writeValueAsString(result);
        return resultJson;
    }

    @RequestMapping(value="selectProductAll.do", method = RequestMethod.GET)
    //@ResponseBody
    public List<ProductDto> selectProductAll() {
        return service.selectProductAll();
    }

    @RequestMapping(value="selectProductFind.do", method = RequestMethod.GET)
    //@ResponseBody
    public List<ProductDto> selectProductFind(String productTitle) {
        return service.selectProductFind(productTitle);
    }

    @RequestMapping(value="selectBestProduct.do", method = RequestMethod.GET)
    @ResponseBody
    public String selectBestProduct(Model model) { //List<ProductDto>
        //model.addAttribute(service.selectBestProduct());
        //service.selectBestProduct();
        //return "selectBestProduct.do";
        return service.selectBestProduct().toString();
    }

    @RequestMapping(value="selectWeeklyBestProduct.do", method = RequestMethod.GET)
    public List<ProductImageDto> selectWeeklyBestProduct() {
        return service.selectWeeklyBestProduct();
    }

    @RequestMapping(value="selectNewProduct.do", method = RequestMethod.GET)
    public List<ProductDto> selectNewProduct() {
        return service.selectNewProduct();
    }

}
