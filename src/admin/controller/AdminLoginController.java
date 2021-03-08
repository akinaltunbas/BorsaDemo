package admin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import admin.service.LoginServiceImpl;
import formModel.LoginModel;

@Controller
@RequestMapping("/login")
public class AdminLoginController {
	
	@Autowired
	private LoginServiceImpl loginService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showLoginPage(@ModelAttribute("newLogin") LoginModel newLogin) {
		return "/loginPage";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String processLoginForm(HttpServletRequest request, @ModelAttribute("newLogin") LoginModel addedLogin) {

		System.out.println("LoginController#addedLogin "+addedLogin);
		int redirectValue;
		redirectValue=loginService.loginUsernameControl(addedLogin, request);
		
		if(redirectValue==1) {
			return "redirect:/admin/listShare";
		}
		else if(redirectValue==0) {
			return "redirect:/user/listShare";
		}

		
		return "/loginPage";
	}
	
	@RequestMapping(value="/logOut",method=RequestMethod.GET)
	public String logOutController(HttpServletRequest request) {
		loginService.logOut(request);
		
		return "redirect:/login";
	}

}
