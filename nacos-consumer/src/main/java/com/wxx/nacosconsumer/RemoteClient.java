package com.wxx.nacosconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Classname RemoteClient
 * @Description TODO
 * @Date 2020/1/16 16:21
 * @Created by duanyu
 */
@FeignClient(name = "nacos-provide",fallback = RemoteHystrix.class)
@Service
public interface RemoteClient {

    @GetMapping("/helloNacos")
    String helloNacos();
}
