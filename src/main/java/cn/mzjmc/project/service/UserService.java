package cn.mzjmc.project.service;

import cn.mzjmc.project.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<Object> finAllUser();
}
