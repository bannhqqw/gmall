package com.sky.gmall.user.service;

import com.sky.gmall.user.bean.UmsMember;
import com.sky.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
