package com.avepe;

import org.hibernate.cfg.AvailableSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@SpringBootApplication
public class ConsortiumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsortiumApplication.class, args);
	}

    @Bean
    public DataSource dataSource() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/consortium");
            dataSource.setUsername("root");
            dataSource.setPassword("ogaiht1989");
			dataSource.setConnectionProperties(jpaProperties());
            return dataSource;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabase(Database.MYSQL);
		return adapter;
	}

	@Bean
	public Properties jpaProperties() {
		Properties properties = new Properties();
		properties.put(AvailableSettings.HBM2DDL_AUTO, "update");
		properties.setProperty("useSSL", "false");
		return properties;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan("com.avepe.models");
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		factoryBean.setJpaProperties(jpaProperties());
		return factoryBean;
	}
}