# async-rest-template-apache

## AsyncRestTemplate with HttpComponentsAsyncClientHttpRequestFactory (Apache)

## How to test

Start the Spring Application

## Logs:

    ```
    2019-12-24 19:11:55.423  INFO 81077 --- [           main] AsyncRestTemplateApacheApplicationRunner : ===== Execution without host header =====
    2019-12-24 19:11:56.562  INFO 81077 --- [           main] AsyncRestTemplateApacheApplicationRunner : Factory=[SimpleClientHttpRequestFactory] ResponseBody=[{"code": 200, "description": "OK"}]
    2019-12-24 19:11:57.589  INFO 81077 --- [           main] AsyncRestTemplateApacheApplicationRunner : Factory=[HttpComponentsAsyncClientHttpRequestFactory] ResponseBody=[{"code": 200, "description": "OK"}]
    2019-12-24 19:11:57.589  INFO 81077 --- [           main] AsyncRestTemplateApacheApplicationRunner : ===== Execution with host header =====
    2019-12-24 19:11:57.788  INFO 81077 --- [           main] AsyncRestTemplateApacheApplicationRunner : Factory=[SimpleClientHttpRequestFactory] ResponseBody=[{"code": 200, "description": "OK"}]
    2019-12-24 19:11:58.028  WARN 81077 --- [           main] o.s.web.client.AsyncRestTemplate         : Async GET request for "https://httpstat.us/200" resulted in 404 (Site Not Found); invoking error handler
    2019-12-24 19:11:58.032  INFO 81077 --- [           main] AsyncRestTemplateApacheApplicationRunner : Factory=[HttpComponentsAsyncClientHttpRequestFactory] Exception=[org.springframework.web.client.HttpClientErrorException$NotFound: 404 Site Not Found: [﻿<!DOCTYPE html>
    <html>
    <head>
        <title>Microsoft Azure Web App - Error 404</title>
        <style type="text/css">
            html {
                height: 100%;
                width: 100%;
            }
    ... (2778 bytes)]]

    ```