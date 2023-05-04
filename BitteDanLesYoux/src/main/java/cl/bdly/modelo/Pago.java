package cl.bdly.modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Long idPago;

    @Column(name = "item_pago")
    private String item;
    
    @Column(name = "monto")
    private Double monto;

    @Column(name = "fecha_pago")
    private Date fecha;

    // Constructor vacío
    public Pago() {
    }

    // Constructor con parámetros
    public Pago(String item, Double monto, Date fecha) {
        this.item = item;
        this.monto = monto;
        this.fecha = fecha;
    }

    // Getters y setters
    public Long getIdPago() {
        return idPago;
    }

    public void setIdPago(Long idPago) {
        this.idPago = idPago;
    }

    public String getItem() {
        return item;
    }

    public void setCliente(String item) {
        this.item = item;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}