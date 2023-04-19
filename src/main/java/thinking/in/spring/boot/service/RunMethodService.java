package thinking.in.spring.boot.service;

import org.springframework.stereotype.Service;

/**
 * @className: RunMethodService
 * @author: zhaoyepeng
 * @date: 2023-04-19 10:56:55
 **/
@Service
public class RunMethodService {

    public void executeMethod() {
        System.out.println("RunMethodService.executeMethod方法执行了");
    }
}
