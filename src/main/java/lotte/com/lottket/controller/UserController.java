package lotte.com.lottket.controller;

import lotte.com.lottket.dto.UserDto;
import lotte.com.lottket.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService service;

    @RequestMapping(value="signIn.do", method = RequestMethod.GET)
    @ResponseBody
    public String signIn(UserDto dto) {
        int count = service.signIn(dto);

        return count>0?"YES":"NO";
    }

    @RequestMapping(value="signUp.do", method = RequestMethod.POST)
    @ResponseBody
    public int signUp(UserDto dto) {
        return service.signUp(dto);
    }

    @RequestMapping(value="getUser.do", method = RequestMethod.GET)
    public UserDto getUser(UserDto dto) {
        return service.getUser(dto);
    }
}
