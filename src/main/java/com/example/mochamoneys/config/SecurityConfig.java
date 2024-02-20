package com.example.mochamoneys.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;


import javax.sql.DataSource;

@EnableMethodSecurity

    @Configuration
    @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//        @Autowired
//        private DataSource dataSource;
//
//        @Autowired
//        private PasswordEncoder passwordEncoder;
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.csrf().ignoringAntMatchers("/h2-console/**")
//                    .and()
//                    .authorizeRequests()
//                    .antMatchers("/h2-console/**").permitAll()
//                    .anyRequest().authenticated()
//                    .and()
//                    .headers().frameOptions().sameOrigin()
//                    .and()
//                    .formLogin();
//        }
//
//        @Override
//        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//            auth.jdbcAuthentication()
//                    .dataSource(dataSource)
//                    .usersByUsernameQuery("SELECT email, password, role FROM user WHERE email=?")
//                    .authoritiesByUsernameQuery("SELECT username, authority FROM authorities WHERE username=?")
//                    .passwordEncoder(passwordEncoder);
//        }

    }