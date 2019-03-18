package spring.cloud.servicefeign.Service.Impl;

import org.springframework.stereotype.Service;
import spring.cloud.servicefeign.Service.SchedualService;

/**
 * @Descripition
 * @Author songxy
 * @CreateDate 2019-03-12 13:15
 */
@Service
public class SchedualServiceHystrixImpl implements SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
