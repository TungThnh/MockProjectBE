package vn.com.fsoft.tgdd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	/////Login//////
	@GetMapping("/login")
	public ModelAndView loginPage(){
		return new ModelAndView("loginPage") ;
	}

	@RequestMapping(value = "/logout-successful", method = RequestMethod.GET)
	public String logoutSuccessfulPage() {
		return "redirect:/";
	}

}
