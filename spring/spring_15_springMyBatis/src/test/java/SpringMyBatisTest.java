import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.ccola.config.SpringConfig;
import xyz.ccola.dao.UserDao;
import xyz.ccola.pojo.User;
import xyz.ccola.service.UserService;
import xyz.ccola.utils.SqlUtils;

import java.io.IOException;
import java.util.List;

/**
 * @ Name: SpringMyBatisTest
 * @ Author: Cola
 * @ Time: 2022/12/5 11:37
 * @ Description: SpringMyBatisTest
 */
@Slf4j
public class SpringMyBatisTest {

    /**
     * 测试 初始化模块
     */
    @Test
    public void testInitModule() throws IOException {

        SqlSession sqlSession = SqlUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    /**
     * 测试 Spring 整合 MyBatis
     */
    @Test
    public void testSpringMybatis() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
