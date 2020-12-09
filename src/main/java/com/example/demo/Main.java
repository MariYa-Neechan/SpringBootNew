package com.example.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//***下の文を使用するための事前準備***//
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller						
public class Main {
	@Autowired
	UserDataRepository repository;
	//Test
	@RequestMapping(value ="/test",method = RequestMethod.GET)	
	public ModelAndView indexGet(ModelAndView mv) {
		List<UserData> customers = repository.findAll();
		mv.addObject("customers", customers);
		mv.setViewName("test");
		List<Bbs> bbsUser = bbsRepository.findAll();
		System.out.println(bbsUser.get(0).getComment());

		return mv;
	}
	@RequestMapping(value ="/test",method = RequestMethod.POST)	
	public ModelAndView indexPost(@ModelAttribute("formModel") UserData userData,ModelAndView mv) {
		repository.saveAndFlush(userData);
		return new ModelAndView("redirect:/test");
	}
	
	
	//Day23_HW_JavaBBS
	@Autowired
	BbsRepository bbsRepository;
	@RequestMapping(value = "/bbs",method = RequestMethod.GET)
	public ModelAndView bbsGet(ModelAndView mv) {
		List<Bbs> bbsUser = bbsRepository.findAll();
		mv.addObject("bbsId",bbsUser);
		mv.setViewName("bbs");
		return mv;
	}
	@RequestMapping(value = "/bbs",method = RequestMethod.POST)
	public ModelAndView bbsPost(@ModelAttribute("formModel")Bbs bbsUser ,ModelAndView mv) {
		bbsRepository.saveAndFlush(bbsUser);
		return new ModelAndView("redirect:/bbs");
	}

}
