import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
}
