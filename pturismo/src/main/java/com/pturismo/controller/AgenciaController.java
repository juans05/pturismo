package com.pturismo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgenciaController {
	
	@RequestMapping("irMiAgencia")
	public String irMiAgencia() {
		return "agencia/agenciaMiAgencia";
	}
	
	

}
