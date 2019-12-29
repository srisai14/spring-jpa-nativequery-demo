package com.srisai.springjpanativequerydemo.service;

import com.srisai.springjpanativequerydemo.model.UserSearch;
import com.srisai.springjpanativequerydemo.repository.UserSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSearchServiceImpl implements UserSearchService {

    @Autowired
    public UserSearchRepository userSearchRepository;

    @Override
    public List<UserSearch> getSearchUsers(String keyword) {
        return userSearchRepository.getUsersByKeyword( keyword );
    }
}
