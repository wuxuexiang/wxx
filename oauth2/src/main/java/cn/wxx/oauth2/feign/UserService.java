package cn.wxx.oauth2.feign;

import cn.wxx.oauth2.entity.UserVoDetailEntity;
import cn.wxx.oauth2.feign.impl.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/2/9 18:13
 * @Created by duanyu
 */
@FeignClient(name = "user", fallback = RemoteHystrix.class)
public interface UserService {

    @GetMapping("user/info")
    UserVoDetailEntity info(@RequestParam("username") String username);
}
