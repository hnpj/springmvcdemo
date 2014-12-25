package com.cn.myspring.controller; 
  
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.my.DAO.UserDAO;
import com.my.xml.User;
  
@Controller
@RequestMapping("/test/*")  // ��request����url 
public class TestController3 { 
   @Resource(name="userDAO")
	private UserDAO userDAO;
    @RequestMapping("login")  // ��request����url��ƴ�Ӻ�ȼ���/test3/login.do 
    public String testLogin(@RequestParam int id,@RequestParam String name) { 
    	User user=userDAO.getUserbyIdandName(id, name);
        if (user==null) { 
            return "loginError"; 
        } 
        return name+",weblcom loginSuccess"; 
    } 
    
}