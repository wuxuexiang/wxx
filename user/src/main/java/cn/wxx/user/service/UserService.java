package cn.wxx.user.service;

import cn.wxx.user.entity.UserVoDetailEntity;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/2/9 15:36
 * @Created by duanyu
 */
public interface UserService {
    /**
     * 通过用户名获取用户详情
     *
     * @param username
     * @return
     */
    UserVoDetailEntity getByUsername(String username);
}
