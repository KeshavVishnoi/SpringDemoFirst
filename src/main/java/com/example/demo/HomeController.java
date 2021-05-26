package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@CrossOrigin
    @RequestMapping("/")
    public String home(){
        System.out.print("hey in home page");
        return "index.html";
    

    }
    @RequestMapping("/home")
	public String set(){
		return "index.html";
	}

    
    
}







