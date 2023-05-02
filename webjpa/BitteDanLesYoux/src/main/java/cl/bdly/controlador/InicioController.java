package cl.bdly.controlador;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
	
	@RequestMapping("/")
	public ModelAndView home(HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("inicio");
	    return mav;
	}

}
