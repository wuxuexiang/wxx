package cn.wxx.user.service.Impl;

import cn.wxx.user.dao.UserMapper;
import cn.wxx.user.entity.UserVoDetailEntity;
import cn.wxx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/2/9 15:44
 * @Created by duanyu
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVoDetailEntity getByUsername(String username) {
        return userMapper.getByUsername(username);
    }
}
