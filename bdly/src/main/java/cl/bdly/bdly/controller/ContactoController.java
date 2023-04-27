package cl.bdly.bdly.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.bdly.dao.ContactoDao;
import cl.bdly.bdly.models.Contacto;

@Controller
public class ContactoController {
	
	private static final Logger logger = Logger.getLogger(ContactoController.class);
	
	@Autowired
	ContactoDao conDao;
	
	@RequestMapping(value="/contacto")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		logger.info("Se llama a ContactoController.contacto() para desplegar formulario de contacto");
		return new ModelAndView("contacto");
	}
	
	@RequestMapping(value="/enviarMsg", method = RequestMethod.POST)
	public ModelAndView enviaMensaje(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String nombres = request.getParameter("nombre");
		String apellidos = request.getParameter("apellido");
		String email = request.getParameter("email");
		int telefono = Integer.parseInt(request.getParameter("phone"));
		String mensaje = request.getParameter("mensaje");
		try {
			conDao.insertContacto(nombres, apellidos, email, telefono, mensaje);
			Contacto con = getCont(nombres, apellidos, email, telefono, mensaje);
			System.out.println(con);
			logger.info("ContactoController.enviaMensaje() Envia Mensaje a BD");
			return new ModelAndView("contacto");
		} catch (Exception e) {
			e.printStackTrace();
	        ModelAndView mav = new ModelAndView("contacto");
	        mav.addObject("message", "Error al enviar el mensaje");
	        logger.info("ContactoController.enviaMensaje(). Fallo envio de mensaje");
	        return mav;
		}
		
	}

	private Contacto getCont(String nombres, String apellidos, String email, int telefono, String mensaje) {
		Contacto con = new Contacto();
		con.setNombres(nombres);
		con.setApellidos(apellidos);
		con.setEmail(email);
		con.setTelefono(telefono);
		con.setMensaje(mensaje);
		
		return con;
	}

}