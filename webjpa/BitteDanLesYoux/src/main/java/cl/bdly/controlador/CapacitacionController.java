package cl.bdly.controlador;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.modelo.Capacitacion;
import cl.bdly.servicio.CapacitacionService;

@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionController {
	
	@Autowired
	private CapacitacionService capaservice;
	
	/*
	 * @RequestMapping("/obtenercapacitaciones") public ModelAndView
	 * listarCapas(HttpServletResponse response) { ModelAndView mav = new
	 * ModelAndView("listarcapas"); return mav; }
	 */
	
	@GetMapping("/obtenercapacitaciones")
    public String listCustomers(Model theModel) {
        List <Capacitacion> capas = capaservice.obtenerCapacitciones();
        theModel.addAttribute("capacitaciones", capas);
        return "listarcapas";
    }
	

}
