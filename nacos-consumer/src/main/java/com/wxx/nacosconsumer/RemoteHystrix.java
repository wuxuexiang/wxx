package com.wxx.nacosconsumer;

import org.springframework.stereotype.Component;

/**
 * @Classname RemoteHystrix
 * @Description TODO
 * @Date 2020/1/16 16:19
 * @Created by duanyu
 */
@Component
public class RemoteHystrix implements RemoteClient{

    @Override
    public String helloNacos() {
        return "请求超时了";
    }
}
