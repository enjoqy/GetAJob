package org.junhi.service;

import org.junhi.mapper.UserMapper;
import org.junhi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author junhi
 * @date 2019/7/18 12:22
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

}
