package cn.sxt.dao;

import cn.sxt.vo.User;

import java.util.List;

public interface UserDao {
    public List<User> selectAll();
}
