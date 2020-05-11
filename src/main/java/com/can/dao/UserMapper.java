package com.can.dao;

import com.can.entity.User;
import org.springframework.stereotype.Component;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-05-11 20:44
 */

@Component
public class UserMapper {

    public User queryById(int userId) {
        User user = new User();
        user.setName("姓名");
        user.setUserId(userId);
        return user;
    }
}
