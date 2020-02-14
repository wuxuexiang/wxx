package cn.wxx.user.entity;

import lombok.Data;

/**
 * @Classname UserVoDetail
 * @Description TODO
 * @Date 2020/2/6 21:52
 * @Created by duanyu
 */
@Data
public class UserVoDetailEntity {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

//    /**
//     * 角色
//     */
//    private List<String> roles;
}
