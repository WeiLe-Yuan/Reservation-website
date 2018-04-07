package com.bishe.dao;

import com.bishe.model.User;

public interface UserMapper {

		int insert(User record);
		
		User selectUserByID(int id);
}
