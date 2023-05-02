package cl.bdly.controlador;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.bdly.modelo.Contacto;
import cl.bdly.servicio.ContactoService;

@Controller
@RequestMapping("/contacto")
public class ContactoController {
	
	private static final Logger logger = Logger.getLogger(ContactoController.class);
	
	@Autowired
	private ContactoService contactoService;
	
	@GetMapping("/nuevocontacto")
	public String nuevoContacto(Model theModel) {
		Contacto elContacto = new Contacto();
		theModel.addAttribute(elContacto);
		logger.info("Se llamó a ContactoController.nuevocontacto()."
				+ " Esto trae el formulario de contacto");
		return "contacto";
	}
	
	@PostMapping("/creacontacto")
	public String crearContacto(@ModelAttribute("contacto") Contacto contacto) {
		contactoService.save(contacto);
		System.out.println(contacto);
		logger.info("Se llamó a ContactoController.creacontacto()."
				+ " Esto trae el formulario de contacto");
		return "redirect:/contacto/nuevocontacto";
	}

}
