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
     *
     * 访问访问/actuator,默认返回数据：
     * {
     * 	"_links": {
     * 		"self": {
     * 			"href": "http://127.0.0.1:8081/actuator",
     * 			"templated": false
     *                },
     * 		"health": {
     * 			"href": "http://127.0.0.1:8081/actuator/health",
     * 			"templated": false
     *        },
     * 		"info": {
     * 			"href": "http://127.0.0.1:8081/actuator/info",
     * 			"templated": false
     *        }* 	}
     * }
     * 要返回所有的则在配置文件中配置，返回数据为：
     * {
     * 	"_links": {
     * 		"self": {
     * 			"href": "http://127.0.0.1:8081/actuator",
     * 			"templated": false
     *                },
     * 		"auditevents": {
     * 			"href": "http://127.0.0.1:8081/actuator/auditevents",
     * 			"templated": false
     *        },
     * 		"beans": {
     * 			"href": "http://127.0.0.1:8081/actuator/beans",
     * 			"templated": false
     *        },
     * 		"health": {
     * 			"href": "http://127.0.0.1:8081/actuator/health",
     * 			"templated": false
     *        },
     * 		"conditions": {
     * 			"href": "http://127.0.0.1:8081/actuator/conditions",
     * 			"templated": false
     *        },
     * 		"configprops": {
     * 			"href": "http://127.0.0.1:8081/actuator/configprops",
     * 			"templated": false
     *        },
     * 		"env": {
     * 			"href": "http://127.0.0.1:8081/actuator/env",
     * 			"templated": false
     *        },
     * 		"env-toMatch": {
     * 			"href": "http://127.0.0.1:8081/actuator/env/{toMatch}",
     * 			"templated": true
     *        },
     * 		"info": {
     * 			"href": "http://127.0.0.1:8081/actuator/info",
     * 			"templated": false
     *        },
     * 		"loggers": {
     * 			"href": "http://127.0.0.1:8081/actuator/loggers",
     * 			"templated": false
     *        },
     * 		"loggers-name": {
     * 			"href": "http://127.0.0.1:8081/actuator/loggers/{name}",
     * 			"templated": true
     *        },
     * 		"heapdump": {
     * 			"href": "http://127.0.0.1:8081/actuator/heapdump",
     * 			"templated": false
     *        },
     * 		"threaddump": {
     * 			"href": "http://127.0.0.1:8081/actuator/threaddump",
     * 			"templated": false
     *        },
     * 		"metrics": {
     * 			"href": "http://127.0.0.1:8081/actuator/metrics",
     * 			"templated": false
     *        },
     * 		"metrics-requiredMetricName": {
     * 			"href": "http://127.0.0.1:8081/actuator/metrics/{requiredMetricName}",
     * 			"templated": true
     *        },
     * 		"scheduledtasks": {
     * 			"href": "http://127.0.0.1:8081/actuator/scheduledtasks",
     * 			"templated": false
     *        },
     * 		"httptrace": {
     * 			"href": "http://127.0.0.1:8081/actuator/httptrace",
     * 			"templated": false
     *        },
     * 		"mappings": {
     * 			"href": "http://127.0.0.1:8081/actuator/mappings",
     * 			"templated": false
     *        }* 	}
     * }
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
