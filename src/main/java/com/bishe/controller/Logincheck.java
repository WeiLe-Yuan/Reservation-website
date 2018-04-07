package com.bishe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bishe.model.User;


@Controller
public class Logincheck {
	@RequestMapping(value = "/login")
    public String login(User user,Model model) {
		System.out.println(user.getname());
		System.out.println(user.getpassword());
		if(user.getpassword().equals("111")){
			return "falue";
		}
		else{
	        return "helloworld";
		}
        
         
    }
}
