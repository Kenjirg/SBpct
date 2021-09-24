package com.sb.j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class hw {
	
//	@GetMapping("/hw")
	public ModelAndView hello() {
		return new ModelAndView("hw");
	}
}
