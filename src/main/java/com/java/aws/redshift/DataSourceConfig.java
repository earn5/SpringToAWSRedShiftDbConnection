//package com.java.aws.redshift;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class DataSourceConfig {
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.amazon.redshift.jdbc.Driver");
//        dataSource.setUrl("jdbc:redshift://redshift-cluster-broardridge.cdkxt6fsyznk.us-west-1.redshift.amazonaws.com/dev?ssl=false");
//        dataSource.setUsername("awsuser");
//        dataSource.setPassword("BroadRidgeHexaRed123");
//        return dataSource;
//    }
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//}
