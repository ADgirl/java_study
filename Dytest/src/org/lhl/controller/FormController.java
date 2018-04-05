package org.lhl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FormController {
	@RequestMapping(value="/{formName}")
	public String loginForm(@PathVariable String formName) {
		return formName;
	}
	
}
