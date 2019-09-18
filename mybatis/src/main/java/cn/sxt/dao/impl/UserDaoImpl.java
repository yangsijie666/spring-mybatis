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
        return sqlSession.selectList("UserMapper.selectAll");
    }

    public void setSqlSession(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSession = sqlSessionTemplate;
    }
}
