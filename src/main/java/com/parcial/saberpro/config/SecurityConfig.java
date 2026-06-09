package com.parcial.saberpro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/login",
                                "/css/**",
                                "/img/**",
                                "/js/**",
                                "/h2-console/**"
                        ).permitAll()
                        .requestMatchers("/admin/**").hasRole("ADMINISTRADOR")
                        .requestMatchers("/students/**").hasRole("COORDINACION")
                        .requestMatchers("/reports/**").hasAnyRole("ADMINISTRADOR", "COORDINACION", "DOCENTE")
                        .requestMatchers("/student/**").hasRole("ESTUDIANTE")
                        .anyRequest().authenticated()
                )
                .formLogin(login -> login
                        .loginPage("/login")
                        .defaultSuccessUrl("/dashboard", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/login?logout")
                        .permitAll()
                )
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/h2-console/**")
                )
                .headers(headers -> headers
                        .frameOptions(frame -> frame.sameOrigin())
                )
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        return new InMemoryUserDetailsManager(
                User.withUsername("admin")
                        .password(encoder.encode("admin123"))
                        .roles("ADMINISTRADOR")
                        .build(),

                User.withUsername("admin@uts.edu.co")
                        .password(encoder.encode("admin123"))
                        .roles("ADMINISTRADOR")
                        .build(),

                User.withUsername("admin@saberpro.edu.co")
                        .password(encoder.encode("admin123"))
                        .roles("ADMINISTRADOR")
                        .build(),

                User.withUsername("coordinador")
                        .password(encoder.encode("coord123"))
                        .roles("COORDINACION")
                        .build(),

                User.withUsername("coordinador@uts.edu.co")
                        .password(encoder.encode("admin123"))
                        .roles("COORDINACION")
                        .build(),

                User.withUsername("coordinador@saberpro.edu.co")
                        .password(encoder.encode("admin123"))
                        .roles("COORDINACION")
                        .build(),

                User.withUsername("docente")
                        .password(encoder.encode("docente123"))
                        .roles("DOCENTE")
                        .build(),

                User.withUsername("docente@uts.edu.co")
                        .password(encoder.encode("docente123"))
                        .roles("DOCENTE")
                        .build(),

                User.withUsername("estudiante")
                        .password(encoder.encode("est123"))
                        .roles("ESTUDIANTE")
                        .build(),

                User.withUsername("estudiante@uts.edu.co")
                        .password(encoder.encode("123456"))
                        .roles("ESTUDIANTE")
                        .build(),

                User.withUsername("estudiante1@saberpro.edu.co")
                        .password(encoder.encode("1098765432"))
                        .roles("ESTUDIANTE")
                        .build()
        );
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}