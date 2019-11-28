package cn.mzjmc.project.mapper;

import cn.mzjmc.project.entity.User;

import java.util.List;

public interface UserMapper {

    void addUser(User user);

    List<Object> findUserAll();
}
