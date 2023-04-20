package think.spring.boot;

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
     * Spring Boot项目中的嵌入容器主要有三种，分别是：
     * 01.Tomcat
     * 02.Jetty
     * 03.Undertow
     * 主要介绍如何切换Spring Boot项目中的web 容器，
     * 例如将web容器的Tomcat换成Jetty
     * 即排除Tomcat依赖，添加Jetty依赖
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @RequestMapping("/index")
    public String index(){
        return "Success";
    }
}
