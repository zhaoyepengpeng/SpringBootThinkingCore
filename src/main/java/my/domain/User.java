package my.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @className: Usee
 * @author: zhaoyepeng
 * @date: 2023-04-18 15:30:57
 **/
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
}
