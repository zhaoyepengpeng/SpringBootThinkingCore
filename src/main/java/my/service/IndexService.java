package my.service;

import my.domain.User;
import my.domain.UserEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;

/**
 * @className: IndexService
 * @author: zhaoyepeng
 * @date: 2023-04-18 15:16:10
 **/
@Service
public class IndexService {
    @Autowired
    private ApplicationContext applicationContext;

    public void createSpringEventAndPublish(){
        User user = new User("zhangsan", 201);
        UserEvent userEvent = new UserEvent(user);
        applicationContext.publishEvent(userEvent);
        System.out.println(this.getClass()+"发布事件");
    }

}
