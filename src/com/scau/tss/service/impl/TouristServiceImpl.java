package com.scau.tss.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scau.tss.dao.IUserDao;
import com.scau.tss.dao.TouristMapper;
import com.scau.tss.entity.Tourist;
import com.scau.tss.entity.TouristExample;
import com.scau.tss.entity.TouristExample.Criteria;
import com.scau.tss.entity.User;
import com.scau.tss.exception.CustomException;
import com.scau.tss.service.TouristService;

@Service("userService")
public class TouristServiceImpl implements TouristService {
  @Resource
  private IUserDao userDao;
  @Resource
  private TouristMapper touristMapper;
  @Override
  public User getUserById(int userId) throws Exception{
    // TODO Auto-generated method stub
    return this.userDao.selectByPrimaryKey(userId);
  }
@Override
/**
 * 账户注册
 */
@Transactional
public boolean enroll(Tourist tourist) throws Exception{
	TouristExample touristExample = new TouristExample();
	if(tourist.getRegisterType().equals("1"))       //邮箱注册
	{
		Criteria criteria = touristExample.createCriteria();
		criteria.andEmailEqualTo(tourist.getEmail());
		List<Tourist> listTourist = touristMapper.selectByExample(touristExample);
		if(listTourist.size()==0){                                //注册邮箱可用
			tourist.setDeleted((byte) 0);
			touristMapper.insertSelective(tourist);
			return true;
		}
		return false;
		//boolean result = touristMapper.
	}
	else                                         //手机号注册
	{
		Criteria criteria = touristExample.createCriteria();
		criteria.andPhoneNumberEqualTo(tourist.getPhoneNumber());
		List<Tourist> listTourist = touristMapper.selectByExample(touristExample);
		if(listTourist.size()==0){                                //注册手机号可用
			tourist.setDeleted((byte) 0);
			touristMapper.insertSelective(tourist);
			return true;
		}
		System.out.println(listTourist.size());
		return false;
	}
}
@Override
public boolean login(String username,String password) throws Exception {
	TouristExample touristExample = new TouristExample();
	Criteria criteria1 = touristExample.createCriteria();
	criteria1.andEmailEqualTo(username);
	criteria1.andAccountPasswordEqualTo(password);
	Criteria criteria2 = touristExample.createCriteria();
	criteria2.andPhoneNumberEqualTo(username);
	criteria2.andAccountPasswordEqualTo(password);
	touristExample.or(criteria2);
	List<Tourist> listTourist = touristMapper.selectByExample(touristExample);
	if(listTourist.size() == 0 ){
		throw new CustomException("用户名不存在或密码错误");
	}
	return true;
}

}
