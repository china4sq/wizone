package com.wicloud.main.java.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wicloud.main.java.service.RealGateService;


@Controller
@RequestMapping(value = "/realgate")
public class RealGateWeb {
	@Autowired
	private RealGateService realgateService;
	
	@ResponseBody
	@RequestMapping(value = "/realgate/")
	public String realgate(HttpServletRequest request) {
		return realgateService.getRealgate();
	}
}
