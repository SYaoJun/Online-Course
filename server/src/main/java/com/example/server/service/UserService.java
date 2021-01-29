package com.example.server.service;

import com.example.server.domain.User;
import com.example.server.domain.UserExample;
import com.example.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yaojun
 * @create 2021-01-29 09:21
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllInfo(){
        UserExample userExample = new UserExample();
        /*按照条件查找id=1的元素返回*/
        userExample.createCriteria().andIdEqualTo(1L);
        /*按照id的降序*/
//        userExample.setOrderByClause("id desc");
        return userMapper.selectByExample(userExample);
    }
}
