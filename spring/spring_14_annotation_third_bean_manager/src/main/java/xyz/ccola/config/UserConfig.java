package xyz.ccola.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import xyz.ccola.pojo.User;

import javax.sql.DataSource;

/**
 * @ Name: UserConfig
 * @ Author: Cola
 * @ Time: 2022/12/5 11:23
 * @ Description: UserConfig
 */
@Slf4j
public class UserConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("jdbc.url")
    private String url;
    @Value("jdbc.username")
    private String userName;
    @Value("jdbc.password")
    private String password;

    @Bean
    public DataSource dataSource(User user){
        log.info("通过 形参的方式为外部 Bean 注入引用类型属性 "+user.toString());
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);

        return dataSource;
    }
}
