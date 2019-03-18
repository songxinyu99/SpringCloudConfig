package spring.cloud.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.servicefeign.Service.SchedualService;

/**
 * @Descripition feign负载均衡
 * @Author songxy
 * @CreateDate 2019-03-08 10:33
 */
@RestController
public class SchedualController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualService schedualService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualService.sayHiFromClientOne( name );
    }
}
