package cn.wxx.user.controller;

import cn.wxx.user.entity.UserVoDetailEntity;
import cn.wxx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2020/2/9 16:07
 * @Created by duanyu
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public UserVoDetailEntity info(String username){
        return userService.getByUsername(username);
    }
}
