package com.spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebAppSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    protected DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /* Opt1: use in memory authentication
        UserBuilder users = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(users.username("john").password("1").roles("EMPLOYEE"))
                .withUser(users.username("mary").password("1").roles("EMPLOYEE", "MANAGER"))
                .withUser(users.username("susan").password("1").roles("EMPLOYEE", "ADMIN")); */

        /* Opt2: */
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/").hasRole("EMPLOYEE")
                .antMatchers("/managers/**").hasRole("MANAGER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .and().formLogin().loginPage("/login")
                .loginProcessingUrl("/authenticate").permitAll()
                .and().logout().permitAll()
                .and().exceptionHandling().accessDeniedPage("/access-denied");
    }
}
