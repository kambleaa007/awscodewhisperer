package com.aws.codewhsiperdemo.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.annotation.Order;
// import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.config.web.server.ServerHttpSecurity;
// import org.springframework.security.web.server.SecurityWebFilterChain;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.core.userdetails.UserDetailsService;

// // spring boot security config file
// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {

//     @Autowired
//     private UserDetailsService userService;

    
//     protected void configure(HttpSecurity http) throws Exception {
//         // the boolean flags force the redirection even though 
//         // the user requested a specific secured resource.
//         http.formLogin().defaultSuccessUrl("/success.html", true);
//     }

//     @Autowired
//     public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//         auth.userDetailsService(userService);
//     }
// }

// @Order(1)
// @Configuration
// @EnableWebFluxSecurity
// public class SecurityConfig
// {
//     @Bean
//     public SecurityWebFilterChain securitygWebFilterChain(ServerHttpSecurity http) {
//         return http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//     }
// }