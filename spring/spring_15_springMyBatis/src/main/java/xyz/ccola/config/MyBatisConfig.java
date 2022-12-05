package xyz.ccola.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @ Name: MyBatisConfig
 * @ Author: Cola
 * @ Time: 2022/12/5 12:46
 * @ Description: MyBatisConfig
 */

public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean SqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("xyz.ccola.pojo");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("xyz.ccola.dao");
        return msc;
    }
}
