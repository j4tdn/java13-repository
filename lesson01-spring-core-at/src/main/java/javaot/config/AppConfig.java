package javaot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


//==> meta-beans.xml
//==> default --> scan in current package
@Configuration
@ComponentScan("javaot")
@Import(MovieConfig.class)
public class AppConfig {

	
}
