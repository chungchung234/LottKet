package lotte.com.lottket.controller;

import com.google.gson.Gson;
import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.dto.ProductImageDto;
import lotte.com.lottket.service.product.ProductService;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    ProductService service;

    @RequestMapping(value="main.do", method = RequestMethod.GET)
    public String main(Model model) {
        List<ProductImageDto> bestProduct = selectBestProduct();
        List<ProductImageDto> weeklyBestProduct = selectWeeklyBestProduct();
        List<ProductImageDto> newProduct = selectNewProduct();
        model.addAttribute("bestProduct", bestProduct);
        model.addAttribute("weeklyBestProduct", weeklyBestProduct);
        model.addAttribute("newProduct", newProduct);
        return "main";
    }

    @RequestMapping(value="insertProduct.do", method = RequestMethod.POST)
    @ResponseBody
    public String insertProduct(@RequestBody ProductDto dto) {
        int count = service.insertProduct(dto);
        return count>0?"YES":"NO";
    }

    @RequestMapping(value="updateProduct.do", method = RequestMethod.POST)
    @ResponseBody
    public String updateProduct(@RequestBody ProductDto dto) {
        int count = service.updateProduct(dto);
        return count>0?"YES":"NO";
    }

    @RequestMapping(value="deleteProduct.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteProduct(@RequestBody ProductDto dto) {
        int count = service.deleteProduct(dto);
        return count>0?"YES":"NO";
    }

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

    @RequestMapping(value="selectProductAll.do", method = RequestMethod.POST)
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
    public List<ProductImageDto> selectBestProduct() {
        List<ProductImageDto> dto = service.selectBestProduct();
//        Gson gson = new Gson();
//        String result = gson.toJson(dto);
        return dto;
    }

    @RequestMapping(value="selectWeeklyBestProduct.do", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductImageDto> selectWeeklyBestProduct() {
        List<ProductImageDto> dto = service.selectWeeklyBestProduct();
//        Gson gson = new Gson();
//        String result = gson.toJson(dto);
        return dto;
    }

    @RequestMapping(value="selectNewProduct.do", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductImageDto> selectNewProduct() {
        List<ProductImageDto> dto = service.selectNewProduct();
//        Gson gson = new Gson();
//        String result = gson.toJson(dto);

        return dto;
    }
}
