//package lotte.com.lottket.controller;
//
//import lotte.com.lottket.dto.UserDto;
//import lotte.com.lottket.service.mypage.MypageService;
//import lotte.com.lottket.service.user.UserSevice;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//public class MypageController {
//    Logger logger = LoggerFactory.getLogger(MypageController.class);
//
//    @Autowired
//    MypageService service;
//
//    @RequestMapping(value="mypage.do", method = RequestMethod.GET)
//    public String showUserInfo(UserDto dto, Model model) {
//        int count = service.signIn(dto);
//
//        return count>0?"YES":"NO";
//    }
//
//    @RequestMapping(value="myorder.do", method = RequestMethod.GET)
//    public String showUserOrder(UserDto dto) {
//        int count = service.signIn(dto);
//
//        return count>0?"YES":"NO";
//    }
//}
