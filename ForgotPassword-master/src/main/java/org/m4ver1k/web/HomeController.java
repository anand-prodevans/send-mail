package org.m4ver1k.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import marcus.controller.MailService;
@Controller
public class HomeController {
	@Autowired
	private MailService mailService; 
	@RequestMapping(value="/")
	public String homePage()
	{
		return "index"; 
	}
	
	@RequestMapping(value="/forgotPassword")
	public String forgotPassword()
	{
		return "forgotPassword"; 
	}
	
	@RequestMapping(value="/forgetUsername")
	public String forgetUsername()
	{
		return "forgetUsername"; 
	}
	
	@RequestMapping(value="/resetPassword" , method=RequestMethod.POST)
	public String resetRequest(@RequestParam(value="email") String email)
	{
		//check if the email id is valid and registered with us.
		mailService.sendMail(email, email, email, email);
		return "checkMail";
	}
	
	@RequestMapping(value="/resetUsername" , method=RequestMethod.POST)
	public String resetRequest1(@RequestParam(value="name") String name,@RequestParam(value="email") String email,@RequestParam(value="subject") String subject,@RequestParam(value="msg") String msg)
	{
		//check if the email id is valid and registered with us.
		mailService.sendMail1(name, email, subject, msg);
		return "checkMail";
	}	
	
	@RequestMapping(value="/newPassword/{email}" )
	public String resetPassword(@PathVariable String email,Map<String,String> model)
	{
		//check if the email id is valid and registered with us.
		model.put("emailid", email);
		return "newPassword";
	}
	
	@RequestMapping(value="/newUsername/{email}" )
	public String resetUsername(@PathVariable String email,Map<String,String> model)
	{
		//check if the email id is valid and registered with us.
		model.put("emailid", email);
		return "newUsername";
	}
	
	@RequestMapping(value="/changedPasswd" , method=RequestMethod.POST)
	public String changedPasswd(ModelMap model)
	{
		//check if the email id is valid and registered with us.
		//model.put("emailid", email);
		return "changedPasswd";
	}

}
