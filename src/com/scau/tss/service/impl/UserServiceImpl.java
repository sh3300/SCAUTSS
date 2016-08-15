package com.scau.tss.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.scau.tss.dao.IUserDao;
import com.scau.tss.entity.User;
import com.scau.tss.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
  @Resource
  private IUserDao userDao;
  @Override
  public User getUserById(int userId) {
    // TODO Auto-generated method stub
    return this.userDao.selectByPrimaryKey(userId);
  }

}
