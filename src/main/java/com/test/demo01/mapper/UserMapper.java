package com.test.demo01.mapper;

import com.test.demo01.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAll();
}
