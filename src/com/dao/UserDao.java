package com.dao;

import com.model.*;
public interface UserDao {

	 /**
    * 登陆用户验证
    * @param page
    * @return
    */
	public boolean isLogin(User user);

	
	
}
