package cn.sxt.service.impl;

import cn.sxt.dao.UserMapper;
import cn.sxt.service.UserService;
import cn.sxt.vo.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
