package com.sai;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class LoginController1 {
	@RequestMapping("maly2")
	public String reg()
	{
		return "login";
	}
	
	@RequestMapping("maly3")
	public String regcal(@RequestParam String uname, @RequestParam String psw, Model m)
	{
		m.addAttribute("k1", uname);
		m.addAttribute("k2", psw);
		if(uname.equals("Malyadri") && psw.equals("Malyadri@90"))
		{
			String sresult="Welcome Your Login Sucessfully";
			m.addAttribute("k3", sresult);
		}
		else
		{
			String eresult="plase check user name and password";
			m.addAttribute("k3", eresult);
			
		}
		
		return "logincall";
	}



}
