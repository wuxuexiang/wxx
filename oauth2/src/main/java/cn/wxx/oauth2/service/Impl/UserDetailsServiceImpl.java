package cn.wxx.oauth2.service.Impl;

import cn.wxx.oauth2.entity.UserVoDetailEntity;
import cn.wxx.oauth2.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Classname UserDetailsServiceImpl
 * @Description TODO
 * @Date 2020/2/7 14:50
 * @Created by duanyu
 */
@Component("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 这里调用用户表查询用户详细信息

        UserVoDetailEntity userVoDetailEntity = userService.info(username);

        if (Objects.isNull(userVoDetailEntity)) {
            throw new UsernameNotFoundException("账号不存在");
        } else {
            // 用户角色也应在数据库中获取
            String role = "ROLE_ADMIN";
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(role));
//            // 线上环境应该通过用户名查询数据库获取加密后的密码
//            String password = "{noop}123456";
//            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//            for (String s : userVoDetailEntity.getRoles()){
//                authorities.add(new SimpleGrantedAuthority(s));
//            }
            return new org.springframework.security.core.userdetails.User(userVoDetailEntity.getUsername(), "{noop}"+userVoDetailEntity.getPassword(), authorities);
        }
    }
}
