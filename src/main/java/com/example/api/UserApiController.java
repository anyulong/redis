package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.RedisService;
import com.example.pojo.User;

@Controller
public class UserApiController {
	@Autowired
	RedisService rs;
	@RequestMapping("doadd")
	public String doAddUser(User user) {
		System.out.println(user);
		rs.saveUser(user);
		return "index";
	}
	@RequestMapping("show")
	public String doAddUser(Model model,int id) {
		//User user = rs.getUser(id);
		//model.addAttribute("user",user);
		return "index";
	}
	
	
}
