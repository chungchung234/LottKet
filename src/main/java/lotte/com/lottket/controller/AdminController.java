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

    Logger logger = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping(value="admin/selectPopulalityProduct", method = RequestMethod.GET)
    @ResponseBody
    public List<HashMap> selectPopulalityProduct(Model model) {
        return adminService.selectPopulalityProduct((HashMap) model.getAttribute("populalityProduct"));
    }

    @RequestMapping(value="admin/selectDateTotal", method = RequestMethod.GET)
    @ResponseBody
    public List<HashMap> selectDateTotal(Model model) {
        return adminService.selectDateTotal((HashMap) model.getAttribute("dateTotal"));
    }

    @RequestMapping(value="admin/selectAgeStastistics", method = RequestMethod.GET)
    @ResponseBody
    public List<HashMap> selectAgeStastistics(Model model) {
        return adminService.selectAgeStastistics((HashMap) model.getAttribute("ageTotal"));
    }

    @RequestMapping(value="admin/selectGenderStastistics", method = RequestMethod.GET)
    @ResponseBody
    public List<HashMap>  selectGenderStastistics(Model model) {

        return adminService.selectGenderStastistics((HashMap) model.getAttribute("genderTotal"));
    }

    @RequestMapping(value = "admin.do")
    public String adminInit(Model model) {

        return "admin";
    }

    @RequestMapping(value = "admin/orders")
    public List<HashMap> selectOrder(Model model){
        return adminService.selectTotalOrders((HashMap) model.getAttribute("totalOrders"));
    }

    @RequestMapping(value = "orders.do")
    public String orders(Model model) {
        return "orders";
    }

    @RequestMapping(value="admin/selectTotalOrders", method = RequestMethod.GET)
    @ResponseBody
    public List<HashMap>  selectTotalOrders(Model model) {

        return adminService.selectTotalOrders((HashMap) model.getAttribute("selectTotalOrders"));
    }




}
