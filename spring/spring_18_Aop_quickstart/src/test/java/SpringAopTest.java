import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xyz.ccola.config.SpringConfig;
import xyz.ccola.service.BookService;

/**
 * @ Name: SpringAopTest
 * @ Author: Cola
 * @ Time: 2022/12/5 15:15
 * @ Description: SpringAopTest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class SpringAopTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testInitModule() {
        bookService.save();
    }

    @Test
    public void testAop() {
        bookService.update();
    }
}
