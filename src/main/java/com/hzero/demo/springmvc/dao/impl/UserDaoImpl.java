package com.hzero.demo.springmvc.dao.impl;


import com.hzero.demo.springmvc.dao.UserDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public int hasMatchCount(String userName, String password) {
        String MATCH_COUNT_SQL = " SELECT COUNT(*) FROM user  WHERE  name=? and password=? ";
        Integer count = jdbcTemplate.queryForObject(MATCH_COUNT_SQL, new Object[]{userName, password}, Integer.class);

        if (count == null)//避免直接返回int值，在拆箱时抛出空指针异常
            count = 0;

        return count;
    }


}

