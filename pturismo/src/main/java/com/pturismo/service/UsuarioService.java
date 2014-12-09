package com.pturismo.service;

import javax.servlet.http.HttpSession;

import com.pturismo.bean.PersonaBean;
import com.pturismo.model.Usuario;

public interface UsuarioService {

	boolean login(Usuario usu, HttpSession session);
	boolean registro(PersonaBean repb);
}
