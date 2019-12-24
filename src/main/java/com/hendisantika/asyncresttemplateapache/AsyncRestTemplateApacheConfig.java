package com.hendisantika.asyncresttemplateapache;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory;
import org.springframework.web.client.AsyncRestTemplate;

/**
 * Created by IntelliJ IDEA.
 * Project : async-rest-template-apache
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/12/19
 * Time: 19.10
 */
@Configuration
public class AsyncRestTemplateApacheConfig {

    @Bean
    public AsyncRestTemplate apacheAsyncRestTemplate() {
        return new AsyncRestTemplate(new HttpComponentsAsyncClientHttpRequestFactory());
    }

    @Bean
    public AsyncRestTemplate simpleClientAsyncRestTemplate() {
        return new AsyncRestTemplate();
    }
}