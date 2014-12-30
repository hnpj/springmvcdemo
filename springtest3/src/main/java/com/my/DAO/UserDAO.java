package com.my.DAO;

import com.my.xml.User;

public interface UserDAO {
	public  void insertUser(User user);
	public User getUserbyId(int  id) ;
	public User getUserbyIdandName(int id,String name  ) ;

}
