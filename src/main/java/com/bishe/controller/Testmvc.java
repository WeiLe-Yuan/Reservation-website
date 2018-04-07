package com.bishe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testmvc {
	@RequestMapping(value = "/test")
	public String testmvc(){
		return "testMVC";
	}
}
