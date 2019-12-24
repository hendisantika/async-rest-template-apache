package com.hendisantika.asyncresttemplateapache;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.AsyncRestTemplate;

/**
 * Created by IntelliJ IDEA.
 * Project : async-rest-template-apache
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/12/19
 * Time: 19.08
 */
@Service
@AllArgsConstructor
@Log
public class AsyncRestTemplateApacheApplicationRunner implements ApplicationRunner {

    private final AsyncRestTemplate apacheAsyncRestTemplate;
    private final AsyncRestTemplate simpleClientAsyncRestTemplate;
}
