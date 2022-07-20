package lotte.com.lottket.controller;

import com.google.gson.Gson;
import lotte.com.lottket.dto.UserDto;
import lotte.com.lottket.service.user.UserService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService service;

    @RequestMapping(value="login.do", method= RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="logout.do" ,method = RequestMethod.GET)
    public String logout() {
        return "logout";
    }

    @RequestMapping(value="signIn.do", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String signIn(@RequestBody String json) {
        System.out.println(json);
        //더 좋은 방법 없을까
        JSONObject jObject = new JSONObject(json);
        //userId
        Long userId = jObject.getLong("id");
        JSONObject kakao = jObject.getJSONObject("kakao_account");
        //userAge
        String userAge = kakao.getString("age_range");
        //userBirthday
        String userBirthday = kakao.getString("birthday");
        //userEmail
        String userEmail = kakao.getString("email");
        //userGender
        String userGender = kakao.getString("gender");

        JSONObject profile = kakao.getJSONObject("profile");
        //userName
        String userName = profile.getString("nickname");
        //userProfileImage
        String userProfileImage = profile.getString("thumbnail_image_url");

        //address, detailAddress는 따로 받아 온다고 생각.
        String userAddress="";
        String userDetailAddress="";
        UserDto dto = new UserDto(userId, userName, userProfileImage, userAddress, userDetailAddress, null, null, userGender, userAge, userBirthday, userEmail);
        //UserDto dto = new UserDto(userId);
        int count = service.signIn(dto);

        switch(count) {
            case 0:
                return "fail";
            case 1:
                return "signIn";
            case 2:
                return "signUp";
        }
        return "error";
    }


    @RequestMapping(value="getUser.do", method = RequestMethod.GET)
    public UserDto getUser(UserDto dto) {
        return service.getUser(dto);
    }

    @RequestMapping(value="updateAddress.do", method = RequestMethod.POST)
    @ResponseBody
    public int updateAddress(UserDto dto) {
        return service.updateAddress(dto);
    }
}
