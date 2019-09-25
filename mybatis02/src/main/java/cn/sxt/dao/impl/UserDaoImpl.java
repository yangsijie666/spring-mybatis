package cn.sxt.dao.impl;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public List<User> selectAll() {
        return this.getSqlSession().selectList("UserMapper.selectAll");
    }
}
