package com.scau.tss.service;

import com.scau.tss.entity.Tourist;
import com.scau.tss.entity.User;

public interface TouristService {
  public User getUserById(int userId);
  public boolean enroll(Tourist tourist);
}