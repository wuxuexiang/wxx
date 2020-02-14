package cn.wxx.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

//    @RequestMapping(value = "/fallback")
//    public Map<String, String> fallBackController() {
//        Map<String, String> hashMap = new HashMap();
//        hashMap.put("code", "500");
//        hashMap.put("data", "服务器错误");
//        return hashMap;
//    }

//    @Bean
//    KeyResolver userKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
//    }
}
