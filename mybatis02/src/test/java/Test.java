import cn.sxt.dao.UserDao;
import cn.sxt.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void testSelectAll() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> list = userDao.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
