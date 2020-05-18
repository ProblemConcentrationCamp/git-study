package com.can.web;

import com.can.entity.User;
import com.can.service.TestService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/query/{userId}")
    public User queryById(@PathVariable int userId) {
        log.info("first commit");
        return testService.queryById(userId);
    }
}
