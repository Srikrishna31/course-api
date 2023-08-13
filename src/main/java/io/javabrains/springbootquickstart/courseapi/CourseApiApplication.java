package io.javabrains.springbootquickstart.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.persistence.EntityManagerFactory;

@SpringBootApplication
@EnableJpaRepositories("io.javabrains.springbootquickstart.courseapi.topic")
@EntityScan("io.javabrains.springbootquickstart.courseapi.topic")
public class CourseApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiApplication.class, args);
    }

    @Bean
    public static LocalSessionFactoryBean entityManagerFactory() {
        return new LocalSessionFactoryBean();
    }

}
