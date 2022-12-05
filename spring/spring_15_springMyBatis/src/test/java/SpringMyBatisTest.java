import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.ccola.dao.UserDao;
import xyz.ccola.pojo.User;
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
}
