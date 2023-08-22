package com.org.main.SecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder encoder)
	{
		UserDetails hrbpUser = User.withUsername("Keerti")
				.password(encoder.encode("paasword"))
				.roles("HRBP","Manager")
				.build();
		
		UserDetails manager = User.withUsername("Sumanth")
				.password(encoder.encode("Manager"))
				.roles("Manager")
				.build();
		
		UserDetails employeeUser = User.withUsername("Vamsi")
				.password(encoder.encode("employee"))
				.roles("Employee")
				.build();
		return new InMemoryUserDetailsManager(hrbpUser,manager,employeeUser);
		
		
		
		
	}
	
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		 return http.csrf().disable()
	                .authorizeHttpRequests()
	                .requestMatchers("/welcome").permitAll()
	                .and()
	                .authorizeHttpRequests().requestMatchers("/employee/**")
	                .authenticated().and().formLogin().and().build();
	}

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	
	
	
	
	
	

	/*
	 * @Autowired UserDetailsService userDetailsService;
	 * 
	 * @Bean public BCryptPasswordEncoder passwordEncoder() { return new
	 * BCryptPasswordEncoder(); }
	 * 
	 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
	 * throws Exception {
	 * auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder()
	 * ); }
	 * 
	 * @Bean public DaoAuthenticationProvider authenticationProvider() {
	 * DaoAuthenticationProvider authenticationProvider = new
	 * DaoAuthenticationProvider();
	 * authenticationProvider.setUserDetailsService(userDetailsService);
	 * authenticationProvider.setPasswordEncoder(passwordEncoder()); return
	 * authenticationProvider; }
	 * 
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.authenticationProvider(authenticationProvider()); }
	 * 
	 * @Override protected void configure(HttpSecurity http) {
	 * 
	 * try { http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.
	 * STATELESS).and().authorizeRequests() .antMatchers().permitAll();
	 * 
	 * .antMatchers("/user/**").hasAuthority("ROLE_ADMIN")
	 * .antMatchers(HttpMethod.GET,"/book/**").hasAuthority("ROLE_ADMIN");
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * try {
	 * http.csrf().disable().authorizeRequests().anyRequest().permitAll().and()
	 * .addFilter(new
	 * JwtUserNameAndPasswordAuthennticationFilter(authenticationManager()))
	 * .addFilterAfter(new JwtTokenVerify(),
	 * JwtUserNameAndPasswordAuthennticationFilter.class); } catch (Exception e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

}
