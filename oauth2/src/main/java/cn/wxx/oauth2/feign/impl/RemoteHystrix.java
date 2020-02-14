package cn.wxx.oauth2.feign.impl;

import cn.wxx.oauth2.entity.UserVoDetailEntity;
import cn.wxx.oauth2.feign.UserService;
import org.springframework.stereotype.Service;

/**
 * @Classname RemoteHystrix
 * @Description TODO
 * @Date 2020/2/9 18:16
 * @Created by duanyu
 */
@Service
public class RemoteHystrix implements UserService {

    @Override
    public UserVoDetailEntity info(String username) {
        return null;
    }
}
