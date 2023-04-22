package com.ashoikIt.frontOffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/signup")
	public String singupPage() {
		return "signup";
	}

	@GetMapping("/unlock")
	public String unlockPage() {
		return "unlock";
	}

	@GetMapping("/forgotPwd")
	public String forgotPwdPage() {
		return "forgotPwd";
	}
}
