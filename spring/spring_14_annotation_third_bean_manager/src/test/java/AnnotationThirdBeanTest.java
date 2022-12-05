import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.ccola.config.SpringConfig;
import xyz.ccola.dao.BookDao;

import javax.sql.DataSource;

/**
 * @ Name: AnnotationThirdBeanTest
 * @ Author: Cola
 * @ Time: 2022/12/5 11:05
 * @ Description: AnnotationThirdBeanTest
 */
@Slf4j
public class AnnotationThirdBeanTest {
    /**
     * 测试 初始化模块
     */
    @Test
    public void testInitModule(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean("bookDaoImpl", BookDao.class);
        bookDao.save();
    }

    /**
     * 测试 德鲁伊 Bean
     */
    @Test
    public void testDruidBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }

    /**
     * 测试 User Bean
     */
    @Test
    public void testUserBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
