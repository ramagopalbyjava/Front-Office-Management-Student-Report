package com.ashoikIt.frontOffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnquiryController {

	@GetMapping("/dashBoard")
	public String dashBoard() {
		return "dashboard";
	}

	@GetMapping("/addEnquiry")
	public String AddEnquiryPage() {
		return "add-enquiry";
	}

	@GetMapping("/viewEnquiry")
	public String viewEnquiryPage() {
		return "view-enquiries";
	}

}
