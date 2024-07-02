package com.Demo.OAuth2.Server.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        var userBuilder = User.builder();
        UserDetails jay = userBuilder.username("jay").password("{noop}pass").roles("USER", "ADMIN").build();
        return new InMemoryUserDetailsManager(jay);
    }


}

