package cl.bdly.bdly.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import cl.bdly.bdly.dao.ICapacitacionDao;
import cl.bdly.bdly.dao.IClienteDao;
import cl.bdly.bdly.models.Capacitacion;
import cl.bdly.bdly.models.Cliente;


@Controller
public class CapacitacionController {
	
	private static final Logger logger = Logger.getLogger(CapacitacionController.class);
	
	@Autowired
	ICapacitacionDao capaDao;
	
	@Autowired
	IClienteDao cliDao;
	
	/*
	 * @RequestMapping(value="/crearcapacitacion") public ModelAndView
	 * test(HttpServletResponse response) throws IOException{ return new
	 * ModelAndView("crearcapacitacion"); }
	 */
	
	@RequestMapping(value="/crearcapacitacion")
	public ModelAndView listarclientes() {
		List<Cliente> clientes = cliDao.getAllClientes();
		ModelAndView mav = new ModelAndView("crearcapacitacion");
		logger.info("Se llamó a CapacitacionController.listarclientes()."
				+ " Esto habilita que la lista de rut de clientes esten disponibles para la creacion de Capacitaciones");
		mav.addObject("clientes", clientes);
		return mav;
	}
	
	@RequestMapping(value="/creacapa", method = RequestMethod.POST)
	public ModelAndView crearCapa(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int idcapa = Integer.parseInt(request.getParameter("idCapacitacion"));
		int rutcliente = Integer.parseInt(request.getParameter("rutCliente"));
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		int duracion = Integer.parseInt(request.getParameter("duracion"));
		int cantAsist = Integer.parseInt(request.getParameter("cantAsist"));
		String nomCapa = request.getParameter("nomCapa");
		try {
			Capacitacion capa = new Capacitacion(idcapa, rutcliente, dia, hora, lugar, duracion, cantAsist, nomCapa);
			if(capaDao.crearCapacitacion(capa)==true) {
				System.out.println("Se ha creado la siguiente capacitacion: "+capa);
				logger.info("CapacitacionController.crearcapa() creo una capacitacion exitosamente");
				ModelAndView mav = new ModelAndView("crearcapacitacion");
		        mav.addObject("message", "Capacitacion creada Exitosamente");
		        return mav;
			} else {
				ModelAndView mav = new ModelAndView("crearcapacitacion");
		        mav.addObject("message", "Error al Crear la Capacitacion");
		        logger.info("Se llama a CapacitacionController.crearcapa() pero fallo al crearla");
		        return mav;
			}
		} catch (Exception e) {
			e.printStackTrace();
			ModelAndView mav = new ModelAndView("crearcapacitacion");
	        mav.addObject("message", "Error al Crear la Capacitacion");
	        logger.info("Se llama a CapacitacionController.crearcapa() pero fallo al crearla");
	        return mav;
		}
		
	}


}