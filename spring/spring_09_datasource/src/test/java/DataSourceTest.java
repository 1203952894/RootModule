import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.dao.BookDao;

import javax.sql.DataSource;

/**
 * @ Name: DataSourceTest
 * @ Author: Cola
 * @ Time: 2022/12/4 17:13
 * @ Description: DataSourceTest
 */
@Slf4j
public class DataSourceTest {

    /**
     * 测试 获取 DruidDataSource
     */
    @Test
    public void testGetDruidDataSource(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource druidDataSource = (DataSource) context.getBean("druidDataSource");
        System.out.println(druidDataSource);
    }

    /**
     * 测试 获取 C3p0DataSource
     */
    @Test
    public void testGetC3p0DataSource(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);
    }

    /**
     * 测试 通过 Properties 获取参数的值
     */
    @Test
    public void testGetNameByProperties(){
        // 1. 通过加载类路径下的配置文件的方式获取 IOC 容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) context.getBean("bookDao");
        System.out.println(bookDao);
    }

}
