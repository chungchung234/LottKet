package lotte.com.lottket.controller;


import lotte.com.lottket.dto.ProductDto;
import lotte.com.lottket.service.main.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    MainService mainService;
    Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = "main.do")
    public String mainFunc(Model model) {
        ProductDto dto = mainService.selectAll();
        model.addAttribute("dto", dto);
        return "main";
    }


}






