import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.ccola.config.SpringConfig;
import xyz.ccola.pojo.User;
import xyz.ccola.service.BookService;

/**
 * @ Name: AnnotationDITest
 * @ Author: Cola
 * @ Time: 2022/12/5 10:44
 * @ Description: AnnotationDITest
 */

@Slf4j
public class AnnotationDITest {

    /**
     * 测试 初始化模块
     */
    @Test
    public void testInitModule(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = context.getBean("bookServiceImpl", BookService.class);
        bookService.save();
    }

    /**
     * 测试 DI 注入
     */
    @Test
    public void testDI(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("user01", User.class);
        System.out.println(user);
    }
}
