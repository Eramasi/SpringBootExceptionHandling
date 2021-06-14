package com.SBExceptionHand.App.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	
	@RequestMapping("/date")
	public String displayDate(Model model)
	{
		model.addAttribute("DateMsg", "Today Date is ::"+new Date());
		
		String s=null;
		s.length();
		
		return "dateDisplay";
	}

}
