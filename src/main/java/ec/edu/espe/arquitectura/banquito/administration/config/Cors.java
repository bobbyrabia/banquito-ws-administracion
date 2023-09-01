package ec.edu.espe.arquitectura.banquito.administration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("https://banquito-bancaweb.web.app/","https://striped-reserve-397605.web.app/","https://banquito-backoffice.web.app/","https://banquito-tellerapp.web.app/","https://banquito-backoffice-v2.web.app/","http://localhost:4200")

                        .exposedHeaders("Content-Disposition","Content-Type")
                        .allowedMethods("*");
            }
        };
    }
}
