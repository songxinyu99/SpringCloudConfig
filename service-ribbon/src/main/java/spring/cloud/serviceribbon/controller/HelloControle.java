package spring.cloud.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.serviceribbon.service.HelloService;

/**
 * @Descripition 测试负载均衡ribbon
 * @Author songxy
 * @CreateDate 2019-03-07 17:33
 */
@RestController
public class HelloControle {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
