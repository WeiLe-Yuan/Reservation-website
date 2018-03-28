package com.bishe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.*;

@Controller
public class Logincheck {
	@RequestMapping(value = "/login")
    public String login(HttpServletRequest req,HttpServletResponse resp,Model model) {
		String userpassword=req.getParameter("password");
		if(userpassword.equals("111")){
			return "falue";
		}
		else{
	        return "helloworld";
		}
        
         
    }
}
