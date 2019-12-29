package com.srisai.springjpanativequerydemo.repository;

import com.srisai.springjpanativequerydemo.model.UserSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserSearchRepository extends JpaRepository<UserSearch, Integer> {

    @Query(value ="select * from USER_SEARCH where FIRST_NAME like %?1% or LAST_NAME like %?1%" ,nativeQuery = true)
    public List<UserSearch> getUsersByKeyword(@Param("keyword") String keyword);
}
