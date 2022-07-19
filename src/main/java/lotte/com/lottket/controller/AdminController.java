package lotte.com.lottket.controller;

import lotte.com.lottket.service.admin.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    //Logger logger = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value="admin/init", method = RequestMethod.GET)
    @ResponseBody
    public List<List<HashMap>> init(Model model) {
        List<List<HashMap>> data = new ArrayList<List<HashMap>>();
        data.add(adminService.selectDateTotal((HashMap) model.getAttribute("dateTotal")));
        data.add(adminService.selectPopulalityProduct((HashMap) model.getAttribute("populalityProduct")));
        data.add(adminService.selectAgeStastistics((HashMap) model.getAttribute("ageTotal")));
        data.add(adminService.selectGenderStastistics((HashMap) model.getAttribute("genderTotal")));
        return data;
    }

    @RequestMapping(value = "admin.do")
    public String adminInit(Model model) {

        return "admin";
    }


    @RequestMapping(value="/category", method = RequestMethod.GET)
    @ResponseBody
    public String selectDateTotal(Model model) {
        List<HashMap> selectDateTotal = adminService.selectDateTotal((HashMap) model);
        return "";
    }

    @RequestMapping(value = "/orders")
    public List<HashMap> selectOrder(Model model){
        return adminService.selectTotalOrders((HashMap) model.getAttribute("totalOrders"));
    }

    @RequestMapping(value = "orders.do")
    public String orders(Model model) {
        selectOrder(model);
        return "orders";
    }




}
