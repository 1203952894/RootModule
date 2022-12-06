import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.ccola.config.ServletContainersInitConfig;
import xyz.ccola.config.SpringConfig;
import xyz.ccola.config.SpringMVCConfig;
import xyz.ccola.domain.User;
import xyz.ccola.service.UserService;

import java.util.List;

/**
 * @ Name: RequestMappingTest
 * @ Author: Cola
 * @ Time: 2022/12/6 11:13
 * @ Description: RequestMappingTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        SpringConfig.class,
        SpringMVCConfig.class,
        ServletContainersInitConfig.class})
public class RequestMappingTest {
    @Autowired
    private UserService userService;

    /**
     * 测试获取全部数据
     */
    @Test
    public void testGetAll(){
        List<User> userList = userService.getAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
