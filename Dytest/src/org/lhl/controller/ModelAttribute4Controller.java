package org.lhl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttribute4Controller {
	@RequestMapping(value="/login4")
	@ModelAttribute(value="username")
	public String login4() {
		return "admin";
	}
}
