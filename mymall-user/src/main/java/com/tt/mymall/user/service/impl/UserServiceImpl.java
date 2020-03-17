package com.tt.mymall.user.service.impl;

import com.tt.mymall.user.bean.UmsMember;
import com.tt.mymall.user.mapper.UserMapper;
import com.tt.mymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUsers() {
        List<UmsMember> umsMemberList= userMapper.selectAllUsers();
        return umsMemberList;
    }
}
