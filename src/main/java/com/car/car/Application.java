package com.car.car;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Application {

     @RequestMapping("/hello")
     public String home() {
     	return "index";
     }
}

