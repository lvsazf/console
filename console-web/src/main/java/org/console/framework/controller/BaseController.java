package org.console.framework.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
	
	@Autowired
	HttpServletRequest request;
}
