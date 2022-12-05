import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.ccola.config.SpringConfig;
import xyz.ccola.pojo.User;
import xyz.ccola.service.UserService;

import java.util.List;

/**
 * @ Name: SpringJunitTest
 * @ Author: Cola
 * @ Time: 2022/12/5 13:30
 * @ Description: SpringJunitTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
