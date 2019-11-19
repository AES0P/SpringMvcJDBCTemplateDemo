package com.hzero.demo.springmvc.service.impl;

import com.hzero.demo.springmvc.dao.impl.UserDaoImpl;
import com.hzero.demo.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDaoImpl userDao;

    public String login(String name, String password) {

        System.out.println(userDao.hasMatchCount(name, password));
        if (userDao.hasMatchCount(name, password) != 0) {
            return "OK";
        }

        return "no user found.";
    }

}
