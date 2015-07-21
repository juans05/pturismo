package com.pturismo.service;

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;//MD5
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pturismo.bean.PersonaBean;
import com.pturismo.model.Persona;
import com.pturismo.model.Usuario;
import com.pturismo.util.DateUtil;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@PersistenceContext
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional
	public boolean login(Usuario usu, HttpSession session) {
		boolean resultado = false;
		try{
			Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.email =:email AND u.password =:password AND u.estado =:estado");
			q.setParameter("email", usu.getEmail());
	    	//String md5 = DigestUtils.md5Hex(usu.getPassword());
			q.setParameter("password", usu.getPassword());
			q.setParameter("estado", true);
			
			Usuario userResult = (Usuario) q.getSingleResult();
			
			session.setAttribute("email", userResult.getEmail());
			session.setAttribute("idUsuario", userResult.getIdUsuario());
			// es Valido
			session.setAttribute("isValid", true);
			resultado = true;
		}catch(NoResultException ex){
			resultado = false;
		}
		return resultado;
	}
	
	@Transactional
	public boolean registro(PersonaBean perbean) {
		boolean resultado = false;
		Persona persona = new Persona();
		Usuario usuario = new Usuario();
		try{
			usuario.setEmail(perbean.getEmail());
			usuario.setPassword(perbean.getPassword());
			usuario.setEstado("enabled");
			usuario.setFechaCreacion(DateUtil.currentTimestamp());
			em.persist(usuario);
			persona.setUsuario(usuario);
			persona.setNombre(perbean.getNombre());
			persona.setTelefono(perbean.getTelefono());	
			em.persist(persona);
			resultado = true;
		}catch(IllegalArgumentException e){
			System.out.println(e);
			resultado = false;
		}
		
		return resultado;
	}
}
