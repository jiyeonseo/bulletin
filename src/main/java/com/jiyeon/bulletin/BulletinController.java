package com.jiyeon.bulletin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/list")
public class BulletinController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index() {
		System.out.println("d");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("bulletin");
		mav.addObject("test", "test");
		return mav;
		
	}
}
