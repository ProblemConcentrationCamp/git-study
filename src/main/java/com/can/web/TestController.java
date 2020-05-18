package com.can.web;

import com.can.entity.User;
import com.can.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <pre>
 *
 * </pre>
 *
 * @author canxin.li
 * @date 2020-05-11 20:41
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/query/{userId}")
    public User queryById(@PathVariable int userId) {
        return testService.queryById(userId);
    }
}
