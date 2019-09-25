package cn.sxt.dao;

import cn.sxt.vo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    public List<User> selectAll();
}
