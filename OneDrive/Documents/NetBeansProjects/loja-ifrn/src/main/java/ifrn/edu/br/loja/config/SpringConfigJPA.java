package ifrn.edu.br.loja.config;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author JoaoC
 */
@Configuration
@EnableTransactionManagement
public class SpringConfigJPA {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/loja-ifrn");
        ds.setUsername("root");
        ds.setPassword("senha@123");
        return ds;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory(DataSource ds) {
        LocalContainerEntityManagerFactoryBean lc = new LocalContainerEntityManagerFactoryBean();
        lc.setPackagesToScan("ifrn.edu.br.loja.model");
        lc.setJpaProperties(properties());
        return lc.getObject();
    }

    private Properties properties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.show_sql", "true");
        properties.setProperty("hibernate.format_sql", "true");
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        return properties;
    }
}
