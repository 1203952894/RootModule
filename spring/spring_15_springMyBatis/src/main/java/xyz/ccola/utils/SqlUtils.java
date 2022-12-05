package xyz.ccola.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * @ Name: SqlUtils
 * @ Author: Cola
 * @ Time: 2022/12/5 12:31
 * @ Description: SqlUtils
 */
public class SqlUtils {

    /**
     * 获取 SqlSession
     * @return  SqlSession
     * @throws IOException Io
     */
    public static SqlSession getSqlSession() throws IOException {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        return Objects.requireNonNull(sqlSession);
    }
}
