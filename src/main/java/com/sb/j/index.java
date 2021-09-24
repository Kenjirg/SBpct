package com.sb.j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class index {

//	@GetMapping("/")
	public ModelAndView r() {
		return new ModelAndView("index");
	}
}
