package cn.wxx.nacosprovide;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NacosProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvideApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/helloNacos")
    public String helloNacos(){
//        int i=1/0;
        return "你好，nacos！"+port;
    }
}
