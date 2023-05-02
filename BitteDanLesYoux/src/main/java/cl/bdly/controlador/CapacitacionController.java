package cl.bdly.controlador;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.modelo.Capacitacion;
import cl.bdly.modelo.Cliente;
import cl.bdly.servicio.CapacitacionService;
import cl.bdly.servicio.ClienteService;

@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionController {
	
	private static final Logger logger = Logger.getLogger(CapacitacionController.class);
	
	@Autowired
	private CapacitacionService capaservice;
	
	@Autowired
	private ClienteService cliService;
	
	/*
	 * @RequestMapping("/obtenercapacitaciones") public ModelAndView
	 * listarCapas(HttpServletResponse response) { ModelAndView mav = new
	 * ModelAndView("listarcapas"); return mav; }
	 */
	
	@GetMapping("/obtenercapacitaciones")
    public String listCapacitaciones(Model theModel) {
        List <Capacitacion> capas = capaservice.obtenerCapacitciones();
        theModel.addAttribute("capacitaciones", capas);
        return "listarcapas";
    }
	
	@GetMapping("/nuevacapa")
    public String nuevaCapacitacion(Model theModel) {
        List <Cliente> clientes = cliService.obtenerClientes();
        theModel.addAttribute("clientes", clientes);
        Capacitacion laCapacitacion = new Capacitacion();
        theModel.addAttribute("capacitacion", laCapacitacion);
        logger.info("Se llamó a CapacitacionController.listarclientes()."
				+ " Esto habilita que la lista de rut de clientes esten disponibles para la creacion de Capacitaciones");
        return "crearcapacitacion";
    }
	
	@PostMapping("/crearcapa")
	public String crearCapacitacion(@ModelAttribute("capacitacion") Capacitacion laCapacitacion) {
		capaservice.save(laCapacitacion);
		return "redirect:/capacitaciones/obtenercapacitaciones";
	}
	

}
