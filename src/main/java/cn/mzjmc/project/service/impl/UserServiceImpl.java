package cn.mzjmc.project.service.impl;

import cn.mzjmc.project.entity.User;
import cn.mzjmc.project.mapper.UserMapper;
import cn.mzjmc.project.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {

        userMapper.addUser(user);
    }

    @Override
    public List<Object> finAllUser() {
       return  userMapper.findUserAll();
    }
}
