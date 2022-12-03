import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.dao.BookDao;
import xyz.ccola.dao.OrderDao;
import xyz.ccola.dao.UserDao;
import xyz.ccola.factory.UserDaoFactory;
import xyz.ccola.service.BookService;

/**
 * @ Name: BookTest
 * @ Author: Cola
 * @ Time: 2022/12/3 11:32
 * @ Description: BookTest 测试类
 */

public class BookTest {

    /**
     * 测试 Save () 方法
     */
    @Test
    public void testSave(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }


    /**
     * 测试 通过无参构造实例化 Bean
     */
    @Test
    public void testVoidConstructor(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();
    }

    /**
     * 测试 通过静态工厂实例化 Bean
     * factory-method
     */
    @Test
    public void testStaticFactoryMethod(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }

    /**
     * 测试 通过工厂实例化 Bean 非 Spring方式
     * factory-bean
     */
    @Test
    public void testNoStaticFactoryWay01(){
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();
    }

    /**
     * 测试 通过实例工厂实例化 Bean 配置 Bean 方式
     * factory-bean
     */
    @Test
    public void testFactoryBeanWay02(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();
    }

    /**
     * 测试 通过实例工厂实例化 Bean 接口方式
     * factory-bean
     */
    @Test
    public void testFactoryBeanWay03(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDao2");
        userDao1.save();
    }

}
