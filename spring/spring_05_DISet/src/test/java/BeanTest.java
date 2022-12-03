import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.ccola.bean.Clazz;
import xyz.ccola.bean.Student;
import xyz.ccola.utils.ApplicationContextUtil;


/**
 * @ Name: BeanTest
 * @ Author: Cola
 * @ Time: 2022/11/19 20:16
 * @ Description: BeanTest 测试类
 */
@Slf4j
public class BeanTest {

    /**
     * 测试 依赖注入之 setter 注入
     */
    @Test
    public void setterDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student01 = (Student) context.getBean("student01");
        System.out.println(student01);
        log.info("方法：setterDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 特殊值 null 小于号 「<」 的处理
     */
    @Test
    public void nullDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student02 = (Student) context.getBean("student02");
        Student student03 = (Student) context.getBean("student03");
        Student student04 = (Student) context.getBean("student04");
        System.out.println(student02);
        System.out.println(student03);
        System.out.println(student04);
        log.info("方法：nullDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为类属性赋值
     */
    @Test
    public void setterClassPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student05 = (Student) context.getBean("student05");
        Student student06 = (Student) context.getBean("student06");
        Student student07 = (Student) context.getBean("student07");
        System.out.println(student05);
        System.out.println(student06);
        System.out.println(student07);
        log.info("方法：setterClassPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为数组属性赋值
     */
    @Test
    public void setterArrayPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student08 = (Student) context.getBean("student08");
        System.out.println(student08);
        log.info("方法：setterArrayPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为集合属性赋值
     */
    @Test
    public void setterSetPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Clazz clazz02 = (Clazz) context.getBean("clazz02");
        System.out.println(clazz02);
        log.info("方法：setterSetPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 为 Map 属性赋值
     */
    @Test
    public void setterMapPropertyDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student09 = (Student) context.getBean("student09");
        System.out.println(student09);
        log.info("方法：setterMapPropertyDependencyInjectionTest 测试通过");
    }

    /**
     * 测试 依赖注入之 构造器 注入
     */
    @Test
    public void constructorDependencyInjectionTest() {
        ClassPathXmlApplicationContext context = ApplicationContextUtil.getClassPathXmlApplicationContext();
        Student student10 = (Student) context.getBean("student10");
        System.out.println(student10);
        log.info("方法：constructorDependencyInjectionTest 测试通过");
    }


}
