package org.demothymleaf.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityConfig
{
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .antMatchers("/manager/**").hasRole("MANAGER") // Access to /manager/** requires MANAGER role
                        .antMatchers("/dev/**").hasRole("DEV")         // Access to /dev/** requires DEV role
                        .antMatchers("/test/**").hasRole("TEST")       // Access to /test/** requires TEST role
                        .antMatchers("/devops/**").hasRole("DEVOPS")   // Access to /devops/** requires DEVOPS role
                        .antMatchers("/tech-lead/**").hasRole("TECH_LEAD") // Access to /tech-lead/** requires TECH_LEAD role
                        .anyRequest().authenticated()                 // All other requests require authentication
                )
                .formLogin(Customizer.withDefaults())              // Apply default form login configuration
                .httpBasic(Customizer.withDefaults())              // Apply default HTTP basic authentication configuration
                .csrf().disable();                                 // Disable CSRF protection

        return http.build();
    }
}
