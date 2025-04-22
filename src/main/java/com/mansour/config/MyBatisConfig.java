package com.mansour.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class MyBatisConfig {
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Bean(name="oralceDatasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource firstDataSource() {
        return DataSourceBuilder.create().build();
    }
    /**
     * @SqlSessionFactory : SqlSession 객체를 생성, SqlSessionTemplate을 생성하기도 한다. 
     * @SqlSession : 'MyBatis와 데이터베이스 간의 모든 상호작용'을 처리하는 객체
     * @SqlSessionTemplate : SqlSessionFactory를 사용하여 내부적으로 SqlSession을 생성
     *  -  간편하게 MyBatis 기능을 사용, 프로젝트에서 BaseDao 클래스가 SqlSessionDaoSupport의 sqlsession 
     * */
	@Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("oralceDatasource") DataSource dataSource) throws Exception {
		
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setConfigLocation(applicationContext.getResource("classpath:config/mybatis-config.xml"));
		sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis-mapper/**/*.xml"));
		
		return sqlSessionFactory.getObject();
	}
}
