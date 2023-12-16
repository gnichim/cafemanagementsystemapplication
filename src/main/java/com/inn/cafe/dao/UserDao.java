package com.inn.cafe.dao;

import com.inn.cafe.POJO.User;
import com.inn.cafe.utils.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    User findEmailById(@Param("email") String email);

    List<UserWrapper> getAllUser();

}
