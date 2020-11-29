package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
//***下の文を使用するための事前準備***//
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller						
public class Main {
	//Test
	@RequestMapping(value ="/test",method = RequestMethod.GET)	
	public ModelAndView indexGet(ModelAndView mv) {
		mv.addObject("name", "やまぐち");
		mv.addObject("age", "年齢");
		mv.addObject("height", "身長");
		mv.setViewName("test");
		return mv;
	}
	@RequestMapping(value ="/test",method = RequestMethod.POST)	
	public ModelAndView indexPost(ModelAndView mv,@RequestParam("nameVal")String name,
	@RequestParam("ageVal")String age, @RequestParam("heightVal")String height) {
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.addObject("height", height);
		mv.setViewName("test");
		return mv;	
	}
	

}
