package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class PersistenceConfig {
  private DataSource datasource = null;

  @Bean
  public DataSource dataSource() {
     
    MysqlDataSource dataSource = new MysqlDataSource();
    dataSource.setDatabaseName("MYBATIS");
    dataSource.setServerName("localhost");
    dataSource.setPort(3306);
    dataSource.setUser("");
    dataSource.setPassword("");
    dataSource.setServerTimezone("UTC");

    return dataSource;

    /*return new EmbeddedDatabaseBuilder()
        .setType(EmbeddedDatabaseType.H2)
        .addScript("schema.sql")
        .addScript("data.sql")
        .build();*/
  }

  @Bean
  public SqlSessionFactory sqlSessionFactory() throws Exception {
    SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
    factoryBean.setDataSource(dataSource());
    return factoryBean.getObject();
  }
}

/*import org.mybatis.spring.annotation.MapperScan;
@Configuration
@MapperScan("com.howtodoinjava.app.mapper")
public class PersistenceConfig {
}*/
