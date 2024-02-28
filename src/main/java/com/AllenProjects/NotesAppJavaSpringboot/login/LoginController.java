package com.AllenProjects.NotesAppJavaSpringboot.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	
	private AuthenticationService authService;
	

	public LoginController(AuthenticationService authService) {
		super();
		this.authService = authService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authService.authentication(name, password)) {
			model.put("name", name);
			model.put("password", password);

			return "welcome";

		}
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}
}
