package cl.bdly.bdly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cl.bdly.bdly.dao.CapacitacionDao;
import cl.bdly.bdly.dao.ClienteDao;
import cl.bdly.bdly.models.Capacitacion;
import cl.bdly.bdly.models.Cliente;


@Controller
public class CapacitacionController {
	
	@Autowired
	CapacitacionDao capaDao;
	
	@Autowired
	ClienteDao cliDao;
	
	/*
	 * @RequestMapping(value="/crearcapacitacion") public ModelAndView
	 * test(HttpServletResponse response) throws IOException{ return new
	 * ModelAndView("crearcapacitacion"); }
	 */
	
	@RequestMapping(value="/crearcapacitacion")
	public ModelAndView listarCapacitaciones() {
		List<Cliente> clientes = cliDao.getAllClientes();
		ModelAndView mav = new ModelAndView("crearcapacitacion");
		mav.addObject("clientes", clientes);
		return mav;
	}
	
	@RequestMapping(value="/creacapa", method = RequestMethod.POST)
	public ModelAndView loginIn(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int idcapa = Integer.parseInt(request.getParameter("idCapacitacion"));
		int rutcliente = Integer.parseInt(request.getParameter("rutCliente"));
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		int duracion = Integer.parseInt(request.getParameter("duracion"));
		int cantAsist = Integer.parseInt(request.getParameter("cantAsist"));
		String nomCapa = request.getParameter("nomCapa");
		try {
			capaDao.insertCapacitacion(idcapa, rutcliente, dia, hora, lugar, duracion, cantAsist, nomCapa);
			Capacitacion capa = getCapa(idcapa, rutcliente, dia, hora, lugar, duracion, cantAsist, nomCapa);
			System.out.println("Se ha creado la siguiente capacitacion: "+capa);
			return new ModelAndView("crearcapacitacion");
		} catch (Exception e) {
			e.printStackTrace();
	        ModelAndView mav = new ModelAndView("crearcapacitacion");
	        mav.addObject("message", "Error al Crear la Capacitacion");
	        return mav;
		}
		
	}

	private Capacitacion getCapa(int idcapa, int rutcliente, String dia, String hora, String lugar, int duracion,
			int cantAsist, String nomCapa) {
		Capacitacion capa = new Capacitacion();
		capa.setIdCapacitacion(idcapa);
		capa.setRutCliente(rutcliente);
		capa.setDia(dia);
		capa.setHora(hora);
		capa.setLugar(lugar);
		capa.setDuracion(duracion);
		capa.setCantAsist(cantAsist);
		capa.setNomCapa(nomCapa);
		return capa;
	}

}