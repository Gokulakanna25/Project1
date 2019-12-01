package org.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GetController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getmethod(ModelMap map)
	{
		map.addAttribute("title","Welcome to Controller");
		return "home";
	}
	@RequestMapping(value="/{user}",method=RequestMethod.GET)
	public String getmethodUpdate(@PathVariable("user") String user,ModelMap map)
	{
		map.addAttribute("title","Controller has been updated, Enjoy karo,");
		map.addAttribute("user", user);
		return "home";
	}

}
