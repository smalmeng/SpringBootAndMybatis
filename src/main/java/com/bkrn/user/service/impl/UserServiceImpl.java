package com.bkrn.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bkrn.user.dao.BtUserMapper;
import com.bkrn.user.entity.BtUser;
import com.bkrn.user.entity.BtUserExample;
import com.bkrn.user.service.UserService;
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	
	
	@Autowired 
	BtUserMapper btUserMapper;
	

	@Override
	public List<BtUser> findUserlist() {
		
		BtUserExample example = new BtUserExample();
		example.createCriteria().andIdIsNotNull();
		List<BtUser> userList = btUserMapper.selectByExample(example);
		return userList;
	}


	@Override
	public BtUser getUserById(int id) {
		
		return btUserMapper.selectByPrimaryKey(id);
	}

}
