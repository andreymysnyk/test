package com.andreym.test.service;

import org.springframework.stereotype.Service;

/**
 * Created by amisnik on 30.10.2014.
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String service() {
        return "Hello Spring MVC Framework!";
    }
}
