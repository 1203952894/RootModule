import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.dao.BookDao;
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
     * 测试 通过 Name 属性获取 Bean
     */
    @Test
    public void testGetBeanByName(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("service");
        bookService.save();
    }

    /**
     * 测试 Bean 的作用范围
     */
    @Test
    public void testBeanScope(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
        默认为 单例 singleton
         */
        BookService bookService = (BookService) context.getBean("service");
        BookService bookService2 = (BookService) context.getBean("service");
        System.out.println(bookService);
        System.out.println(bookService2);
        /*
        多例 prototype
         */
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        BookDao bookDao2 = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
        System.out.println(bookDao2);

    }
}
