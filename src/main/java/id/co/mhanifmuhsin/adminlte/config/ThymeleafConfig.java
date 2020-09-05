package id.co.mhanifmuhsin.adminlte.config;


import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@Configuration
public class ThymeleafConfig {
    @Bean
    public LayoutDialect layoutDialect(){
        return new LayoutDialect();
    }
    @Bean
    public SpringDataDialect springDataDialect() {
        return new SpringDataDialect();
    }
}
