package com.srisai.springjpanativequerydemo.controller;

import com.srisai.springjpanativequerydemo.model.UserSearch;
import com.srisai.springjpanativequerydemo.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserSearchController {

    @Autowired
    UserSearchService userSearchService;

    @GetMapping("{keyword}")
    public HttpEntity<List<UserSearch>> getSearchUsers(@PathVariable String keyword) {

        return new ResponseEntity<>( userSearchService.getSearchUsers( keyword ), HttpStatus.OK);
    }
}
