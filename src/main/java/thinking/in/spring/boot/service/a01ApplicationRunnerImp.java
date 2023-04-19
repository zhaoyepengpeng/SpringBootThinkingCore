package thinking.in.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @className: a01ApplicationRunnerImp
 * @author: zhaoyepeng
 * @date: 2023-04-19 10:58:39
 **/
//@Configuration
public class a01ApplicationRunnerImp implements ApplicationRunner {
    @Autowired
    private RunMethodService runMethodService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        runMethodService.executeMethod();
    }
}
