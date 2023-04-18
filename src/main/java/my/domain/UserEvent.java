package my.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.context.ApplicationEvent;

/**
 * @className: User
 * @author: zhaoyepeng
 * @date: 2023-04-18 15:04:33
 **/
@Data
@Accessors(chain = true)
public class UserEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public UserEvent(Object source) {
        super(source);
    }

}
