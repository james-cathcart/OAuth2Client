package com.madhax.oauthdemoapp.config;

import com.madhax.oauthdemoapp.constants.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    public static final String USER_ROLE = "USER";
    public static final String ADMIN_ROLE = "ADMIN";

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(AppConstants.USER_CHECK_URI)
                    .hasRole(USER_ROLE)
                .antMatchers(AppConstants.ADMIN_CHECK_URI)
                    .hasRole(ADMIN_ROLE)
                .antMatchers(AppConstants.HEALTH_CHECK_URI)
                    .authenticated();
//                .anyRequest()
//                .authenticated();
    }
}
