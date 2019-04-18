package com.moda.cloud.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author YangCH
 * create on 2019/4/18
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
