package cl.bdly.controlador;

import cl.bdly.modelo.Pago;
import cl.bdly.repositorio.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/pagos")
public class CrearPagoController {

    @Autowired
    private PagoRepository pagoRepository;

    @GetMapping("/nuevopago")
    public String showCrearPagoForm() {
        return "crearpago";
    }

    @PostMapping("/crear")
    public String processCrearPago(
            @RequestParam("item") String item,
            @RequestParam("monto") Double monto,
            @RequestParam("fecha") String fechaStr) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha;
        try {
            fecha = sdf.parse(fechaStr);
        } catch (ParseException e) {
            // Maneje el error de formato de fecha aquí
            return "error";
        }

        // Cree un nuevo objeto Pago y establezca sus propiedades a partir de los parámetros del formulario
        Pago pago = new Pago();
        pago.setCliente(item);
        pago.setMonto(monto);
        pago.setFecha(fecha);

        // Guarde el objeto Pago en la base de datos utilizando el repositorio 'pagoRepository'
        pagoRepository.save(pago);

        // Redirija a la página adecuada (por ejemplo, una página de confirmación o la lista de pagos)
        return "redirect:/pagos/lista";
    }
}