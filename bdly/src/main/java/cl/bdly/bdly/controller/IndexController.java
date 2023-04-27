package cl.bdly.bdly.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	private static final Logger logger = Logger.getLogger(IndexController.class);
	
	@RequestMapping(value="/")
	public ModelAndView Index(HttpServletResponse response) throws IOException{
		logger.info("Se llama a Index.ModelAndView(). Despliega vista inicial ");
		return new ModelAndView("home");
	}

}
