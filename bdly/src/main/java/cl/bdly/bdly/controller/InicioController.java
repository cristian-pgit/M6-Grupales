package cl.bdly.bdly.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
	
	private Logger logger = Logger.getLogger(InicioController.class);
	
	@RequestMapping(value="/inicio")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		logger.info("Se llamó a Inicio.ModelAndView()");
		return new ModelAndView("inicio");
	}

}