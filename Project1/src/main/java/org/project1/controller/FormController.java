package org.project1.controller;

import java.util.Map;

import org.project1.service.UserService;
import org.project1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class FormController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public String formRoute()
	{
		return "registerpage";
	}

	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(User user)
	{
		userService.create(user);
		return "redirect:/details/"+user.getMobile();
	}
	
	@RequestMapping(value="/details/{mobile_num}", method=RequestMethod.GET)
	public String formRegister(@PathVariable("mobile_num") String mobile_num,User user, Map<String,Object> map)
	{
		user = userService.find(mobile_num);
		map.put("fname", user.getFname());
		map.put("lname", user.getLname());
		map.put("email", user.getEmail());
		map.put("mobile", user.getMobile());
		return "details";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Map<String,Object> map)
	{
		map.put("userLiat",userService.getAll());
		return "list";
	}
	
	@RequestMapping(value="/edit/{mobile_num}",method=RequestMethod.GET)
	public String edit(@PathVariable("mobile_num") String mobile_num,Map<String,Object> map)
	{
		User user = userService.find(mobile_num);
		map.put("user",user);
		return "edit";		
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(User user)
	{
		userService.update(user);
		return "redirect:/details/"+user.getMobile();
	}

	@RequestMapping(value="/delete/{mobile_num}", method=RequestMethod.GET)
	public String delete(@PathVariable("mobile_num") String mobile_num)
	{
		User user =	userService.find(mobile_num);
		userService.delete(user);
		return "redirect:/list";
	}

}
