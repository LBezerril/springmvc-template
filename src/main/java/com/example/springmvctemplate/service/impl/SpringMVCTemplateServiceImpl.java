package com.example.springmvctemplate.service.impl;

import org.springframework.stereotype.Service;

import com.example.springmvctemplate.service.SpringMVCTemplateService;

@Service
public class SpringMVCTemplateServiceImpl implements SpringMVCTemplateService {

	@Override
	public String getMessage() {
		return "It works!";
	}
}
