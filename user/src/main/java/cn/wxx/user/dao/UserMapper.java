package cn.wxx.user.dao;

import cn.wxx.user.entity.UserVoDetailEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/2/9 15:46
 * @Created by duanyu
 */
@Mapper
public interface UserMapper {
    UserVoDetailEntity getByUsername(String username);
}
