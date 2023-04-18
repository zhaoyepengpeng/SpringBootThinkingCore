package my.service;

import my.domain.User;
import my.domain.UserEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @className: UserEventListener
 * @author: zhaoyepeng
 * @date: 2023-04-18 15:17:10
 **/
@Service
public class UserEventListener {

    @EventListener
    @Async
    public void userEventHandler(UserEvent userEvent) {
        System.out.println("开始处理事件");
        User user = (User) userEvent.getSource();
        System.out.println("name:" + user.getName());
        System.out.println("age:" + user.getAge());
    }

}
