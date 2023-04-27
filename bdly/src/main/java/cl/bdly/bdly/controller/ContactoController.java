package cl.bdly.bdly.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactoController {
	private static final Logger logger = Logger.getLogger(ContactoController.class);
	
	@RequestMapping(value="/contacto")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		logger.info("Se llama a ContactoController.contacto() para desplegar formulario de contacto");
		return new ModelAndView("contacto");
	}

}