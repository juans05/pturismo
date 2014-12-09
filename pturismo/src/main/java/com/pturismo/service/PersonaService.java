package com.pturismo.service;

import javax.servlet.http.HttpSession;

import com.pturismo.bean.PersonaBean;
import com.pturismo.model.Persona;

public interface PersonaService {
	public PersonaBean getInformationPerfil(HttpSession request);
	public boolean editInformacionPerfil(PersonaBean perbean,HttpSession session);
}
