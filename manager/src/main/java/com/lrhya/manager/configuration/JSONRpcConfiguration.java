package com.lrhya.manager.configuration;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImplExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Jsonrpc 自动化配置类.
 */
@Configuration
public class JSONRpcConfiguration {
    private static Logger LOG = LoggerFactory.getLogger(JSONRpcConfiguration.class);

    @Bean
    public AutoJsonRpcServiceImplExporter rpcServiceImplExporter() {

        return new AutoJsonRpcServiceImplExporter();
    }

}
