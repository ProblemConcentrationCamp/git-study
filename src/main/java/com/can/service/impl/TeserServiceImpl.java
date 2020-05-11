package com.can.service.impl;

import com.can.dao.UserMapper;
import com.can.entity.User;
import com.can.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-05-11 20:43
 */

@Service
public class TeserServiceImpl implements TestService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(int userId) {
        return userMapper.queryById(userId);
    }
}
