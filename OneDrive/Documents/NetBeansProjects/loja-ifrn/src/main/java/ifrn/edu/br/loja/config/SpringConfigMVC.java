package ifrn.edu.br.loja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author JoaoC
 */
@Configuration
public class SpringConfigMVC {

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver in = new InternalResourceViewResolver();
        in.setPrefix("/WEB-INF/views/");
        in.setSuffix(".jsp");
        return in;
    }
}
