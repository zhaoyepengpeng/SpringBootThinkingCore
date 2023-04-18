package thinking.in.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: App
 * @author: zhaoyepeng
 * @date: 2023-04-18 14:55:19
 **/
@RestController
@SpringBootApplication
public class App {
    /**
     * 书籍页码 17页示例
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
    @RequestMapping("/index")
    public String index(){
        return "Welcome ,My buudy";
    }
}
