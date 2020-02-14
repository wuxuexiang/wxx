package cn.wxx.oauth2.entity;

import lombok.Data;

/**
 * @Classname UserRolesEntity
 * @Description TODO
 * @Date 2020/2/9 16:03
 * @Created by duanyu
 */
@Data
public class UserRolesEntity {
    /**
     * 角色id
     */
    private String roleId;
    /**
     * 用户id
     */
    private String userId;

    /**
     * 角色
     */
    private String roles;
}
