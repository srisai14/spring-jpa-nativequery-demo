package com.srisai.springjpanativequerydemo.service;

import com.srisai.springjpanativequerydemo.model.UserSearch;

import java.util.List;

public interface UserSearchService {

    public List<UserSearch> getSearchUsers(String keyword);
}
