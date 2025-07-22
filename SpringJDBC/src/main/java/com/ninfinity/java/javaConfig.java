package com.ninfinity.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.ninfinity.dao.StudentDaoImpl;

@Configuration
public class javaConfig {
	
	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springdb");
		ds.setUsername("root");
		ds.setPassword("qwerty123");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		
		return template;
	}
	
	@Bean("studentDao")
	public StudentDaoImpl getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setTemplate(getJdbcTemplate());
		
		return studentDao;
	}

}
