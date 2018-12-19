package com.kodir.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SecurityDemoApplication {
	
	@RequestMapping("/")
    @ResponseBody
    public String mainAction() {
        return "Hello World";
    }
	
	@RequestMapping("/loggeduser")
    @ResponseBody
    public String loggedUserAction() {
        return "Hello User";
    }

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}

}

