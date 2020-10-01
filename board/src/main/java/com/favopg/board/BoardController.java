package com.favopg.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@GetMapping
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}

}
