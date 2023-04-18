import my.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: Application
 * @author: zhaoyepeng
 * @date: 2023-04-18 15:04:12
 **/
@SpringBootApplication(scanBasePackages = {"my"})
@RestController
public class App {
    /**
     * 说明：Spring Event Listener 即Spring事件监听器使用方法说明
     * 01.被操作的事件类要继承(extends)ApplicationEvent,并将操作对象放入到构造函数中 new UserEvent(Object user)
     * 02.具体的ApplicationEvent（例如UserEvent）要通过发布  applicationContext.publishEvent(userEvent);
     * 03.处理事件的类要有@Service，方法上要有  @EventListener，方法上也可以有@Async表示异步操作
     *
     */

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Autowired
    private IndexService indexService;

    @RequestMapping("/index")
    public String createSpringEventAndPublish(){
        indexService.createSpringEventAndPublish();
        return "Success";
    }

}
