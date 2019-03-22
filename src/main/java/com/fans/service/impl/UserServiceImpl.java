package com.fans.service.impl;

import com.fans.dao.UserMapper;
import com.fans.exception.ParamException;
import com.fans.pojo.User;
import com.fans.service.interfaces.IUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description:
 * @Author fan
 * @Date 2018-12-19 17:14
 * @Version 1.0
 **/
@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Resource(type = com.fans.dao.UserMapper.class)
    private UserMapper userMapper;

    @Override
    public List<User> getList() {
        PageHelper.startPage(1, 5);
        return userMapper.selectAll();
    }

    @Override
    public int addUser(User user) {
        if (user == null) {
            user = User.builder()
                    .id(10L)
                    .username("jom")
                    .password("jom")
                    .descn("我是 jom skr")
                    .status(1)
                    .build();
        }
        return userMapper.insert(user);
    }


    @Override
    public int deleteUser(Long id) {
        id = 10L;
        userMapper.deleteByPrimaryKey(id);
        throw new ParamException(id + "错误");
    }

}
