package com.example.springmvctemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.springmvctemplate.service.SpringMVCTemplateService;

@Controller
public class SpringMVCTemplateController {

	@Autowired
	private SpringMVCTemplateService springMVCTemplateService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String message() {
		return springMVCTemplateService.getMessage();
	}

}
