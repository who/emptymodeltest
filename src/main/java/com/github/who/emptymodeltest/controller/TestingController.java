package com.github.who.emptymodeltest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.who.emptymodeltest.request.ComplexRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/testing")
public class TestingController {
    
    @RequestMapping(value = "/foo", method = RequestMethod.POST, produces = "application/json")
    public Map<String, String> testMethod(@RequestBody(required = true) ComplexRequest request) {
        Map<String, String> hash = new HashMap<>();
        hash.put("foo", "bar");
        return hash;
    }
}
