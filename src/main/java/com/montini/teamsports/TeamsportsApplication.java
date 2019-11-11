package com.montini.teamsports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableOAuth2Sso
public class TeamsportsApplication extends WebSecurityConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(TeamsportsApplication.class, args);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
		// super.configure(http);
		http.csrf().disable().antMatcher("/**").authorizeRequests()
                .antMatchers("/", "/login**").permitAll()
                .anyRequest().authenticated().and().logout()
                .logoutSuccessUrl("/").permitAll();
	}
}
