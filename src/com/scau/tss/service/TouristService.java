package com.scau.tss.service;

import com.scau.tss.entity.Tourist;
import com.scau.tss.entity.User;

public interface TouristService {
  public User getUserById(int userId) throws Exception;
  public boolean enroll(Tourist tourist) throws Exception;
  public boolean login(String username,String password) throws Exception;
}