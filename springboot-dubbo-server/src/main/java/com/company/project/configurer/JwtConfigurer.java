package com.company.project.configurer;

import com.company.project.model.JwtFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Jwt configuration
 *
 * Created by Padipata on 2018/11/10.
 */
@Configuration
public class JwtConfigurer {
    // jwt秘钥
    public static final String KEY = "yipage";

    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter());
        // 对 /* 路由下的所有资源访问进行 token 验证
        registrationBean.addUrlPatterns("/secure/*");

        return registrationBean;
    }
}