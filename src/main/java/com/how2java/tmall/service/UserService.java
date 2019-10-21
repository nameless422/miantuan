package com.how2java.tmall.service;

import com.how2java.tmall.mapper.UserMapper;
import com.how2java.tmall.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(int id);
    void update(User user);
    List<User> list();
}
