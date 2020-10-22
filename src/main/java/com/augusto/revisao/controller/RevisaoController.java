package com.augusto.revisao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("revisao")
public class RevisaoController {
	
	@RequestMapping("/")
	public String hello() {
		return "Teste";
	}
	
}
