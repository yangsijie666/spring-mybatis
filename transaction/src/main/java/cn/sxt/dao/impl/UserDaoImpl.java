package cn.sxt.dao.impl;

import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    // Spring整合Mybatis，对SqlSession进行封装后的对象
    private SqlSessionTemplate sqlSession;

    @Override
    public List<User> selectAll() {
        User user = new User();
        user.setName("wangwu");
        user.setPwd("423342");
        sqlSession.insert("UserMapper.add", user);
        sqlSession.delete("UserMapper.remove", 20);
        return sqlSession.selectList("UserMapper.selectAll");
    }

    public void setSqlSession(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSession = sqlSessionTemplate;
    }
}
