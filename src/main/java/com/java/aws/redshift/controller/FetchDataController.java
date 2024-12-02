package com.java.aws.redshift.controller;

import com.java.aws.redshift.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class FetchDataController {

    @Autowired
    UserService userService;

    @GetMapping("/getData/{id}")
    public User getDetails(@PathVariable int id) {
        return userService.getDetails(id);
    }

}
