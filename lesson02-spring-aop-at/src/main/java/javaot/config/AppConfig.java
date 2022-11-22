package javaot.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MovieAspectConfig.class)
@EnableAspectJAutoProxy
public class AppConfig {
	
}
