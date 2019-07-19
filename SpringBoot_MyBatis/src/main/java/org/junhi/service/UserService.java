package org.junhi.service;

import org.junhi.mapper.UserMapper;
import org.junhi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author junhi
 * @date 2019/7/17 20:17
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查询一个user
     * @param id
     * @return
     */
    public User queryUserById(Integer id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据id删除一个user
     * 开启事务的注解
     * @param id
     */
    @Transactional
    public void deleteUserById(Integer id){
        this.userMapper.deleteByPrimaryKey(id);
    }

    /**
     * 查询所有的用户
     * @return
     */
    public List<User> queryUserAll() {
        return this.userMapper.selectAll();
    }
}
