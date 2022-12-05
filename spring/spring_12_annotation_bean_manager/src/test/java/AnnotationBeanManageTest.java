import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.openjdk.jol.vm.VM;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.ccola.config.SpringConfig;
import xyz.ccola.dao.BookDao;
import xyz.ccola.service.BookService;

/**
 * @ Name: AnnotationBeanTest
 * @ Author: Cola
 * @ Time: 2022/12/5 9:12
 * @ Description: AnnotationBeanTest
 */
@Slf4j
public class AnnotationBeanManageTest {

    /**
     * 测试 初始化模块
     */
    @Test
    public void testInitModule(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.registerShutdownHook();
        BookDao bookDaoImpl = context.getBean("bookDaoImpl", BookDao.class);
        bookDaoImpl.save();
    }

    /**
     * 测试 Service
     */
    @Test
    public void testServiceAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = (BookService) context.getBean("bookServiceImpl", BookService.class);
        bookService.save();
    }

    /**
     * 测试 Scope
     */
    @Test
    public void testScopeAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDaoImpl = context.getBean("bookDaoImpl", BookDao.class);
        BookDao bookDaoImpl2 = context.getBean("bookDaoImpl", BookDao.class);
        BookService bookService = (BookService) context.getBean("bookServiceImpl", BookService.class);
        BookService bookService2 = (BookService) context.getBean("bookServiceImpl", BookService.class);
        System.out.println("--获取内存地址--");
        System.out.println(VM.current().addressOf(bookDaoImpl));
        System.out.println(VM.current().addressOf(bookDaoImpl2));
        System.out.println(VM.current().addressOf(bookService));
        System.out.println(VM.current().addressOf(bookService2));
    }
}
