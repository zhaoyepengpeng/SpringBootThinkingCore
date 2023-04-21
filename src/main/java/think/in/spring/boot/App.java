package think.in.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: App
 * @author: zhaoyepeng
 * @date: 2023-04-19 10:34:27
 **/


@SpringBootApplication
@RestController
public class App {
   /**
    * spring boot admin 服务端测试
    * spring boot admin client端见a05SpringBootAdminClientTest分支
    *
    */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @RequestMapping("/")
    public String index() {
        return "SUCCESS";
    }
}
