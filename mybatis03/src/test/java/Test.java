import cn.sxt.service.UserService;
import cn.sxt.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void testSelectAll() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        List<User> list = userService.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
