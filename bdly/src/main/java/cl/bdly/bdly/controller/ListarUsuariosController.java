package cl.bdly.bdly.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.bdly.dao.UsuarioDao;
import cl.bdly.bdly.models.Usuario;

@Controller
public class ListarUsuariosController {
	
private static final Logger logger = Logger.getLogger(ListarCapaController.class);
	
	@Autowired
	private UsuarioDao userDao;
	
	@RequestMapping(value="/mostrarusuarios")
	public ModelAndView listarUsuarios() {
		List<Usuario> users = userDao.getAllUsuario();
		ModelAndView mav = new ModelAndView("listarusuarios");
		mav.addObject("usuarios", users);
		logger.info("Se llama a ListarUsuariosController.listarUsuarios(). Despliega los usuarios existentes desde DB");
		return mav;
	}

}
