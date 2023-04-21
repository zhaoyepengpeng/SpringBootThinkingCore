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
     * spring boot admin 项目监控 是由 spring boot actuator 包装来的
     * 测试其Server服务器
     * 01.添加依赖
     * 02.在配置文件中进行配置
     *
     * 在页面访问/actuator   或者  /actuator/health  或者 /actuator/info 返回{} 由程序员定制（get方式）
     * http://127.0.0.1:8081/actuator/health 返回{"status":"UP"} 表示正常
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @RequestMapping("/")
    public String index() {
        return "SUCCESS";
    }
}
