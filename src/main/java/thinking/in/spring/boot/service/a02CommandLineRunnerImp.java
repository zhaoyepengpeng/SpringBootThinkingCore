package thinking.in.spring.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @className: a012CommandLineRunnerImp
 * @author: zhaoyepeng
 * @date: 2023-04-19 11:01:03
 *可以加@Order注解，数字越小越先执行
 **/
//@Configuration
//@Order(value = 1)
public class a02CommandLineRunnerImp implements CommandLineRunner {
    @Autowired
    private RunMethodService runMethodService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("a02CommandLineRunnerImp.run start");
        runMethodService.executeMethod();
        System.out.println("a02CommandLineRunnerImp.run end");
    }
}
