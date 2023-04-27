package cl.bdly.bdly.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.bdly.dao.IUsuarioDao;
import cl.bdly.bdly.models.Usuario;



@Controller
public class LoginController {
	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private IUsuarioDao iUsuarioDao;
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView loginIn(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			Usuario user = iUsuarioDao.getUsuarioByUsernameAndPassword(username, password);
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			String perfil = user.getPerfil();
			session.setAttribute("perfil", perfil);
			logger.info("Se llama a LoginController.login(). Para remitir user y pass haciendo login");
			System.out.println("Se ha conectado: "+user.getUserName()+"  y su perfil es: "+perfil);
			return new ModelAndView("home");
		} catch (Exception e) {
			e.printStackTrace();
	        ModelAndView mav = new ModelAndView("home");
	        mav.addObject("message", "Nombre de usuario o password incorrecto");
	        return mav;
		}
		
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.POST)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws IOException{
	    HttpSession session = request.getSession();
	    System.out.println("Se ha Deslogueado: "+ session.getAttribute("username"));
	    session.removeAttribute("username");
	    session.removeAttribute("perfil");
	    logger.info("Se llama a LoginController.logout(). para cerrar sesion");
	    System.out.println("perfil actual:"+ session.getAttribute("perfil"));
	    return new ModelAndView("home");
	}

}
