package com.tt.mymall.user.mapper;

import com.tt.mymall.user.bean.UmsMember;

import java.util.List;

public interface UserMapper{
    List<UmsMember> selectAllUsers();
}
