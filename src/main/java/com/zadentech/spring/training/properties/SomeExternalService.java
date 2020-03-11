package com.zadentech.spring.training.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * SomeExternalService
 */
@Service
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public final String returnServiceURL() {
        return url;
    }
    
}