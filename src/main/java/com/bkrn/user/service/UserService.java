package com.bkrn.user.service;

import java.util.List;

import com.bkrn.user.entity.BtUser;

public interface UserService {
	
	
	
	/**
	 * 查询所有用户
	 * @author lim
	 * @date 2018年1月24日
	 * @return List<BtUser>
	 */
	List<BtUser> findUserlist();
	
	
	/**
	 * 根据id查询单个用户
	 * @author lim
	 * @date 2018年1月24日
	 * @param id
	 * @return BtUser
	 */
	BtUser getUserById(int id);

}
