import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.dao.BookDao;
import xyz.ccola.service.BookService;

/**
 * @ Name: AnnotationBeanTest
 * @ Author: Cola
 * @ Time: 2022/12/5 9:12
 * @ Description: AnnotationBeanTest
 */
@Slf4j
public class AnnotationBeanTest {

    /**
     * 测试 初始化模块
     */
    @Test
    public void testInitModule(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.save();
    }

    /**
     * 测试 Service
     */
    @Test
    public void testServiceAnnotation(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookServiceImpl", BookService.class);
        bookService.save();
    }
}
