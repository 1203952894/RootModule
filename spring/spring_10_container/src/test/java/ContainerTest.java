import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import xyz.ccola.dao.BookDao;

/**
 * @ Name: ContainerTest
 * @ Author: Cola
 * @ Time: 2022/12/5 8:47
 * @ Description: ContainerTest
 */
@Slf4j
public class ContainerTest {

    /**
     * 测试 初始化模块
     * 通过类路径下的 XML 配置文件获取 Context
     */
    @Test
    public void testGetBeanByClassPathXML(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.save();
    }


    /**
     * 通过文件系统下的 XML 配置文件获取 Context
     */
    @Test
    public void testGetBeanByFileSystemXML(){
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
                "E:\\2022_snowHosbility\\study\\heima\\2022_SSM\\RootModule\\spring\\spring_10_container\\src\\main\\resources\\applicationContext.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.save();
    }

    /**
     * 通过 BeanFactory 获取  Context
     * 延迟加载
     */
    @Test
    public void testGetBeanByBeanFactory(){
        Resource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
        BookDao bookDao = xmlBeanFactory.getBean("bookDao", BookDao.class);
        bookDao.save();
    }


    /**
     * 测试 ClassPathXML 下 通过 设置属性实现 Bean 的延迟加载
     */
    @Test
    public void testGetBeanByClassPathXMLLazy(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();
        BookDao bookDao2 = context.getBean("bookDao2", BookDao.class);
        bookDao2.save();
    }

}
