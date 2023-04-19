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
     *项目启动时执行指定方法的两个测试
     * 01.实现 CommandLineRunner 或 ApplicationRunner接口，实现类上面加@Component注解,见，a02CommandLineRunnerImp
     * 02.类上面加@Component注解，把注解@PostConstruct 添加到需要执行的方法上，该方法会在项目启动过程中执行一次。缺点：极端情况下，会出现该方法依赖的组件还没被加载到容器里面，导致方法执行失败。
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
    @RequestMapping("/index")
    public String index(){
        return "Welcome ,My buudy";
    }
}
